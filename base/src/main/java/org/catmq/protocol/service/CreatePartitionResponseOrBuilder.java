// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

public interface CreatePartitionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreatePartitionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool ack = 1;</code>
   * @return The ack.
   */
  boolean getAck();

  /**
   * <code>string res = 2;</code>
   * @return The res.
   */
  java.lang.String getRes();
  /**
   * <code>string res = 2;</code>
   * @return The bytes for res.
   */
  com.google.protobuf.ByteString
      getResBytes();

  /**
   * <code>.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.Status status = 3;</code>
   * @return The status.
   */
  org.catmq.protocol.definition.Status getStatus();
  /**
   * <code>.Status status = 3;</code>
   */
  org.catmq.protocol.definition.StatusOrBuilder getStatusOrBuilder();
}
