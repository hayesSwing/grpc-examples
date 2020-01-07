package com.xiangzi.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 服务接口定义，服务端和客户端都要遵守该接口进行通信
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: RpcDateService.proto")
public final class RpcDateServiceGrpc {

  private RpcDateServiceGrpc() {}

  public static final String SERVICE_NAME = "com.xiangzi.service.api.RpcDateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xiangzi.service.RpcDateRequest,
      com.xiangzi.service.RpcDateResponse> getGetDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDate",
      requestType = com.xiangzi.service.RpcDateRequest.class,
      responseType = com.xiangzi.service.RpcDateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xiangzi.service.RpcDateRequest,
      com.xiangzi.service.RpcDateResponse> getGetDateMethod() {
    io.grpc.MethodDescriptor<com.xiangzi.service.RpcDateRequest, com.xiangzi.service.RpcDateResponse> getGetDateMethod;
    if ((getGetDateMethod = RpcDateServiceGrpc.getGetDateMethod) == null) {
      synchronized (RpcDateServiceGrpc.class) {
        if ((getGetDateMethod = RpcDateServiceGrpc.getGetDateMethod) == null) {
          RpcDateServiceGrpc.getGetDateMethod = getGetDateMethod =
              io.grpc.MethodDescriptor.<com.xiangzi.service.RpcDateRequest, com.xiangzi.service.RpcDateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xiangzi.service.RpcDateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xiangzi.service.RpcDateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDateServiceMethodDescriptorSupplier("getDate"))
              .build();
        }
      }
    }
    return getGetDateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcDateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceStub>() {
        @java.lang.Override
        public RpcDateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDateServiceStub(channel, callOptions);
        }
      };
    return RpcDateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcDateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceBlockingStub>() {
        @java.lang.Override
        public RpcDateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDateServiceBlockingStub(channel, callOptions);
        }
      };
    return RpcDateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcDateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDateServiceFutureStub>() {
        @java.lang.Override
        public RpcDateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDateServiceFutureStub(channel, callOptions);
        }
      };
    return RpcDateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static abstract class RpcDateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDate(com.xiangzi.service.RpcDateRequest request,
        io.grpc.stub.StreamObserver<com.xiangzi.service.RpcDateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xiangzi.service.RpcDateRequest,
                com.xiangzi.service.RpcDateResponse>(
                  this, METHODID_GET_DATE)))
          .build();
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class RpcDateServiceStub extends io.grpc.stub.AbstractAsyncStub<RpcDateServiceStub> {
    private RpcDateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDateServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDate(com.xiangzi.service.RpcDateRequest request,
        io.grpc.stub.StreamObserver<com.xiangzi.service.RpcDateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class RpcDateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcDateServiceBlockingStub> {
    private RpcDateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xiangzi.service.RpcDateResponse getDate(com.xiangzi.service.RpcDateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class RpcDateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RpcDateServiceFutureStub> {
    private RpcDateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xiangzi.service.RpcDateResponse> getDate(
        com.xiangzi.service.RpcDateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcDateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcDateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATE:
          serviceImpl.getDate((com.xiangzi.service.RpcDateRequest) request,
              (io.grpc.stub.StreamObserver<com.xiangzi.service.RpcDateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RpcDateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcDateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xiangzi.service.RpcDateServiceApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcDateService");
    }
  }

  private static final class RpcDateServiceFileDescriptorSupplier
      extends RpcDateServiceBaseDescriptorSupplier {
    RpcDateServiceFileDescriptorSupplier() {}
  }

  private static final class RpcDateServiceMethodDescriptorSupplier
      extends RpcDateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcDateServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RpcDateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcDateServiceFileDescriptorSupplier())
              .addMethod(getGetDateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
