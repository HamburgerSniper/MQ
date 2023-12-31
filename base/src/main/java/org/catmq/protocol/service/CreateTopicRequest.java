// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

/**
 * Protobuf type {@code CreateTopicRequest}
 */
public final class CreateTopicRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateTopicRequest)
    CreateTopicRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTopicRequest.newBuilder() to construct.
  private CreateTopicRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTopicRequest() {
    topic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTopicRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.catmq.protocol.service.Service.internal_static_CreateTopicRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.catmq.protocol.service.Service.internal_static_CreateTopicRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.catmq.protocol.service.CreateTopicRequest.class, org.catmq.protocol.service.CreateTopicRequest.Builder.class);
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

  public static final int PRODUCERID_FIELD_NUMBER = 2;
  private long producerId_;
  /**
   * <code>int64 producerId = 2;</code>
   * @return The producerId.
   */
  @java.lang.Override
  public long getProducerId() {
    return producerId_;
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
    if (producerId_ != 0L) {
      output.writeInt64(2, producerId_);
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
    if (producerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, producerId_);
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
    if (!(obj instanceof org.catmq.protocol.service.CreateTopicRequest)) {
      return super.equals(obj);
    }
    org.catmq.protocol.service.CreateTopicRequest other = (org.catmq.protocol.service.CreateTopicRequest) obj;

    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (getProducerId()
        != other.getProducerId()) return false;
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
    hash = (37 * hash) + PRODUCERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProducerId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.catmq.protocol.service.CreateTopicRequest parseFrom(
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
  public static Builder newBuilder(org.catmq.protocol.service.CreateTopicRequest prototype) {
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
   * Protobuf type {@code CreateTopicRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateTopicRequest)
      org.catmq.protocol.service.CreateTopicRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.catmq.protocol.service.Service.internal_static_CreateTopicRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.catmq.protocol.service.Service.internal_static_CreateTopicRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.catmq.protocol.service.CreateTopicRequest.class, org.catmq.protocol.service.CreateTopicRequest.Builder.class);
    }

    // Construct using org.catmq.protocol.service.CreateTopicRequest.newBuilder()
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

      producerId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.catmq.protocol.service.Service.internal_static_CreateTopicRequest_descriptor;
    }

    @java.lang.Override
    public org.catmq.protocol.service.CreateTopicRequest getDefaultInstanceForType() {
      return org.catmq.protocol.service.CreateTopicRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.catmq.protocol.service.CreateTopicRequest build() {
      org.catmq.protocol.service.CreateTopicRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.catmq.protocol.service.CreateTopicRequest buildPartial() {
      org.catmq.protocol.service.CreateTopicRequest result = new org.catmq.protocol.service.CreateTopicRequest(this);
      result.topic_ = topic_;
      result.producerId_ = producerId_;
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
      if (other instanceof org.catmq.protocol.service.CreateTopicRequest) {
        return mergeFrom((org.catmq.protocol.service.CreateTopicRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.catmq.protocol.service.CreateTopicRequest other) {
      if (other == org.catmq.protocol.service.CreateTopicRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.getProducerId() != 0L) {
        setProducerId(other.getProducerId());
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
            case 16: {
              producerId_ = input.readInt64();

              break;
            } // case 16
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

    private long producerId_ ;
    /**
     * <code>int64 producerId = 2;</code>
     * @return The producerId.
     */
    @java.lang.Override
    public long getProducerId() {
      return producerId_;
    }
    /**
     * <code>int64 producerId = 2;</code>
     * @param value The producerId to set.
     * @return This builder for chaining.
     */
    public Builder setProducerId(long value) {
      
      producerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 producerId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProducerId() {
      
      producerId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:CreateTopicRequest)
  }

  // @@protoc_insertion_point(class_scope:CreateTopicRequest)
  private static final org.catmq.protocol.service.CreateTopicRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.catmq.protocol.service.CreateTopicRequest();
  }

  public static org.catmq.protocol.service.CreateTopicRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTopicRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTopicRequest>() {
    @java.lang.Override
    public CreateTopicRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTopicRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTopicRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.catmq.protocol.service.CreateTopicRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

