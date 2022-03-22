/*
Copyright 2022.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package controllers

import (
	"context"

	appsv1 "k8s.io/api/apps/v1"
	corev1 "k8s.io/api/core/v1"
	k8serrors "k8s.io/apimachinery/pkg/api/errors"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	"k8s.io/apimachinery/pkg/runtime"
	"k8s.io/apimachinery/pkg/types"
	ctrl "sigs.k8s.io/controller-runtime"
	"sigs.k8s.io/controller-runtime/pkg/client"
	"sigs.k8s.io/controller-runtime/pkg/log"

	shulkermciov1alpha1 "shulkermc.io/m/v2/api/v1alpha1"
	resource "shulkermc.io/m/v2/internal/resource/server"
)

const randomIdDictionnary = "abcdefghijklmnopqrstuvwxyz0123456789"

// MinecraftServerDeploymentReconciler reconciles a MinecraftServerDeployment object
type MinecraftServerDeploymentReconciler struct {
	client.Client
	Scheme *runtime.Scheme
}

//+kubebuilder:rbac:groups="",resources=services,verbs=get;list;watch;create;update
//+kubebuilder:rbac:groups="apps",resources=deployments,verbs=get;list;watch;create;update;delete
//+kubebuilder:rbac:groups=shulkermc.io,resources=minecraftserverdeployments,verbs=get;list;watch;create;update;patch;delete
//+kubebuilder:rbac:groups=shulkermc.io,resources=minecraftserverdeployments/status,verbs=get;update;patch
//+kubebuilder:rbac:groups=shulkermc.io,resources=minecraftserverdeployments/finalizers,verbs=update

func (r *MinecraftServerDeploymentReconciler) Reconcile(ctx context.Context, req ctrl.Request) (ctrl.Result, error) {
	logger := log.FromContext(ctx)

	minecraftServerDeployment, err := r.getMinecraftServerDeployment(ctx, req.NamespacedName)

	if client.IgnoreNotFound(err) != nil {
		return ctrl.Result{}, err
	} else if k8serrors.IsNotFound(err) {
		// No need to requeue if the resource no longer exists
		return ctrl.Result{}, nil
	}

	// Check if the resource has been marked for deletion
	if !minecraftServerDeployment.ObjectMeta.DeletionTimestamp.IsZero() {
		logger.Info("Deleting")
		return ctrl.Result{}, r.prepareForDeletion(ctx, minecraftServerDeployment)
	}

	if err := r.addFinalizerIfNeeded(ctx, minecraftServerDeployment); err != nil {
		return ctrl.Result{}, err
	}

	minecraftCluster := &shulkermciov1alpha1.MinecraftCluster{}
	err = r.Get(ctx, types.NamespacedName{
		Namespace: minecraftServerDeployment.Namespace,
		Name:      minecraftServerDeployment.Spec.ClusterRef.Name,
	}, minecraftCluster)
	if err != nil {
		return ctrl.Result{}, err
	}

	resourceBuilder := resource.MinecraftServerDeploymentResourceBuilder{
		Instance: minecraftServerDeployment,
		Cluster:  minecraftCluster,
		Scheme:   r.Scheme,
	}
	builders, dirtyBuilders := resourceBuilder.ResourceBuilders()

	err = ReconcileWithResourceBuilders(r.Client, ctx, builders, dirtyBuilders)
	if err != nil {
		return ctrl.Result{}, err
	}

	deployment := appsv1.Deployment{}
	err = r.Get(ctx, client.ObjectKey{
		Namespace: minecraftServerDeployment.Namespace,
		Name:      resourceBuilder.GetDeploymentName(),
	}, &deployment)
	if err != nil && !k8serrors.IsNotFound(err) {
		return ctrl.Result{}, err
	}

	if err == nil {
		selector, err := metav1.LabelSelectorAsSelector(resourceBuilder.GetPodSelector())
		if err != nil {
			return ctrl.Result{}, err
		}

		minecraftServerDeployment.Status.Replicas = int32(deployment.Status.Replicas)
		minecraftServerDeployment.Status.AvailableReplicas = int32(deployment.Status.AvailableReplicas)
		minecraftServerDeployment.Status.UnavailableReplicas = int32(deployment.Status.UnavailableReplicas)
		minecraftServerDeployment.Status.Selector = selector.String()

		for _, condition := range deployment.Status.Conditions {
			if condition.Type == appsv1.DeploymentAvailable {
				minecraftServerDeployment.Status.SetCondition(shulkermciov1alpha1.MinecraftServerDeploymentAvailableCondition, metav1.ConditionStatus(condition.Status), condition.Reason, condition.Message)
			} else if condition.Type == appsv1.DeploymentProgressing {
				minecraftServerDeployment.Status.SetCondition(shulkermciov1alpha1.MinecraftServerDeploymentProgressingCondition, metav1.ConditionStatus(condition.Status), condition.Reason, condition.Message)
			}
		}

		if minecraftServerDeployment.Status.AvailableReplicas > 0 {
			minecraftServerDeployment.Status.SetCondition(shulkermciov1alpha1.MinecraftServerDeploymentReadyCondition, metav1.ConditionTrue, "Ready", "Proxy is ready")
		} else {
			minecraftServerDeployment.Status.SetCondition(shulkermciov1alpha1.MinecraftServerDeploymentReadyCondition, metav1.ConditionFalse, "NotReady", "Proxy is not ready")
		}
	} else {
		minecraftServerDeployment.Status.SetCondition(shulkermciov1alpha1.MinecraftServerDeploymentReadyCondition, metav1.ConditionFalse, "NotReady", "Proxy is not ready")
	}

	return ctrl.Result{}, r.Status().Update(ctx, minecraftServerDeployment)
}

func (r *MinecraftServerDeploymentReconciler) getMinecraftServerDeployment(ctx context.Context, namespacedName types.NamespacedName) (*shulkermciov1alpha1.MinecraftServerDeployment, error) {
	minecraftServerDeploymentInstance := &shulkermciov1alpha1.MinecraftServerDeployment{}
	err := r.Get(ctx, namespacedName, minecraftServerDeploymentInstance)
	return minecraftServerDeploymentInstance, err
}

func (r *MinecraftServerDeploymentReconciler) SetupWithManager(mgr ctrl.Manager) error {
	err := mgr.GetFieldIndexer().IndexField(context.Background(), &shulkermciov1alpha1.MinecraftServerDeployment{}, ".spec.minecraftClusterRef.name", func(object client.Object) []string {
		minecraftServerDeployment := object.(*shulkermciov1alpha1.MinecraftServerDeployment)
		return []string{minecraftServerDeployment.Spec.ClusterRef.Name}
	})

	if err != nil {
		return err
	}

	return ctrl.NewControllerManagedBy(mgr).
		For(&shulkermciov1alpha1.MinecraftServerDeployment{}).
		Owns(&appsv1.Deployment{}).
		Owns(&corev1.ConfigMap{}).
		Owns(&corev1.Secret{}).
		Complete(r)
}