// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesHeatmap.proto

package generated.grpc.SalesHeatmap;

public interface SalesUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:retail.SalesUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string section_id = 1;</code>
   * @return The sectionId.
   */
  java.lang.String getSectionId();
  /**
   * <code>string section_id = 1;</code>
   * @return The bytes for sectionId.
   */
  com.google.protobuf.ByteString
      getSectionIdBytes();

  /**
   * <code>int32 new_sales = 2;</code>
   * @return The newSales.
   */
  int getNewSales();

  /**
   * <code>string timestamp = 3;</code>
   * @return The timestamp.
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 3;</code>
   * @return The bytes for timestamp.
   */
  com.google.protobuf.ByteString
      getTimestampBytes();
}
