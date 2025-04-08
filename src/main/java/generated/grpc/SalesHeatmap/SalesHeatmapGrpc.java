package generated.grpc.SalesHeatmap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: SalesHeatmap.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SalesHeatmapGrpc {

  private SalesHeatmapGrpc() {}

  public static final String SERVICE_NAME = "retail.SalesHeatmap";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.SalesRequest,
      generated.grpc.SalesHeatmap.SalesUpdate> getStreamSalesUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSalesUpdates",
      requestType = generated.grpc.SalesHeatmap.SalesRequest.class,
      responseType = generated.grpc.SalesHeatmap.SalesUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.SalesRequest,
      generated.grpc.SalesHeatmap.SalesUpdate> getStreamSalesUpdatesMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.SalesRequest, generated.grpc.SalesHeatmap.SalesUpdate> getStreamSalesUpdatesMethod;
    if ((getStreamSalesUpdatesMethod = SalesHeatmapGrpc.getStreamSalesUpdatesMethod) == null) {
      synchronized (SalesHeatmapGrpc.class) {
        if ((getStreamSalesUpdatesMethod = SalesHeatmapGrpc.getStreamSalesUpdatesMethod) == null) {
          SalesHeatmapGrpc.getStreamSalesUpdatesMethod = getStreamSalesUpdatesMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SalesHeatmap.SalesRequest, generated.grpc.SalesHeatmap.SalesUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSalesUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.SalesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.SalesUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new SalesHeatmapMethodDescriptorSupplier("StreamSalesUpdates"))
              .build();
        }
      }
    }
    return getStreamSalesUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalesHeatmapStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapStub>() {
        @java.lang.Override
        public SalesHeatmapStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesHeatmapStub(channel, callOptions);
        }
      };
    return SalesHeatmapStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalesHeatmapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapBlockingStub>() {
        @java.lang.Override
        public SalesHeatmapBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesHeatmapBlockingStub(channel, callOptions);
        }
      };
    return SalesHeatmapBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalesHeatmapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesHeatmapFutureStub>() {
        @java.lang.Override
        public SalesHeatmapFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesHeatmapFutureStub(channel, callOptions);
        }
      };
    return SalesHeatmapFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SalesHeatmapImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Stream live sales updates for a section (Server Streaming)
     * </pre>
     */
    public void streamSalesUpdates(generated.grpc.SalesHeatmap.SalesRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamSalesUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamSalesUpdatesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.SalesHeatmap.SalesRequest,
                generated.grpc.SalesHeatmap.SalesUpdate>(
                  this, METHODID_STREAM_SALES_UPDATES)))
          .build();
    }
  }

  /**
   */
  public static final class SalesHeatmapStub extends io.grpc.stub.AbstractAsyncStub<SalesHeatmapStub> {
    private SalesHeatmapStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesHeatmapStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesHeatmapStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stream live sales updates for a section (Server Streaming)
     * </pre>
     */
    public void streamSalesUpdates(generated.grpc.SalesHeatmap.SalesRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamSalesUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SalesHeatmapBlockingStub extends io.grpc.stub.AbstractBlockingStub<SalesHeatmapBlockingStub> {
    private SalesHeatmapBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesHeatmapBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesHeatmapBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stream live sales updates for a section (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<generated.grpc.SalesHeatmap.SalesUpdate> streamSalesUpdates(
        generated.grpc.SalesHeatmap.SalesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamSalesUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SalesHeatmapFutureStub extends io.grpc.stub.AbstractFutureStub<SalesHeatmapFutureStub> {
    private SalesHeatmapFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesHeatmapFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesHeatmapFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_SALES_UPDATES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SalesHeatmapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SalesHeatmapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_SALES_UPDATES:
          serviceImpl.streamSalesUpdates((generated.grpc.SalesHeatmap.SalesRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesUpdate>) responseObserver);
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

  private static abstract class SalesHeatmapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalesHeatmapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.SalesHeatmap.SalesHeatmapImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalesHeatmap");
    }
  }

  private static final class SalesHeatmapFileDescriptorSupplier
      extends SalesHeatmapBaseDescriptorSupplier {
    SalesHeatmapFileDescriptorSupplier() {}
  }

  private static final class SalesHeatmapMethodDescriptorSupplier
      extends SalesHeatmapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SalesHeatmapMethodDescriptorSupplier(String methodName) {
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
      synchronized (SalesHeatmapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalesHeatmapFileDescriptorSupplier())
              .addMethod(getStreamSalesUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
