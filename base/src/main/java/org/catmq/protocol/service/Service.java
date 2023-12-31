// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendMessage2BrokerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendMessage2BrokerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendMessage2BrokerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendMessage2BrokerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMessageFromBrokerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMessageFromBrokerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMessageFromBrokerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMessageFromBrokerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMessageFromStorerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMessageFromStorerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMessageFromStorerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMessageFromStorerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendMessage2StorerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendMessage2StorerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendMessage2StorerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendMessage2StorerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateTopicRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateTopicRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateTopicResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateTopicResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePartitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePartitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePartitionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePartitionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateSegmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateSegmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateSegmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateSegmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscribeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscribeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\032\020definition.proto\"_\n\031Sen" +
      "dMessage2BrokerRequest\022\037\n\007message\030\001 \003(\0132" +
      "\016.OriginMessage\022\022\n\nproducerId\030\002 \001(\003\022\r\n\005t" +
      "opic\030\003 \001(\t\"\215\001\n\032SendMessage2BrokerRespons" +
      "e\022\021\n\tsegmentId\030\001 \001(\003\022\024\n\014firstEntryId\030\002 \001" +
      "(\003\022\023\n\013lastEntryId\030\003 \001(\003\022\013\n\003ack\030\004 \001(\010\022\013\n\003" +
      "res\030\005 \001(\t\022\027\n\006status\030\006 \001(\0132\007.Status\"\200\001\n\033G" +
      "etMessageFromBrokerRequest\022\r\n\005topic\030\001 \001(" +
      "\t\022\024\n\014subscription\030\002 \001(\t\022\022\n\nconsumerId\030\003 " +
      "\001(\003\022\023\n\013batchNumber\030\004 \001(\005\022\023\n\013timeoutInMs\030" +
      "\005 \001(\003\"t\n\034GetMessageFromBrokerResponse\022\013\n" +
      "\003ack\030\001 \001(\010\022\013\n\003res\030\002 \001(\t\022\027\n\006status\030\003 \001(\0132" +
      "\007.Status\022!\n\007message\030\004 \003(\0132\020.NumberedMess" +
      "age\"C\n\033GetMessageFromStorerRequest\022\022\n\nse" +
      "gment_id\030\002 \001(\003\022\020\n\010entry_id\030\003 \001(\003\"t\n\034GetM" +
      "essageFromStorerResponse\022\013\n\003ack\030\001 \001(\010\022\013\n" +
      "\003res\030\002 \001(\t\022\027\n\006status\030\003 \001(\0132\007.Status\022!\n\007m" +
      "essage\030\004 \003(\0132\020.NumberedMessage\"L\n\031SendMe" +
      "ssage2StorerRequest\022!\n\007message\030\001 \003(\0132\020.N" +
      "umberedMessage\022\014\n\004mode\030\002 \001(\t\"O\n\032SendMess" +
      "age2StorerResponse\022\013\n\003ack\030\001 \001(\010\022\013\n\003res\030\002" +
      " \001(\t\022\027\n\006status\030\003 \001(\0132\007.Status\"7\n\022CreateT" +
      "opicRequest\022\r\n\005topic\030\001 \001(\t\022\022\n\nproducerId" +
      "\030\002 \001(\003\"H\n\023CreateTopicResponse\022\013\n\003ack\030\001 \001" +
      "(\010\022\013\n\003res\030\002 \001(\t\022\027\n\006status\030\003 \001(\0132\007.Status" +
      "\"e\n\026CreatePartitionRequest\022\r\n\005topic\030\001 \001(" +
      "\t\022\026\n\016partitionIndex\030\002 \001(\005\022\021\n\ttopicType\030\003" +
      " \001(\t\022\021\n\ttopicMode\030\004 \001(\t\"L\n\027CreatePartiti" +
      "onResponse\022\013\n\003ack\030\001 \001(\010\022\013\n\003res\030\002 \001(\t\022\027\n\006" +
      "status\030\003 \001(\0132\007.Status\")\n\024CreateSegmentRe" +
      "quest\022\021\n\tsegmentId\030\001 \001(\003\"J\n\025CreateSegmen" +
      "tResponse\022\013\n\003ack\030\001 \001(\010\022\013\n\003res\030\002 \001(\t\022\027\n\006s" +
      "tatus\030\003 \001(\0132\007.Status\"K\n\020SubscribeRequest" +
      "\022\r\n\005topic\030\001 \001(\t\022\024\n\014subscription\030\002 \001(\t\022\022\n" +
      "\nconsumerId\030\003 \001(\003\"F\n\021SubscribeResponse\022\013" +
      "\n\003ack\030\001 \001(\010\022\013\n\003res\030\002 \001(\t\022\027\n\006status\030\003 \001(\013" +
      "2\007.Status2\361\002\n\rBrokerService\022O\n\022SendMessa" +
      "ge2Broker\022\032.SendMessage2BrokerRequest\032\033." +
      "SendMessage2BrokerResponse\"\000\022U\n\024GetMessa" +
      "geFromBroker\022\034.GetMessageFromBrokerReque" +
      "st\032\035.GetMessageFromBrokerResponse\"\000\022:\n\013C" +
      "reateTopic\022\023.CreateTopicRequest\032\024.Create" +
      "TopicResponse\"\000\022F\n\017CreatePartition\022\027.Cre" +
      "atePartitionRequest\032\030.CreatePartitionRes" +
      "ponse\"\000\0224\n\tSubscribe\022\021.SubscribeRequest\032" +
      "\022.SubscribeResponse\"\0002\371\001\n\rStorerService\022" +
      "O\n\022SendMessage2Storer\022\032.SendMessage2Stor" +
      "erRequest\032\033.SendMessage2StorerResponse\"\000" +
      "\022@\n\rCreateSegment\022\025.CreateSegmentRequest" +
      "\032\026.CreateSegmentResponse\"\000\022U\n\024GetMessage" +
      "FromStorer\022\034.GetMessageFromStorerRequest" +
      "\032\035.GetMessageFromStorerResponse\"\000B\'\n\032org" +
      ".catmq.protocol.serviceP\001\210\001\001\240\001\001\330\001\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.catmq.protocol.definition.Definition.getDescriptor(),
        });
    internal_static_SendMessage2BrokerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SendMessage2BrokerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendMessage2BrokerRequest_descriptor,
        new java.lang.String[] { "Message", "ProducerId", "Topic", });
    internal_static_SendMessage2BrokerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SendMessage2BrokerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendMessage2BrokerResponse_descriptor,
        new java.lang.String[] { "SegmentId", "FirstEntryId", "LastEntryId", "Ack", "Res", "Status", });
    internal_static_GetMessageFromBrokerRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetMessageFromBrokerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMessageFromBrokerRequest_descriptor,
        new java.lang.String[] { "Topic", "Subscription", "ConsumerId", "BatchNumber", "TimeoutInMs", });
    internal_static_GetMessageFromBrokerResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetMessageFromBrokerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMessageFromBrokerResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", "Message", });
    internal_static_GetMessageFromStorerRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetMessageFromStorerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMessageFromStorerRequest_descriptor,
        new java.lang.String[] { "SegmentId", "EntryId", });
    internal_static_GetMessageFromStorerResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetMessageFromStorerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMessageFromStorerResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", "Message", });
    internal_static_SendMessage2StorerRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SendMessage2StorerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendMessage2StorerRequest_descriptor,
        new java.lang.String[] { "Message", "Mode", });
    internal_static_SendMessage2StorerResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SendMessage2StorerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendMessage2StorerResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", });
    internal_static_CreateTopicRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CreateTopicRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateTopicRequest_descriptor,
        new java.lang.String[] { "Topic", "ProducerId", });
    internal_static_CreateTopicResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CreateTopicResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateTopicResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", });
    internal_static_CreatePartitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_CreatePartitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePartitionRequest_descriptor,
        new java.lang.String[] { "Topic", "PartitionIndex", "TopicType", "TopicMode", });
    internal_static_CreatePartitionResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_CreatePartitionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePartitionResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", });
    internal_static_CreateSegmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_CreateSegmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateSegmentRequest_descriptor,
        new java.lang.String[] { "SegmentId", });
    internal_static_CreateSegmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_CreateSegmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateSegmentResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", });
    internal_static_SubscribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_SubscribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscribeRequest_descriptor,
        new java.lang.String[] { "Topic", "Subscription", "ConsumerId", });
    internal_static_SubscribeResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_SubscribeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscribeResponse_descriptor,
        new java.lang.String[] { "Ack", "Res", "Status", });
    org.catmq.protocol.definition.Definition.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
