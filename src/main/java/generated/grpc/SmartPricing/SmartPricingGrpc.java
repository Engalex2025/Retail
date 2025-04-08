package generated.grpc.SmartPricing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: SmartPricing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartPricingGrpc {

  private SmartPricingGrpc() {}

  public static final String SERVICE_NAME = "retail.SmartPricing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.SmartPricing.ProductRequest,
      generated.grpc.SmartPricing.ProductResponse> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrice",
      requestType = generated.grpc.SmartPricing.ProductRequest.class,
      responseType = generated.grpc.SmartPricing.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.SmartPricing.ProductRequest,
      generated.grpc.SmartPricing.ProductResponse> getGetPriceMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SmartPricing.ProductRequest, generated.grpc.SmartPricing.ProductResponse> getGetPriceMethod;
    if ((getGetPriceMethod = SmartPricingGrpc.getGetPriceMethod) == null) {
      synchronized (SmartPricingGrpc.class) {
        if ((getGetPriceMethod = SmartPricingGrpc.getGetPriceMethod) == null) {
          SmartPricingGrpc.getGetPriceMethod = getGetPriceMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SmartPricing.ProductRequest, generated.grpc.SmartPricing.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SmartPricing.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SmartPricing.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartPricingMethodDescriptorSupplier("GetPrice"))
              .build();
        }
      }
    }
    return getGetPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.SmartPricing.PriceUpdateRequest,
      generated.grpc.SmartPricing.PriceUpdateResponse> getUpdatePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePrice",
      requestType = generated.grpc.SmartPricing.PriceUpdateRequest.class,
      responseType = generated.grpc.SmartPricing.PriceUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.SmartPricing.PriceUpdateRequest,
      generated.grpc.SmartPricing.PriceUpdateResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SmartPricing.PriceUpdateRequest, generated.grpc.SmartPricing.PriceUpdateResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = SmartPricingGrpc.getUpdatePriceMethod) == null) {
      synchronized (SmartPricingGrpc.class) {
        if ((getUpdatePriceMethod = SmartPricingGrpc.getUpdatePriceMethod) == null) {
          SmartPricingGrpc.getUpdatePriceMethod = getUpdatePriceMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SmartPricing.PriceUpdateRequest, generated.grpc.SmartPricing.PriceUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SmartPricing.PriceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SmartPricing.PriceUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartPricingMethodDescriptorSupplier("UpdatePrice"))
              .build();
        }
      }
    }
    return getUpdatePriceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartPricingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartPricingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartPricingStub>() {
        @java.lang.Override
        public SmartPricingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartPricingStub(channel, callOptions);
        }
      };
    return SmartPricingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartPricingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartPricingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartPricingBlockingStub>() {
        @java.lang.Override
        public SmartPricingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartPricingBlockingStub(channel, callOptions);
        }
      };
    return SmartPricingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartPricingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartPricingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartPricingFutureStub>() {
        @java.lang.Override
        public SmartPricingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartPricingFutureStub(channel, callOptions);
        }
      };
    return SmartPricingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmartPricingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve the current price of a product
     * </pre>
     */
    public void getPrice(generated.grpc.SmartPricing.ProductRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the price of a product
     * </pre>
     */
    public void updatePrice(generated.grpc.SmartPricing.PriceUpdateRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.PriceUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.SmartPricing.ProductRequest,
                generated.grpc.SmartPricing.ProductResponse>(
                  this, METHODID_GET_PRICE)))
          .addMethod(
            getUpdatePriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.SmartPricing.PriceUpdateRequest,
                generated.grpc.SmartPricing.PriceUpdateResponse>(
                  this, METHODID_UPDATE_PRICE)))
          .build();
    }
  }

  /**
   */
  public static final class SmartPricingStub extends io.grpc.stub.AbstractAsyncStub<SmartPricingStub> {
    private SmartPricingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPricingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartPricingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the current price of a product
     * </pre>
     */
    public void getPrice(generated.grpc.SmartPricing.ProductRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the price of a product
     * </pre>
     */
    public void updatePrice(generated.grpc.SmartPricing.PriceUpdateRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.PriceUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartPricingBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartPricingBlockingStub> {
    private SmartPricingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPricingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartPricingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the current price of a product
     * </pre>
     */
    public generated.grpc.SmartPricing.ProductResponse getPrice(generated.grpc.SmartPricing.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the price of a product
     * </pre>
     */
    public generated.grpc.SmartPricing.PriceUpdateResponse updatePrice(generated.grpc.SmartPricing.PriceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartPricingFutureStub extends io.grpc.stub.AbstractFutureStub<SmartPricingFutureStub> {
    private SmartPricingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPricingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartPricingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the current price of a product
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.SmartPricing.ProductResponse> getPrice(
        generated.grpc.SmartPricing.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the price of a product
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.SmartPricing.PriceUpdateResponse> updatePrice(
        generated.grpc.SmartPricing.PriceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRICE = 0;
  private static final int METHODID_UPDATE_PRICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartPricingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartPricingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((generated.grpc.SmartPricing.ProductRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.ProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((generated.grpc.SmartPricing.PriceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SmartPricing.PriceUpdateResponse>) responseObserver);
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

  private static abstract class SmartPricingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartPricingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.SmartPricing.SmartPricingImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartPricing");
    }
  }

  private static final class SmartPricingFileDescriptorSupplier
      extends SmartPricingBaseDescriptorSupplier {
    SmartPricingFileDescriptorSupplier() {}
  }

  private static final class SmartPricingMethodDescriptorSupplier
      extends SmartPricingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartPricingMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartPricingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartPricingFileDescriptorSupplier())
              .addMethod(getGetPriceMethod())
              .addMethod(getUpdatePriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
