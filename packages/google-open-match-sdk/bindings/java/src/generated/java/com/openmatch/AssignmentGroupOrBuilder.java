// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/backend.proto

// Protobuf Java Version: 3.25.0
package com.openmatch;

public interface AssignmentGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:openmatch.AssignmentGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @return A list containing the ticketIds.
   */
  java.util.List<java.lang.String>
      getTicketIdsList();
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @return The count of ticketIds.
   */
  int getTicketIdsCount();
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @param index The index of the element to return.
   * @return The ticketIds at the given index.
   */
  java.lang.String getTicketIds(int index);
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ticketIds at the given index.
   */
  com.google.protobuf.ByteString
      getTicketIdsBytes(int index);

  /**
   * <pre>
   * An Assignment specifies game connection related information to be associated with the TicketIds.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   * @return Whether the assignment field is set.
   */
  boolean hasAssignment();
  /**
   * <pre>
   * An Assignment specifies game connection related information to be associated with the TicketIds.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   * @return The assignment.
   */
  com.openmatch.Assignment getAssignment();
  /**
   * <pre>
   * An Assignment specifies game connection related information to be associated with the TicketIds.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   */
  com.openmatch.AssignmentOrBuilder getAssignmentOrBuilder();
}