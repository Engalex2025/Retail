// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesHeatmap.proto

package generated.grpc.SalesHeatmap;

public interface RelocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:retail.RelocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .retail.AreaPerformance performances = 1;</code>
   */
  java.util.List<generated.grpc.SalesHeatmap.AreaPerformance> 
      getPerformancesList();
  /**
   * <code>repeated .retail.AreaPerformance performances = 1;</code>
   */
  generated.grpc.SalesHeatmap.AreaPerformance getPerformances(int index);
  /**
   * <code>repeated .retail.AreaPerformance performances = 1;</code>
   */
  int getPerformancesCount();
  /**
   * <code>repeated .retail.AreaPerformance performances = 1;</code>
   */
  java.util.List<? extends generated.grpc.SalesHeatmap.AreaPerformanceOrBuilder> 
      getPerformancesOrBuilderList();
  /**
   * <code>repeated .retail.AreaPerformance performances = 1;</code>
   */
  generated.grpc.SalesHeatmap.AreaPerformanceOrBuilder getPerformancesOrBuilder(
      int index);
}
