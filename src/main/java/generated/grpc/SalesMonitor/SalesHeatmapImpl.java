// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesHeatmap.proto

package generated.grpc.SalesMonitor;

public final class SalesHeatmapImpl {
  private SalesHeatmapImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_SalesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_SalesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retail_SalesUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retail_SalesUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SalesHeatmap.proto\022\006retail\"\"\n\014SalesReq" +
      "uest\022\022\n\nsection_id\030\001 \001(\t\"G\n\013SalesUpdate\022" +
      "\022\n\nsection_id\030\001 \001(\t\022\021\n\tnew_sales\030\002 \001(\005\022\021" +
      "\n\ttimestamp\030\003 \001(\t2Q\n\014SalesHeatmap\022A\n\022Str" +
      "eamSalesUpdates\022\024.retail.SalesRequest\032\023." +
      "retail.SalesUpdate0\001B1\n\033generated.grpc.S" +
      "alesMonitorB\020SalesHeatmapImplP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_retail_SalesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_retail_SalesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_SalesRequest_descriptor,
        new java.lang.String[] { "SectionId", });
    internal_static_retail_SalesUpdate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_retail_SalesUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retail_SalesUpdate_descriptor,
        new java.lang.String[] { "SectionId", "NewSales", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
