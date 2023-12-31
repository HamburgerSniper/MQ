// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

/**
 * Protobuf type {@code GetMessageFromStorerResponse}
 */
public final class GetMessageFromStorerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetMessageFromStorerResponse)
    GetMessageFromStorerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMessageFromStorerResponse.newBuilder() to construct.
  private GetMessageFromStorerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMessageFromStorerResponse() {
    res_ = "";
    message_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMessageFromStorerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.catmq.protocol.service.Service.internal_static_GetMessageFromStorerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.catmq.protocol.service.Service.internal_static_GetMessageFromStorerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.catmq.protocol.service.GetMessageFromStorerResponse.class, org.catmq.protocol.service.GetMessageFromStorerResponse.Builder.class);
  }

  public static final int ACK_FIELD_NUMBER = 1;
  private boolean ack_;
  /**
   * <code>bool ack = 1;</code>
   * @return The ack.
   */
  @java.lang.Override
  public boolean getAck() {
    return ack_;
  }

  public static final int RES_FIELD_NUMBER = 2;
  private volatile java.lang.Object res_;
  /**
   * <code>string res = 2;</code>
   * @return The res.
   */
  @java.lang.Override
  public java.lang.String getRes() {
    java.lang.Object ref = res_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      res_ = s;
      return s;
    }
  }
  /**
   * <code>string res = 2;</code>
   * @return The bytes for res.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResBytes() {
    java.lang.Object ref = res_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      res_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private org.catmq.protocol.definition.Status status_;
  /**
   * <code>.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public org.catmq.protocol.definition.Status getStatus() {
    return status_ == null ? org.catmq.protocol.definition.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.Status status = 3;</code>
   */
  @java.lang.Override
  public org.catmq.protocol.definition.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private java.util.List<org.catmq.protocol.definition.NumberedMessage> message_;
  /**
   * <code>repeated .NumberedMessage message = 4;</code>
   */
  @java.lang.Override
  public java.util.List<org.catmq.protocol.definition.NumberedMessage> getMessageList() {
    return message_;
  }
  /**
   * <code>repeated .NumberedMessage message = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.catmq.protocol.definition.NumberedMessageOrBuilder> 
      getMessageOrBuilderList() {
    return message_;
  }
  /**
   * <code>repeated .NumberedMessage message = 4;</code>
   */
  @java.lang.Override
  public int getMessageCount() {
    return message_.size();
  }
  /**
   * <code>repeated .NumberedMessage message = 4;</code>
   */
  @java.lang.Override
  public org.catmq.protocol.definition.NumberedMessage getMessage(int index) {
    return message_.get(index);
  }
  /**
   * <code>repeated .NumberedMessage message = 4;</code>
   */
  @java.lang.Override
  public org.catmq.protocol.definition.NumberedMessageOrBuilder getMessageOrBuilder(
      int index) {
    return message_.get(index);
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
    if (ack_ != false) {
      output.writeBool(1, ack_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(res_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, res_);
    }
    if (status_ != null) {
      output.writeMessage(3, getStatus());
    }
    for (int i = 0; i < message_.size(); i++) {
      output.writeMessage(4, message_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ack_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ack_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(res_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, res_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
    }
    for (int i = 0; i < message_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, message_.get(i));
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
    if (!(obj instanceof org.catmq.protocol.service.GetMessageFromStorerResponse)) {
      return super.equals(obj);
    }
    org.catmq.protocol.service.GetMessageFromStorerResponse other = (org.catmq.protocol.service.GetMessageFromStorerResponse) obj;

    if (getAck()
        != other.getAck()) return false;
    if (!getRes()
        .equals(other.getRes())) return false;
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getMessageList()
        .equals(other.getMessageList())) return false;
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
    hash = (37 * hash) + ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAck());
    hash = (37 * hash) + RES_FIELD_NUMBER;
    hash = (53 * hash) + getRes().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (getMessageCount() > 0) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromStorerResponse parseFrom(
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
  public static Builder newBuilder(org.catmq.protocol.service.GetMessageFromStorerResponse prototype) {
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
   * Protobuf type {@code GetMessageFromStorerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetMessageFromStorerResponse)
      org.catmq.protocol.service.GetMessageFromStorerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromStorerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromStorerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.catmq.protocol.service.GetMessageFromStorerResponse.class, org.catmq.protocol.service.GetMessageFromStorerResponse.Builder.class);
    }

    // Construct using org.catmq.protocol.service.GetMessageFromStorerResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ack_ = false;

      res_ = "";

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (messageBuilder_ == null) {
        message_ = java.util.Collections.emptyList();
      } else {
        message_ = null;
        messageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromStorerResponse_descriptor;
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromStorerResponse getDefaultInstanceForType() {
      return org.catmq.protocol.service.GetMessageFromStorerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromStorerResponse build() {
      org.catmq.protocol.service.GetMessageFromStorerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromStorerResponse buildPartial() {
      org.catmq.protocol.service.GetMessageFromStorerResponse result = new org.catmq.protocol.service.GetMessageFromStorerResponse(this);
      int from_bitField0_ = bitField0_;
      result.ack_ = ack_;
      result.res_ = res_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          message_ = java.util.Collections.unmodifiableList(message_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof org.catmq.protocol.service.GetMessageFromStorerResponse) {
        return mergeFrom((org.catmq.protocol.service.GetMessageFromStorerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.catmq.protocol.service.GetMessageFromStorerResponse other) {
      if (other == org.catmq.protocol.service.GetMessageFromStorerResponse.getDefaultInstance()) return this;
      if (other.getAck() != false) {
        setAck(other.getAck());
      }
      if (!other.getRes().isEmpty()) {
        res_ = other.res_;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (messageBuilder_ == null) {
        if (!other.message_.isEmpty()) {
          if (message_.isEmpty()) {
            message_ = other.message_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessageIsMutable();
            message_.addAll(other.message_);
          }
          onChanged();
        }
      } else {
        if (!other.message_.isEmpty()) {
          if (messageBuilder_.isEmpty()) {
            messageBuilder_.dispose();
            messageBuilder_ = null;
            message_ = other.message_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messageBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessageFieldBuilder() : null;
          } else {
            messageBuilder_.addAllMessages(other.message_);
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
            case 8: {
              ack_ = input.readBool();

              break;
            } // case 8
            case 18: {
              res_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              org.catmq.protocol.definition.NumberedMessage m =
                  input.readMessage(
                      org.catmq.protocol.definition.NumberedMessage.parser(),
                      extensionRegistry);
              if (messageBuilder_ == null) {
                ensureMessageIsMutable();
                message_.add(m);
              } else {
                messageBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private boolean ack_ ;
    /**
     * <code>bool ack = 1;</code>
     * @return The ack.
     */
    @java.lang.Override
    public boolean getAck() {
      return ack_;
    }
    /**
     * <code>bool ack = 1;</code>
     * @param value The ack to set.
     * @return This builder for chaining.
     */
    public Builder setAck(boolean value) {
      
      ack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ack = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAck() {
      
      ack_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object res_ = "";
    /**
     * <code>string res = 2;</code>
     * @return The res.
     */
    public java.lang.String getRes() {
      java.lang.Object ref = res_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        res_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string res = 2;</code>
     * @return The bytes for res.
     */
    public com.google.protobuf.ByteString
        getResBytes() {
      java.lang.Object ref = res_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        res_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string res = 2;</code>
     * @param value The res to set.
     * @return This builder for chaining.
     */
    public Builder setRes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      res_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string res = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRes() {
      
      res_ = getDefaultInstance().getRes();
      onChanged();
      return this;
    }
    /**
     * <code>string res = 2;</code>
     * @param value The bytes for res to set.
     * @return This builder for chaining.
     */
    public Builder setResBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      res_ = value;
      onChanged();
      return this;
    }

    private org.catmq.protocol.definition.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.catmq.protocol.definition.Status, org.catmq.protocol.definition.Status.Builder, org.catmq.protocol.definition.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.Status status = 3;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.Status status = 3;</code>
     * @return The status.
     */
    public org.catmq.protocol.definition.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? org.catmq.protocol.definition.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public Builder setStatus(org.catmq.protocol.definition.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public Builder setStatus(
        org.catmq.protocol.definition.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public Builder mergeStatus(org.catmq.protocol.definition.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            org.catmq.protocol.definition.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public org.catmq.protocol.definition.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.Status status = 3;</code>
     */
    public org.catmq.protocol.definition.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            org.catmq.protocol.definition.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.Status status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.catmq.protocol.definition.Status, org.catmq.protocol.definition.Status.Builder, org.catmq.protocol.definition.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.catmq.protocol.definition.Status, org.catmq.protocol.definition.Status.Builder, org.catmq.protocol.definition.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.util.List<org.catmq.protocol.definition.NumberedMessage> message_ =
      java.util.Collections.emptyList();
    private void ensureMessageIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        message_ = new java.util.ArrayList<org.catmq.protocol.definition.NumberedMessage>(message_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.catmq.protocol.definition.NumberedMessage, org.catmq.protocol.definition.NumberedMessage.Builder, org.catmq.protocol.definition.NumberedMessageOrBuilder> messageBuilder_;

    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public java.util.List<org.catmq.protocol.definition.NumberedMessage> getMessageList() {
      if (messageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(message_);
      } else {
        return messageBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public int getMessageCount() {
      if (messageBuilder_ == null) {
        return message_.size();
      } else {
        return messageBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public org.catmq.protocol.definition.NumberedMessage getMessage(int index) {
      if (messageBuilder_ == null) {
        return message_.get(index);
      } else {
        return messageBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder setMessage(
        int index, org.catmq.protocol.definition.NumberedMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageIsMutable();
        message_.set(index, value);
        onChanged();
      } else {
        messageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder setMessage(
        int index, org.catmq.protocol.definition.NumberedMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        ensureMessageIsMutable();
        message_.set(index, builderForValue.build());
        onChanged();
      } else {
        messageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder addMessage(org.catmq.protocol.definition.NumberedMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageIsMutable();
        message_.add(value);
        onChanged();
      } else {
        messageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder addMessage(
        int index, org.catmq.protocol.definition.NumberedMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageIsMutable();
        message_.add(index, value);
        onChanged();
      } else {
        messageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder addMessage(
        org.catmq.protocol.definition.NumberedMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        ensureMessageIsMutable();
        message_.add(builderForValue.build());
        onChanged();
      } else {
        messageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder addMessage(
        int index, org.catmq.protocol.definition.NumberedMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        ensureMessageIsMutable();
        message_.add(index, builderForValue.build());
        onChanged();
      } else {
        messageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder addAllMessage(
        java.lang.Iterable<? extends org.catmq.protocol.definition.NumberedMessage> values) {
      if (messageBuilder_ == null) {
        ensureMessageIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, message_);
        onChanged();
      } else {
        messageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public Builder removeMessage(int index) {
      if (messageBuilder_ == null) {
        ensureMessageIsMutable();
        message_.remove(index);
        onChanged();
      } else {
        messageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public org.catmq.protocol.definition.NumberedMessage.Builder getMessageBuilder(
        int index) {
      return getMessageFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public org.catmq.protocol.definition.NumberedMessageOrBuilder getMessageOrBuilder(
        int index) {
      if (messageBuilder_ == null) {
        return message_.get(index);  } else {
        return messageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public java.util.List<? extends org.catmq.protocol.definition.NumberedMessageOrBuilder> 
         getMessageOrBuilderList() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(message_);
      }
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public org.catmq.protocol.definition.NumberedMessage.Builder addMessageBuilder() {
      return getMessageFieldBuilder().addBuilder(
          org.catmq.protocol.definition.NumberedMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public org.catmq.protocol.definition.NumberedMessage.Builder addMessageBuilder(
        int index) {
      return getMessageFieldBuilder().addBuilder(
          index, org.catmq.protocol.definition.NumberedMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .NumberedMessage message = 4;</code>
     */
    public java.util.List<org.catmq.protocol.definition.NumberedMessage.Builder> 
         getMessageBuilderList() {
      return getMessageFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.catmq.protocol.definition.NumberedMessage, org.catmq.protocol.definition.NumberedMessage.Builder, org.catmq.protocol.definition.NumberedMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.catmq.protocol.definition.NumberedMessage, org.catmq.protocol.definition.NumberedMessage.Builder, org.catmq.protocol.definition.NumberedMessageOrBuilder>(
                message_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetMessageFromStorerResponse)
  }

  // @@protoc_insertion_point(class_scope:GetMessageFromStorerResponse)
  private static final org.catmq.protocol.service.GetMessageFromStorerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.catmq.protocol.service.GetMessageFromStorerResponse();
  }

  public static org.catmq.protocol.service.GetMessageFromStorerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMessageFromStorerResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetMessageFromStorerResponse>() {
    @java.lang.Override
    public GetMessageFromStorerResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetMessageFromStorerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMessageFromStorerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.catmq.protocol.service.GetMessageFromStorerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

