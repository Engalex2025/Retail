package generated.grpc.SecurityMonitor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: SecurityMonitor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreSecurityGrpc {

  private StoreSecurityGrpc() {}

  public static final String SERVICE_NAME = "retail.StoreSecurity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.Empty,
      generated.grpc.SecurityMonitor.SecurityAlert> getStreamSecurityAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSecurityAlerts",
      requestType = generated.grpc.SecurityMonitor.Empty.class,
      responseType = generated.grpc.SecurityMonitor.SecurityAlert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.Empty,
      generated.grpc.SecurityMonitor.SecurityAlert> getStreamSecurityAlertsMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.Empty, generated.grpc.SecurityMonitor.SecurityAlert> getStreamSecurityAlertsMethod;
    if ((getStreamSecurityAlertsMethod = StoreSecurityGrpc.getStreamSecurityAlertsMethod) == null) {
      synchronized (StoreSecurityGrpc.class) {
        if ((getStreamSecurityAlertsMethod = StoreSecurityGrpc.getStreamSecurityAlertsMethod) == null) {
          StoreSecurityGrpc.getStreamSecurityAlertsMethod = getStreamSecurityAlertsMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SecurityMonitor.Empty, generated.grpc.SecurityMonitor.SecurityAlert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSecurityAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SecurityMonitor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SecurityMonitor.SecurityAlert.getDefaultInstance()))
              .setSchemaDescriptor(new StoreSecurityMethodDescriptorSupplier("StreamSecurityAlerts"))
              .build();
        }
      }
    }
    return getStreamSecurityAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.SecurityIncident,
      generated.grpc.SecurityMonitor.SecurityResponse> getHandleSecurityIncidentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleSecurityIncident",
      requestType = generated.grpc.SecurityMonitor.SecurityIncident.class,
      responseType = generated.grpc.SecurityMonitor.SecurityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.SecurityIncident,
      generated.grpc.SecurityMonitor.SecurityResponse> getHandleSecurityIncidentMethod() {
    io.grpc.MethodDescriptor<generated.grpc.SecurityMonitor.SecurityIncident, generated.grpc.SecurityMonitor.SecurityResponse> getHandleSecurityIncidentMethod;
    if ((getHandleSecurityIncidentMethod = StoreSecurityGrpc.getHandleSecurityIncidentMethod) == null) {
      synchronized (StoreSecurityGrpc.class) {
        if ((getHandleSecurityIncidentMethod = StoreSecurityGrpc.getHandleSecurityIncidentMethod) == null) {
          StoreSecurityGrpc.getHandleSecurityIncidentMethod = getHandleSecurityIncidentMethod =
              io.grpc.MethodDescriptor.<generated.grpc.SecurityMonitor.SecurityIncident, generated.grpc.SecurityMonitor.SecurityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleSecurityIncident"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SecurityMonitor.SecurityIncident.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.SecurityMonitor.SecurityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreSecurityMethodDescriptorSupplier("HandleSecurityIncident"))
              .build();
        }
      }
    }
    return getHandleSecurityIncidentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreSecurityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreSecurityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreSecurityStub>() {
        @java.lang.Override
        public StoreSecurityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreSecurityStub(channel, callOptions);
        }
      };
    return StoreSecurityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreSecurityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreSecurityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreSecurityBlockingStub>() {
        @java.lang.Override
        public StoreSecurityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreSecurityBlockingStub(channel, callOptions);
        }
      };
    return StoreSecurityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreSecurityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreSecurityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreSecurityFutureStub>() {
        @java.lang.Override
        public StoreSecurityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreSecurityFutureStub(channel, callOptions);
        }
      };
    return StoreSecurityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreSecurityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server streams security alerts in real-time (Server Streaming)
     * </pre>
     */
    public void streamSecurityAlerts(generated.grpc.SecurityMonitor.Empty request,
        io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityAlert> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamSecurityAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Two-way communication between security team and system (Bidirectional Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityIncident> handleSecurityIncident(
        io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHandleSecurityIncidentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamSecurityAlertsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.SecurityMonitor.Empty,
                generated.grpc.SecurityMonitor.SecurityAlert>(
                  this, METHODID_STREAM_SECURITY_ALERTS)))
          .addMethod(
            getHandleSecurityIncidentMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.SecurityMonitor.SecurityIncident,
                generated.grpc.SecurityMonitor.SecurityResponse>(
                  this, METHODID_HANDLE_SECURITY_INCIDENT)))
          .build();
    }
  }

  /**
   */
  public static final class StoreSecurityStub extends io.grpc.stub.AbstractAsyncStub<StoreSecurityStub> {
    private StoreSecurityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreSecurityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreSecurityStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streams security alerts in real-time (Server Streaming)
     * </pre>
     */
    public void streamSecurityAlerts(generated.grpc.SecurityMonitor.Empty request,
        io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityAlert> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamSecurityAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Two-way communication between security team and system (Bidirectional Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityIncident> handleSecurityIncident(
        io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHandleSecurityIncidentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StoreSecurityBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreSecurityBlockingStub> {
    private StoreSecurityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreSecurityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreSecurityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streams security alerts in real-time (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<generated.grpc.SecurityMonitor.SecurityAlert> streamSecurityAlerts(
        generated.grpc.SecurityMonitor.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamSecurityAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreSecurityFutureStub extends io.grpc.stub.AbstractFutureStub<StoreSecurityFutureStub> {
    private StoreSecurityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreSecurityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreSecurityFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_SECURITY_ALERTS = 0;
  private static final int METHODID_HANDLE_SECURITY_INCIDENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreSecurityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreSecurityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_SECURITY_ALERTS:
          serviceImpl.streamSecurityAlerts((generated.grpc.SecurityMonitor.Empty) request,
              (io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityAlert>) responseObserver);
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
        case METHODID_HANDLE_SECURITY_INCIDENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handleSecurityIncident(
              (io.grpc.stub.StreamObserver<generated.grpc.SecurityMonitor.SecurityResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StoreSecurityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreSecurityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.SecurityMonitor.SecurityMonitorImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreSecurity");
    }
  }

  private static final class StoreSecurityFileDescriptorSupplier
      extends StoreSecurityBaseDescriptorSupplier {
    StoreSecurityFileDescriptorSupplier() {}
  }

  private static final class StoreSecurityMethodDescriptorSupplier
      extends StoreSecurityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreSecurityMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreSecurityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreSecurityFileDescriptorSupplier())
              .addMethod(getStreamSecurityAlertsMethod())
              .addMethod(getHandleSecurityIncidentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
