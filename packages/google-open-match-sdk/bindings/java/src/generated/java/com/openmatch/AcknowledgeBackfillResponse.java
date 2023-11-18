// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/frontend.proto

// Protobuf Java Version: 3.25.0
package com.openmatch;

/**
 * <pre>
 * BETA FEATURE WARNING: This Request message is not finalized and still subject
 * to possible change or removal.
 * </pre>
 *
 * Protobuf type {@code openmatch.AcknowledgeBackfillResponse}
 */
public final class AcknowledgeBackfillResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:openmatch.AcknowledgeBackfillResponse)
    AcknowledgeBackfillResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcknowledgeBackfillResponse.newBuilder() to construct.
  private AcknowledgeBackfillResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcknowledgeBackfillResponse() {
    tickets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcknowledgeBackfillResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.openmatch.AcknowledgeBackfillResponse.class, com.openmatch.AcknowledgeBackfillResponse.Builder.class);
  }

  private int bitField0_;
  public static final int BACKFILL_FIELD_NUMBER = 1;
  private com.openmatch.Backfill backfill_;
  /**
   * <pre>
   * The Backfill that was acknowledged.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   * @return Whether the backfill field is set.
   */
  @java.lang.Override
  public boolean hasBackfill() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The Backfill that was acknowledged.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   * @return The backfill.
   */
  @java.lang.Override
  public com.openmatch.Backfill getBackfill() {
    return backfill_ == null ? com.openmatch.Backfill.getDefaultInstance() : backfill_;
  }
  /**
   * <pre>
   * The Backfill that was acknowledged.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   */
  @java.lang.Override
  public com.openmatch.BackfillOrBuilder getBackfillOrBuilder() {
    return backfill_ == null ? com.openmatch.Backfill.getDefaultInstance() : backfill_;
  }

  public static final int TICKETS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.openmatch.Ticket> tickets_;
  /**
   * <pre>
   * All of the Tickets that were successfully assigned
   * </pre>
   *
   * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
   */
  @java.lang.Override
  public java.util.List<com.openmatch.Ticket> getTicketsList() {
    return tickets_;
  }
  /**
   * <pre>
   * All of the Tickets that were successfully assigned
   * </pre>
   *
   * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.openmatch.TicketOrBuilder> 
      getTicketsOrBuilderList() {
    return tickets_;
  }
  /**
   * <pre>
   * All of the Tickets that were successfully assigned
   * </pre>
   *
   * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
   */
  @java.lang.Override
  public int getTicketsCount() {
    return tickets_.size();
  }
  /**
   * <pre>
   * All of the Tickets that were successfully assigned
   * </pre>
   *
   * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
   */
  @java.lang.Override
  public com.openmatch.Ticket getTickets(int index) {
    return tickets_.get(index);
  }
  /**
   * <pre>
   * All of the Tickets that were successfully assigned
   * </pre>
   *
   * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
   */
  @java.lang.Override
  public com.openmatch.TicketOrBuilder getTicketsOrBuilder(
      int index) {
    return tickets_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getBackfill());
    }
    for (int i = 0; i < tickets_.size(); i++) {
      output.writeMessage(2, tickets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBackfill());
    }
    for (int i = 0; i < tickets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, tickets_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.openmatch.AcknowledgeBackfillResponse)) {
      return super.equals(obj);
    }
    com.openmatch.AcknowledgeBackfillResponse other = (com.openmatch.AcknowledgeBackfillResponse) obj;

    if (hasBackfill() != other.hasBackfill()) return false;
    if (hasBackfill()) {
      if (!getBackfill()
          .equals(other.getBackfill())) return false;
    }
    if (!getTicketsList()
        .equals(other.getTicketsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBackfill()) {
      hash = (37 * hash) + BACKFILL_FIELD_NUMBER;
      hash = (53 * hash) + getBackfill().hashCode();
    }
    if (getTicketsCount() > 0) {
      hash = (37 * hash) + TICKETS_FIELD_NUMBER;
      hash = (53 * hash) + getTicketsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.openmatch.AcknowledgeBackfillResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.openmatch.AcknowledgeBackfillResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.openmatch.AcknowledgeBackfillResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.openmatch.AcknowledgeBackfillResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * BETA FEATURE WARNING: This Request message is not finalized and still subject
   * to possible change or removal.
   * </pre>
   *
   * Protobuf type {@code openmatch.AcknowledgeBackfillResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:openmatch.AcknowledgeBackfillResponse)
      com.openmatch.AcknowledgeBackfillResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.openmatch.AcknowledgeBackfillResponse.class, com.openmatch.AcknowledgeBackfillResponse.Builder.class);
    }

    // Construct using com.openmatch.AcknowledgeBackfillResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBackfillFieldBuilder();
        getTicketsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      backfill_ = null;
      if (backfillBuilder_ != null) {
        backfillBuilder_.dispose();
        backfillBuilder_ = null;
      }
      if (ticketsBuilder_ == null) {
        tickets_ = java.util.Collections.emptyList();
      } else {
        tickets_ = null;
        ticketsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillResponse_descriptor;
    }

    @java.lang.Override
    public com.openmatch.AcknowledgeBackfillResponse getDefaultInstanceForType() {
      return com.openmatch.AcknowledgeBackfillResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.openmatch.AcknowledgeBackfillResponse build() {
      com.openmatch.AcknowledgeBackfillResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.openmatch.AcknowledgeBackfillResponse buildPartial() {
      com.openmatch.AcknowledgeBackfillResponse result = new com.openmatch.AcknowledgeBackfillResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.openmatch.AcknowledgeBackfillResponse result) {
      if (ticketsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          tickets_ = java.util.Collections.unmodifiableList(tickets_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tickets_ = tickets_;
      } else {
        result.tickets_ = ticketsBuilder_.build();
      }
    }

    private void buildPartial0(com.openmatch.AcknowledgeBackfillResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backfill_ = backfillBuilder_ == null
            ? backfill_
            : backfillBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.openmatch.AcknowledgeBackfillResponse) {
        return mergeFrom((com.openmatch.AcknowledgeBackfillResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.openmatch.AcknowledgeBackfillResponse other) {
      if (other == com.openmatch.AcknowledgeBackfillResponse.getDefaultInstance()) return this;
      if (other.hasBackfill()) {
        mergeBackfill(other.getBackfill());
      }
      if (ticketsBuilder_ == null) {
        if (!other.tickets_.isEmpty()) {
          if (tickets_.isEmpty()) {
            tickets_ = other.tickets_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTicketsIsMutable();
            tickets_.addAll(other.tickets_);
          }
          onChanged();
        }
      } else {
        if (!other.tickets_.isEmpty()) {
          if (ticketsBuilder_.isEmpty()) {
            ticketsBuilder_.dispose();
            ticketsBuilder_ = null;
            tickets_ = other.tickets_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ticketsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTicketsFieldBuilder() : null;
          } else {
            ticketsBuilder_.addAllMessages(other.tickets_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getBackfillFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.openmatch.Ticket m =
                  input.readMessage(
                      com.openmatch.Ticket.parser(),
                      extensionRegistry);
              if (ticketsBuilder_ == null) {
                ensureTicketsIsMutable();
                tickets_.add(m);
              } else {
                ticketsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.openmatch.Backfill backfill_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.openmatch.Backfill, com.openmatch.Backfill.Builder, com.openmatch.BackfillOrBuilder> backfillBuilder_;
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     * @return Whether the backfill field is set.
     */
    public boolean hasBackfill() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     * @return The backfill.
     */
    public com.openmatch.Backfill getBackfill() {
      if (backfillBuilder_ == null) {
        return backfill_ == null ? com.openmatch.Backfill.getDefaultInstance() : backfill_;
      } else {
        return backfillBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder setBackfill(com.openmatch.Backfill value) {
      if (backfillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backfill_ = value;
      } else {
        backfillBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder setBackfill(
        com.openmatch.Backfill.Builder builderForValue) {
      if (backfillBuilder_ == null) {
        backfill_ = builderForValue.build();
      } else {
        backfillBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder mergeBackfill(com.openmatch.Backfill value) {
      if (backfillBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          backfill_ != null &&
          backfill_ != com.openmatch.Backfill.getDefaultInstance()) {
          getBackfillBuilder().mergeFrom(value);
        } else {
          backfill_ = value;
        }
      } else {
        backfillBuilder_.mergeFrom(value);
      }
      if (backfill_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder clearBackfill() {
      bitField0_ = (bitField0_ & ~0x00000001);
      backfill_ = null;
      if (backfillBuilder_ != null) {
        backfillBuilder_.dispose();
        backfillBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public com.openmatch.Backfill.Builder getBackfillBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBackfillFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    public com.openmatch.BackfillOrBuilder getBackfillOrBuilder() {
      if (backfillBuilder_ != null) {
        return backfillBuilder_.getMessageOrBuilder();
      } else {
        return backfill_ == null ?
            com.openmatch.Backfill.getDefaultInstance() : backfill_;
      }
    }
    /**
     * <pre>
     * The Backfill that was acknowledged.
     * </pre>
     *
     * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.openmatch.Backfill, com.openmatch.Backfill.Builder, com.openmatch.BackfillOrBuilder> 
        getBackfillFieldBuilder() {
      if (backfillBuilder_ == null) {
        backfillBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.openmatch.Backfill, com.openmatch.Backfill.Builder, com.openmatch.BackfillOrBuilder>(
                getBackfill(),
                getParentForChildren(),
                isClean());
        backfill_ = null;
      }
      return backfillBuilder_;
    }

    private java.util.List<com.openmatch.Ticket> tickets_ =
      java.util.Collections.emptyList();
    private void ensureTicketsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        tickets_ = new java.util.ArrayList<com.openmatch.Ticket>(tickets_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.openmatch.Ticket, com.openmatch.Ticket.Builder, com.openmatch.TicketOrBuilder> ticketsBuilder_;

    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public java.util.List<com.openmatch.Ticket> getTicketsList() {
      if (ticketsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tickets_);
      } else {
        return ticketsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public int getTicketsCount() {
      if (ticketsBuilder_ == null) {
        return tickets_.size();
      } else {
        return ticketsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public com.openmatch.Ticket getTickets(int index) {
      if (ticketsBuilder_ == null) {
        return tickets_.get(index);
      } else {
        return ticketsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder setTickets(
        int index, com.openmatch.Ticket value) {
      if (ticketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketsIsMutable();
        tickets_.set(index, value);
        onChanged();
      } else {
        ticketsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder setTickets(
        int index, com.openmatch.Ticket.Builder builderForValue) {
      if (ticketsBuilder_ == null) {
        ensureTicketsIsMutable();
        tickets_.set(index, builderForValue.build());
        onChanged();
      } else {
        ticketsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder addTickets(com.openmatch.Ticket value) {
      if (ticketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketsIsMutable();
        tickets_.add(value);
        onChanged();
      } else {
        ticketsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder addTickets(
        int index, com.openmatch.Ticket value) {
      if (ticketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketsIsMutable();
        tickets_.add(index, value);
        onChanged();
      } else {
        ticketsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder addTickets(
        com.openmatch.Ticket.Builder builderForValue) {
      if (ticketsBuilder_ == null) {
        ensureTicketsIsMutable();
        tickets_.add(builderForValue.build());
        onChanged();
      } else {
        ticketsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder addTickets(
        int index, com.openmatch.Ticket.Builder builderForValue) {
      if (ticketsBuilder_ == null) {
        ensureTicketsIsMutable();
        tickets_.add(index, builderForValue.build());
        onChanged();
      } else {
        ticketsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder addAllTickets(
        java.lang.Iterable<? extends com.openmatch.Ticket> values) {
      if (ticketsBuilder_ == null) {
        ensureTicketsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tickets_);
        onChanged();
      } else {
        ticketsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder clearTickets() {
      if (ticketsBuilder_ == null) {
        tickets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ticketsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public Builder removeTickets(int index) {
      if (ticketsBuilder_ == null) {
        ensureTicketsIsMutable();
        tickets_.remove(index);
        onChanged();
      } else {
        ticketsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public com.openmatch.Ticket.Builder getTicketsBuilder(
        int index) {
      return getTicketsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public com.openmatch.TicketOrBuilder getTicketsOrBuilder(
        int index) {
      if (ticketsBuilder_ == null) {
        return tickets_.get(index);  } else {
        return ticketsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public java.util.List<? extends com.openmatch.TicketOrBuilder> 
         getTicketsOrBuilderList() {
      if (ticketsBuilder_ != null) {
        return ticketsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tickets_);
      }
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public com.openmatch.Ticket.Builder addTicketsBuilder() {
      return getTicketsFieldBuilder().addBuilder(
          com.openmatch.Ticket.getDefaultInstance());
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public com.openmatch.Ticket.Builder addTicketsBuilder(
        int index) {
      return getTicketsFieldBuilder().addBuilder(
          index, com.openmatch.Ticket.getDefaultInstance());
    }
    /**
     * <pre>
     * All of the Tickets that were successfully assigned
     * </pre>
     *
     * <code>repeated .openmatch.Ticket tickets = 2 [json_name = "tickets"];</code>
     */
    public java.util.List<com.openmatch.Ticket.Builder> 
         getTicketsBuilderList() {
      return getTicketsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.openmatch.Ticket, com.openmatch.Ticket.Builder, com.openmatch.TicketOrBuilder> 
        getTicketsFieldBuilder() {
      if (ticketsBuilder_ == null) {
        ticketsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.openmatch.Ticket, com.openmatch.Ticket.Builder, com.openmatch.TicketOrBuilder>(
                tickets_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        tickets_ = null;
      }
      return ticketsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:openmatch.AcknowledgeBackfillResponse)
  }

  // @@protoc_insertion_point(class_scope:openmatch.AcknowledgeBackfillResponse)
  private static final com.openmatch.AcknowledgeBackfillResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.openmatch.AcknowledgeBackfillResponse();
  }

  public static com.openmatch.AcknowledgeBackfillResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeBackfillResponse>
      PARSER = new com.google.protobuf.AbstractParser<AcknowledgeBackfillResponse>() {
    @java.lang.Override
    public AcknowledgeBackfillResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AcknowledgeBackfillResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeBackfillResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.openmatch.AcknowledgeBackfillResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
