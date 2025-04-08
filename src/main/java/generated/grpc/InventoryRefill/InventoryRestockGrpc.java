package generated.grpc.InventoryRefill;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: InventoryRefill.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryRestockGrpc {

  private InventoryRestockGrpc() {}

  public static final String SERVICE_NAME = "retail.InventoryRestock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.InventoryRefill.RestockRequest,
      generated.grpc.InventoryRefill.RestockSummary> getBulkRestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkRestock",
      requestType = generated.grpc.InventoryRefill.RestockRequest.class,
      responseType = generated.grpc.InventoryRefill.RestockSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.InventoryRefill.RestockRequest,
      generated.grpc.InventoryRefill.RestockSummary> getBulkRestockMethod() {
    io.grpc.MethodDescriptor<generated.grpc.InventoryRefill.RestockRequest, generated.grpc.InventoryRefill.RestockSummary> getBulkRestockMethod;
    if ((getBulkRestockMethod = InventoryRestockGrpc.getBulkRestockMethod) == null) {
      synchronized (InventoryRestockGrpc.class) {
        if ((getBulkRestockMethod = InventoryRestockGrpc.getBulkRestockMethod) == null) {
          InventoryRestockGrpc.getBulkRestockMethod = getBulkRestockMethod =
              io.grpc.MethodDescriptor.<generated.grpc.InventoryRefill.RestockRequest, generated.grpc.InventoryRefill.RestockSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkRestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.InventoryRefill.RestockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.InventoryRefill.RestockSummary.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryRestockMethodDescriptorSupplier("BulkRestock"))
              .build();
        }
      }
    }
    return getBulkRestockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryRestockStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryRestockStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryRestockStub>() {
        @java.lang.Override
        public InventoryRestockStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryRestockStub(channel, callOptions);
        }
      };
    return InventoryRestockStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryRestockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryRestockBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryRestockBlockingStub>() {
        @java.lang.Override
        public InventoryRestockBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryRestockBlockingStub(channel, callOptions);
        }
      };
    return InventoryRestockBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryRestockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryRestockFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryRestockFutureStub>() {
        @java.lang.Override
        public InventoryRestockFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryRestockFutureStub(channel, callOptions);
        }
      };
    return InventoryRestockFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InventoryRestockImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client streams multiple restock requests before receiving a summary (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.InventoryRefill.RestockRequest> bulkRestock(
        io.grpc.stub.StreamObserver<generated.grpc.InventoryRefill.RestockSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBulkRestockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBulkRestockMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.InventoryRefill.RestockRequest,
                generated.grpc.InventoryRefill.RestockSummary>(
                  this, METHODID_BULK_RESTOCK)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryRestockStub extends io.grpc.stub.AbstractAsyncStub<InventoryRestockStub> {
    private InventoryRestockStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRestockStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryRestockStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streams multiple restock requests before receiving a summary (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.InventoryRefill.RestockRequest> bulkRestock(
        io.grpc.stub.StreamObserver<generated.grpc.InventoryRefill.RestockSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBulkRestockMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class InventoryRestockBlockingStub extends io.grpc.stub.AbstractBlockingStub<InventoryRestockBlockingStub> {
    private InventoryRestockBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRestockBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryRestockBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class InventoryRestockFutureStub extends io.grpc.stub.AbstractFutureStub<InventoryRestockFutureStub> {
    private InventoryRestockFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRestockFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryRestockFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BULK_RESTOCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryRestockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryRestockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BULK_RESTOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bulkRestock(
              (io.grpc.stub.StreamObserver<generated.grpc.InventoryRefill.RestockSummary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryRestockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryRestockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.InventoryRefill.InventoryRefillImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryRestock");
    }
  }

  private static final class InventoryRestockFileDescriptorSupplier
      extends InventoryRestockBaseDescriptorSupplier {
    InventoryRestockFileDescriptorSupplier() {}
  }

  private static final class InventoryRestockMethodDescriptorSupplier
      extends InventoryRestockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryRestockMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryRestockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryRestockFileDescriptorSupplier())
              .addMethod(getBulkRestockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
