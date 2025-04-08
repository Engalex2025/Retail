// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityMonitor.proto

package generated.grpc.SecurityMonitor;

public final class SecurityMonitorImpl {
  private SecurityMonitorImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_SecurityAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_SecurityAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_SecurityIncident_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_SecurityIncident_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_SecurityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_SecurityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SecurityMonitor.proto\022\006retail\"\007\n\005Empty" +
      "\"K\n\rSecurityAlert\022\020\n\010store_id\030\001 \001(\t\022\025\n\ra" +
      "lert_message\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\t\"=\n" +
      "\020SecurityIncident\022\023\n\013incident_id\030\001 \001(\t\022\024" +
      "\n\014action_taken\030\002 \001(\t\"@\n\020SecurityResponse" +
      "\022\023\n\013incident_id\030\001 \001(\t\022\027\n\017response_status" +
      "\030\002 \001(\t2\241\001\n\rStoreSecurity\022>\n\024StreamSecuri" +
      "tyAlerts\022\r.retail.Empty\032\025.retail.Securit" +
      "yAlert0\001\022P\n\026HandleSecurityIncident\022\030.ret" +
      "ail.SecurityIncident\032\030.retail.SecurityRe" +
      "sponse(\0010\001B7\n\036generated.grpc.SecurityMon" +
      "itorB\023SecurityMonitorImplP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_retail_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_retail_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_retail_SecurityAlert_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_retail_SecurityAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_SecurityAlert_descriptor,
        new java.lang.String[] { "StoreId", "AlertMessage", "Timestamp", });
    internal_static_retail_SecurityIncident_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_retail_SecurityIncident_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_SecurityIncident_descriptor,
        new java.lang.String[] { "IncidentId", "ActionTaken", });
    internal_static_retail_SecurityResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_retail_SecurityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_SecurityResponse_descriptor,
        new java.lang.String[] { "IncidentId", "ResponseStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
