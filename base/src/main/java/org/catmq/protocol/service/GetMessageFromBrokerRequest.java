// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

/**
 * Protobuf type {@code GetMessageFromBrokerRequest}
 */
public final class GetMessageFromBrokerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetMessageFromBrokerRequest)
    GetMessageFromBrokerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMessageFromBrokerRequest.newBuilder() to construct.
  private GetMessageFromBrokerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMessageFromBrokerRequest() {
    topic_ = "";
    subscription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMessageFromBrokerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.catmq.protocol.service.Service.internal_static_GetMessageFromBrokerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.catmq.protocol.service.Service.internal_static_GetMessageFromBrokerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.catmq.protocol.service.GetMessageFromBrokerRequest.class, org.catmq.protocol.service.GetMessageFromBrokerRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object topic_;
  /**
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object subscription_;
  /**
   * <code>string subscription = 2;</code>
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <code>string subscription = 2;</code>
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMERID_FIELD_NUMBER = 3;
  private long consumerId_;
  /**
   * <code>int64 consumerId = 3;</code>
   * @return The consumerId.
   */
  @java.lang.Override
  public long getConsumerId() {
    return consumerId_;
  }

  public static final int BATCHNUMBER_FIELD_NUMBER = 4;
  private int batchNumber_;
  /**
   * <code>int32 batchNumber = 4;</code>
   * @return The batchNumber.
   */
  @java.lang.Override
  public int getBatchNumber() {
    return batchNumber_;
  }

  public static final int TIMEOUTINMS_FIELD_NUMBER = 5;
  private long timeoutInMs_;
  /**
   * <code>int64 timeoutInMs = 5;</code>
   * @return The timeoutInMs.
   */
  @java.lang.Override
  public long getTimeoutInMs() {
    return timeoutInMs_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subscription_);
    }
    if (consumerId_ != 0L) {
      output.writeInt64(3, consumerId_);
    }
    if (batchNumber_ != 0) {
      output.writeInt32(4, batchNumber_);
    }
    if (timeoutInMs_ != 0L) {
      output.writeInt64(5, timeoutInMs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subscription_);
    }
    if (consumerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, consumerId_);
    }
    if (batchNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, batchNumber_);
    }
    if (timeoutInMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, timeoutInMs_);
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
    if (!(obj instanceof org.catmq.protocol.service.GetMessageFromBrokerRequest)) {
      return super.equals(obj);
    }
    org.catmq.protocol.service.GetMessageFromBrokerRequest other = (org.catmq.protocol.service.GetMessageFromBrokerRequest) obj;

    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (!getSubscription()
        .equals(other.getSubscription())) return false;
    if (getConsumerId()
        != other.getConsumerId()) return false;
    if (getBatchNumber()
        != other.getBatchNumber()) return false;
    if (getTimeoutInMs()
        != other.getTimeoutInMs()) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (37 * hash) + CONSUMERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConsumerId());
    hash = (37 * hash) + BATCHNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getBatchNumber();
    hash = (37 * hash) + TIMEOUTINMS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeoutInMs());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.GetMessageFromBrokerRequest parseFrom(
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
  public static Builder newBuilder(org.catmq.protocol.service.GetMessageFromBrokerRequest prototype) {
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
   * Protobuf type {@code GetMessageFromBrokerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetMessageFromBrokerRequest)
      org.catmq.protocol.service.GetMessageFromBrokerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromBrokerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromBrokerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.catmq.protocol.service.GetMessageFromBrokerRequest.class, org.catmq.protocol.service.GetMessageFromBrokerRequest.Builder.class);
    }

    // Construct using org.catmq.protocol.service.GetMessageFromBrokerRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      topic_ = "";

      subscription_ = "";

      consumerId_ = 0L;

      batchNumber_ = 0;

      timeoutInMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.catmq.protocol.service.Service.internal_static_GetMessageFromBrokerRequest_descriptor;
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromBrokerRequest getDefaultInstanceForType() {
      return org.catmq.protocol.service.GetMessageFromBrokerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromBrokerRequest build() {
      org.catmq.protocol.service.GetMessageFromBrokerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.catmq.protocol.service.GetMessageFromBrokerRequest buildPartial() {
      org.catmq.protocol.service.GetMessageFromBrokerRequest result = new org.catmq.protocol.service.GetMessageFromBrokerRequest(this);
      result.topic_ = topic_;
      result.subscription_ = subscription_;
      result.consumerId_ = consumerId_;
      result.batchNumber_ = batchNumber_;
      result.timeoutInMs_ = timeoutInMs_;
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
      if (other instanceof org.catmq.protocol.service.GetMessageFromBrokerRequest) {
        return mergeFrom((org.catmq.protocol.service.GetMessageFromBrokerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.catmq.protocol.service.GetMessageFromBrokerRequest other) {
      if (other == org.catmq.protocol.service.GetMessageFromBrokerRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
      }
      if (other.getConsumerId() != 0L) {
        setConsumerId(other.getConsumerId());
      }
      if (other.getBatchNumber() != 0) {
        setBatchNumber(other.getBatchNumber());
      }
      if (other.getTimeoutInMs() != 0L) {
        setTimeoutInMs(other.getTimeoutInMs());
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
              topic_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              subscription_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              consumerId_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              batchNumber_ = input.readInt32();

              break;
            } // case 32
            case 40: {
              timeoutInMs_ = input.readInt64();

              break;
            } // case 40
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

    private java.lang.Object topic_ = "";
    /**
     * <code>string topic = 1;</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topic = 1;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 1;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 1;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subscription_ = "";
    /**
     * <code>string subscription = 2;</code>
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subscription = 2;</code>
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subscription = 2;</code>
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subscription = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      
      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
    /**
     * <code>string subscription = 2;</code>
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscription_ = value;
      onChanged();
      return this;
    }

    private long consumerId_ ;
    /**
     * <code>int64 consumerId = 3;</code>
     * @return The consumerId.
     */
    @java.lang.Override
    public long getConsumerId() {
      return consumerId_;
    }
    /**
     * <code>int64 consumerId = 3;</code>
     * @param value The consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerId(long value) {
      
      consumerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 consumerId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumerId() {
      
      consumerId_ = 0L;
      onChanged();
      return this;
    }

    private int batchNumber_ ;
    /**
     * <code>int32 batchNumber = 4;</code>
     * @return The batchNumber.
     */
    @java.lang.Override
    public int getBatchNumber() {
      return batchNumber_;
    }
    /**
     * <code>int32 batchNumber = 4;</code>
     * @param value The batchNumber to set.
     * @return This builder for chaining.
     */
    public Builder setBatchNumber(int value) {
      
      batchNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 batchNumber = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchNumber() {
      
      batchNumber_ = 0;
      onChanged();
      return this;
    }

    private long timeoutInMs_ ;
    /**
     * <code>int64 timeoutInMs = 5;</code>
     * @return The timeoutInMs.
     */
    @java.lang.Override
    public long getTimeoutInMs() {
      return timeoutInMs_;
    }
    /**
     * <code>int64 timeoutInMs = 5;</code>
     * @param value The timeoutInMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutInMs(long value) {
      
      timeoutInMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timeoutInMs = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutInMs() {
      
      timeoutInMs_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:GetMessageFromBrokerRequest)
  }

  // @@protoc_insertion_point(class_scope:GetMessageFromBrokerRequest)
  private static final org.catmq.protocol.service.GetMessageFromBrokerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.catmq.protocol.service.GetMessageFromBrokerRequest();
  }

  public static org.catmq.protocol.service.GetMessageFromBrokerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMessageFromBrokerRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetMessageFromBrokerRequest>() {
    @java.lang.Override
    public GetMessageFromBrokerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetMessageFromBrokerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMessageFromBrokerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.catmq.protocol.service.GetMessageFromBrokerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

