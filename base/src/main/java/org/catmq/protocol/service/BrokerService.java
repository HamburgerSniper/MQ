// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.catmq.protocol.service;

/**
 * Protobuf service {@code BrokerService}
 */
public  abstract class BrokerService
    implements com.google.protobuf.Service {
  protected BrokerService() {}

  public interface Interface {
    /**
     * <code>rpc SendMessage2Broker(.SendMessage2BrokerRequest) returns (.SendMessage2BrokerResponse);</code>
     */
    public abstract void sendMessage2Broker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SendMessage2BrokerRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.SendMessage2BrokerResponse> done);

    /**
     * <code>rpc GetMessageFromBroker(.GetMessageFromBrokerRequest) returns (.GetMessageFromBrokerResponse);</code>
     */
    public abstract void getMessageFromBroker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.GetMessageFromBrokerRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.GetMessageFromBrokerResponse> done);

    /**
     * <code>rpc CreateTopic(.CreateTopicRequest) returns (.CreateTopicResponse);</code>
     */
    public abstract void createTopic(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreateTopicRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreateTopicResponse> done);

    /**
     * <code>rpc CreatePartition(.CreatePartitionRequest) returns (.CreatePartitionResponse);</code>
     */
    public abstract void createPartition(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreatePartitionRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreatePartitionResponse> done);

    /**
     * <code>rpc Subscribe(.SubscribeRequest) returns (.SubscribeResponse);</code>
     */
    public abstract void subscribe(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SubscribeRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.SubscribeResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new BrokerService() {
      @java.lang.Override
      public  void sendMessage2Broker(
          com.google.protobuf.RpcController controller,
          org.catmq.protocol.service.SendMessage2BrokerRequest request,
          com.google.protobuf.RpcCallback<org.catmq.protocol.service.SendMessage2BrokerResponse> done) {
        impl.sendMessage2Broker(controller, request, done);
      }

      @java.lang.Override
      public  void getMessageFromBroker(
          com.google.protobuf.RpcController controller,
          org.catmq.protocol.service.GetMessageFromBrokerRequest request,
          com.google.protobuf.RpcCallback<org.catmq.protocol.service.GetMessageFromBrokerResponse> done) {
        impl.getMessageFromBroker(controller, request, done);
      }

      @java.lang.Override
      public  void createTopic(
          com.google.protobuf.RpcController controller,
          org.catmq.protocol.service.CreateTopicRequest request,
          com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreateTopicResponse> done) {
        impl.createTopic(controller, request, done);
      }

      @java.lang.Override
      public  void createPartition(
          com.google.protobuf.RpcController controller,
          org.catmq.protocol.service.CreatePartitionRequest request,
          com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreatePartitionResponse> done) {
        impl.createPartition(controller, request, done);
      }

      @java.lang.Override
      public  void subscribe(
          com.google.protobuf.RpcController controller,
          org.catmq.protocol.service.SubscribeRequest request,
          com.google.protobuf.RpcCallback<org.catmq.protocol.service.SubscribeResponse> done) {
        impl.subscribe(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.sendMessage2Broker(controller, (org.catmq.protocol.service.SendMessage2BrokerRequest)request);
          case 1:
            return impl.getMessageFromBroker(controller, (org.catmq.protocol.service.GetMessageFromBrokerRequest)request);
          case 2:
            return impl.createTopic(controller, (org.catmq.protocol.service.CreateTopicRequest)request);
          case 3:
            return impl.createPartition(controller, (org.catmq.protocol.service.CreatePartitionRequest)request);
          case 4:
            return impl.subscribe(controller, (org.catmq.protocol.service.SubscribeRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return org.catmq.protocol.service.SendMessage2BrokerRequest.getDefaultInstance();
          case 1:
            return org.catmq.protocol.service.GetMessageFromBrokerRequest.getDefaultInstance();
          case 2:
            return org.catmq.protocol.service.CreateTopicRequest.getDefaultInstance();
          case 3:
            return org.catmq.protocol.service.CreatePartitionRequest.getDefaultInstance();
          case 4:
            return org.catmq.protocol.service.SubscribeRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return org.catmq.protocol.service.SendMessage2BrokerResponse.getDefaultInstance();
          case 1:
            return org.catmq.protocol.service.GetMessageFromBrokerResponse.getDefaultInstance();
          case 2:
            return org.catmq.protocol.service.CreateTopicResponse.getDefaultInstance();
          case 3:
            return org.catmq.protocol.service.CreatePartitionResponse.getDefaultInstance();
          case 4:
            return org.catmq.protocol.service.SubscribeResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc SendMessage2Broker(.SendMessage2BrokerRequest) returns (.SendMessage2BrokerResponse);</code>
   */
  public abstract void sendMessage2Broker(
      com.google.protobuf.RpcController controller,
      org.catmq.protocol.service.SendMessage2BrokerRequest request,
      com.google.protobuf.RpcCallback<org.catmq.protocol.service.SendMessage2BrokerResponse> done);

  /**
   * <code>rpc GetMessageFromBroker(.GetMessageFromBrokerRequest) returns (.GetMessageFromBrokerResponse);</code>
   */
  public abstract void getMessageFromBroker(
      com.google.protobuf.RpcController controller,
      org.catmq.protocol.service.GetMessageFromBrokerRequest request,
      com.google.protobuf.RpcCallback<org.catmq.protocol.service.GetMessageFromBrokerResponse> done);

  /**
   * <code>rpc CreateTopic(.CreateTopicRequest) returns (.CreateTopicResponse);</code>
   */
  public abstract void createTopic(
      com.google.protobuf.RpcController controller,
      org.catmq.protocol.service.CreateTopicRequest request,
      com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreateTopicResponse> done);

  /**
   * <code>rpc CreatePartition(.CreatePartitionRequest) returns (.CreatePartitionResponse);</code>
   */
  public abstract void createPartition(
      com.google.protobuf.RpcController controller,
      org.catmq.protocol.service.CreatePartitionRequest request,
      com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreatePartitionResponse> done);

  /**
   * <code>rpc Subscribe(.SubscribeRequest) returns (.SubscribeResponse);</code>
   */
  public abstract void subscribe(
      com.google.protobuf.RpcController controller,
      org.catmq.protocol.service.SubscribeRequest request,
      com.google.protobuf.RpcCallback<org.catmq.protocol.service.SubscribeResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return org.catmq.protocol.service.Service.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.sendMessage2Broker(controller, (org.catmq.protocol.service.SendMessage2BrokerRequest)request,
          com.google.protobuf.RpcUtil.<org.catmq.protocol.service.SendMessage2BrokerResponse>specializeCallback(
            done));
        return;
      case 1:
        this.getMessageFromBroker(controller, (org.catmq.protocol.service.GetMessageFromBrokerRequest)request,
          com.google.protobuf.RpcUtil.<org.catmq.protocol.service.GetMessageFromBrokerResponse>specializeCallback(
            done));
        return;
      case 2:
        this.createTopic(controller, (org.catmq.protocol.service.CreateTopicRequest)request,
          com.google.protobuf.RpcUtil.<org.catmq.protocol.service.CreateTopicResponse>specializeCallback(
            done));
        return;
      case 3:
        this.createPartition(controller, (org.catmq.protocol.service.CreatePartitionRequest)request,
          com.google.protobuf.RpcUtil.<org.catmq.protocol.service.CreatePartitionResponse>specializeCallback(
            done));
        return;
      case 4:
        this.subscribe(controller, (org.catmq.protocol.service.SubscribeRequest)request,
          com.google.protobuf.RpcUtil.<org.catmq.protocol.service.SubscribeResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return org.catmq.protocol.service.SendMessage2BrokerRequest.getDefaultInstance();
      case 1:
        return org.catmq.protocol.service.GetMessageFromBrokerRequest.getDefaultInstance();
      case 2:
        return org.catmq.protocol.service.CreateTopicRequest.getDefaultInstance();
      case 3:
        return org.catmq.protocol.service.CreatePartitionRequest.getDefaultInstance();
      case 4:
        return org.catmq.protocol.service.SubscribeRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return org.catmq.protocol.service.SendMessage2BrokerResponse.getDefaultInstance();
      case 1:
        return org.catmq.protocol.service.GetMessageFromBrokerResponse.getDefaultInstance();
      case 2:
        return org.catmq.protocol.service.CreateTopicResponse.getDefaultInstance();
      case 3:
        return org.catmq.protocol.service.CreatePartitionResponse.getDefaultInstance();
      case 4:
        return org.catmq.protocol.service.SubscribeResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends org.catmq.protocol.service.BrokerService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sendMessage2Broker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SendMessage2BrokerRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.SendMessage2BrokerResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        org.catmq.protocol.service.SendMessage2BrokerResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.catmq.protocol.service.SendMessage2BrokerResponse.class,
          org.catmq.protocol.service.SendMessage2BrokerResponse.getDefaultInstance()));
    }

    public  void getMessageFromBroker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.GetMessageFromBrokerRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.GetMessageFromBrokerResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        org.catmq.protocol.service.GetMessageFromBrokerResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.catmq.protocol.service.GetMessageFromBrokerResponse.class,
          org.catmq.protocol.service.GetMessageFromBrokerResponse.getDefaultInstance()));
    }

    public  void createTopic(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreateTopicRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreateTopicResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        org.catmq.protocol.service.CreateTopicResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.catmq.protocol.service.CreateTopicResponse.class,
          org.catmq.protocol.service.CreateTopicResponse.getDefaultInstance()));
    }

    public  void createPartition(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreatePartitionRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.CreatePartitionResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        org.catmq.protocol.service.CreatePartitionResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.catmq.protocol.service.CreatePartitionResponse.class,
          org.catmq.protocol.service.CreatePartitionResponse.getDefaultInstance()));
    }

    public  void subscribe(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SubscribeRequest request,
        com.google.protobuf.RpcCallback<org.catmq.protocol.service.SubscribeResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        org.catmq.protocol.service.SubscribeResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.catmq.protocol.service.SubscribeResponse.class,
          org.catmq.protocol.service.SubscribeResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public org.catmq.protocol.service.SendMessage2BrokerResponse sendMessage2Broker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SendMessage2BrokerRequest request)
        throws com.google.protobuf.ServiceException;

    public org.catmq.protocol.service.GetMessageFromBrokerResponse getMessageFromBroker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.GetMessageFromBrokerRequest request)
        throws com.google.protobuf.ServiceException;

    public org.catmq.protocol.service.CreateTopicResponse createTopic(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreateTopicRequest request)
        throws com.google.protobuf.ServiceException;

    public org.catmq.protocol.service.CreatePartitionResponse createPartition(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreatePartitionRequest request)
        throws com.google.protobuf.ServiceException;

    public org.catmq.protocol.service.SubscribeResponse subscribe(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SubscribeRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public org.catmq.protocol.service.SendMessage2BrokerResponse sendMessage2Broker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SendMessage2BrokerRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.catmq.protocol.service.SendMessage2BrokerResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        org.catmq.protocol.service.SendMessage2BrokerResponse.getDefaultInstance());
    }


    public org.catmq.protocol.service.GetMessageFromBrokerResponse getMessageFromBroker(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.GetMessageFromBrokerRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.catmq.protocol.service.GetMessageFromBrokerResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        org.catmq.protocol.service.GetMessageFromBrokerResponse.getDefaultInstance());
    }


    public org.catmq.protocol.service.CreateTopicResponse createTopic(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreateTopicRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.catmq.protocol.service.CreateTopicResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        org.catmq.protocol.service.CreateTopicResponse.getDefaultInstance());
    }


    public org.catmq.protocol.service.CreatePartitionResponse createPartition(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.CreatePartitionRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.catmq.protocol.service.CreatePartitionResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        org.catmq.protocol.service.CreatePartitionResponse.getDefaultInstance());
    }


    public org.catmq.protocol.service.SubscribeResponse subscribe(
        com.google.protobuf.RpcController controller,
        org.catmq.protocol.service.SubscribeRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.catmq.protocol.service.SubscribeResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        org.catmq.protocol.service.SubscribeResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:BrokerService)
}

