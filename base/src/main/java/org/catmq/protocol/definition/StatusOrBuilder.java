// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: definition.proto

package org.catmq.protocol.definition;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Code code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.Code code = 1;</code>
   * @return The code.
   */
  org.catmq.protocol.definition.Code getCode();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
