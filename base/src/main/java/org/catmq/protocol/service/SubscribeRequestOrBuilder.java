// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

public interface SubscribeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SubscribeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string subscription = 2;</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <code>string subscription = 2;</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <code>int64 consumerId = 3;</code>
   * @return The consumerId.
   */
  long getConsumerId();
}
