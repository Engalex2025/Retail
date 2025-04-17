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
  private static volatile io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.EmptyRequest,
      generated.grpc.SalesHeatmap.SalesPerformanceResponse> getGenerateSalesPerformanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateSalesPerformance",
      requestType = generated.grpc.SalesHeatmap.EmptyRequest.class,
      responseType = generated.grpc.SalesHeatmap.SalesPerformanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.EmptyRequest,
      generated.grpc.SalesHeatmap.SalesPerformanceResponse> getGenerateSalesPerformanceMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.EmptyRequest, generated.grpc.SalesHeatmap.SalesPerformanceResponse> getGenerateSalesPerformanceMethod;
    if ((getGenerateSalesPerformanceMethod = SalesHeatmapGrpc.getGenerateSalesPerformanceMethod) == null) {
      synchronized (SalesHeatmapGrpc.class) {
        if ((getGenerateSalesPerformanceMethod = SalesHeatmapGrpc.getGenerateSalesPerformanceMethod) == null) {
          SalesHeatmapGrpc.getGenerateSalesPerformanceMethod = getGenerateSalesPerformanceMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SalesHeatmap.EmptyRequest, generated.grpc.SalesHeatmap.SalesPerformanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateSalesPerformance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.SalesPerformanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesHeatmapMethodDescriptorSupplier("GenerateSalesPerformance"))
              .build();
        }
      }
    }
    return getGenerateSalesPerformanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.RelocationRequest,
      generated.grpc.SalesHeatmap.RelocationResponse> getSuggestProductRelocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestProductRelocation",
      requestType = generated.grpc.SalesHeatmap.RelocationRequest.class,
      responseType = generated.grpc.SalesHeatmap.RelocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.RelocationRequest,
      generated.grpc.SalesHeatmap.RelocationResponse> getSuggestProductRelocationMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SalesHeatmap.RelocationRequest, generated.grpc.SalesHeatmap.RelocationResponse> getSuggestProductRelocationMethod;
    if ((getSuggestProductRelocationMethod = SalesHeatmapGrpc.getSuggestProductRelocationMethod) == null) {
      synchronized (SalesHeatmapGrpc.class) {
        if ((getSuggestProductRelocationMethod = SalesHeatmapGrpc.getSuggestProductRelocationMethod) == null) {
          SalesHeatmapGrpc.getSuggestProductRelocationMethod = getSuggestProductRelocationMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SalesHeatmap.RelocationRequest, generated.grpc.SalesHeatmap.RelocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestProductRelocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.RelocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SalesHeatmap.RelocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesHeatmapMethodDescriptorSupplier("SuggestProductRelocation"))
              .build();
        }
      }
    }
    return getSuggestProductRelocationMethod;
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
     * Send sales performance from different areas
     * </pre>
     */
    public void generateSalesPerformance(generated.grpc.SalesHeatmap.EmptyRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesPerformanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateSalesPerformanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suggest location changes based on performance
     * </pre>
     */
    public void suggestProductRelocation(generated.grpc.SalesHeatmap.RelocationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.RelocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestProductRelocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateSalesPerformanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.SalesHeatmap.EmptyRequest,
                generated.grpc.SalesHeatmap.SalesPerformanceResponse>(
                  this, METHODID_GENERATE_SALES_PERFORMANCE)))
          .addMethod(
            getSuggestProductRelocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.SalesHeatmap.RelocationRequest,
                generated.grpc.SalesHeatmap.RelocationResponse>(
                  this, METHODID_SUGGEST_PRODUCT_RELOCATION)))
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
     * Send sales performance from different areas
     * </pre>
     */
    public void generateSalesPerformance(generated.grpc.SalesHeatmap.EmptyRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesPerformanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateSalesPerformanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suggest location changes based on performance
     * </pre>
     */
    public void suggestProductRelocation(generated.grpc.SalesHeatmap.RelocationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.RelocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestProductRelocationMethod(), getCallOptions()), request, responseObserver);
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
     * Send sales performance from different areas
     * </pre>
     */
    public generated.grpc.SalesHeatmap.SalesPerformanceResponse generateSalesPerformance(generated.grpc.SalesHeatmap.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateSalesPerformanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suggest location changes based on performance
     * </pre>
     */
    public generated.grpc.SalesHeatmap.RelocationResponse suggestProductRelocation(generated.grpc.SalesHeatmap.RelocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestProductRelocationMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Send sales performance from different areas
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.SalesHeatmap.SalesPerformanceResponse> generateSalesPerformance(
        generated.grpc.SalesHeatmap.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateSalesPerformanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suggest location changes based on performance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.SalesHeatmap.RelocationResponse> suggestProductRelocation(
        generated.grpc.SalesHeatmap.RelocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestProductRelocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_SALES_PERFORMANCE = 0;
  private static final int METHODID_SUGGEST_PRODUCT_RELOCATION = 1;

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
        case METHODID_GENERATE_SALES_PERFORMANCE:
          serviceImpl.generateSalesPerformance((generated.grpc.SalesHeatmap.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.SalesPerformanceResponse>) responseObserver);
          break;
        case METHODID_SUGGEST_PRODUCT_RELOCATION:
          serviceImpl.suggestProductRelocation((generated.grpc.SalesHeatmap.RelocationRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SalesHeatmap.RelocationResponse>) responseObserver);
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
              .addMethod(getGenerateSalesPerformanceMethod())
              .addMethod(getSuggestProductRelocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
