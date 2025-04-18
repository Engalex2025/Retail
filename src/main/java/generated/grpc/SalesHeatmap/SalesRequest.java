// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesHeatmap.proto

package generated.grpc.SalesHeatmap;

/**
 * Protobuf type {@code retail.SalesRequest}
 */
public final class SalesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:retail.SalesRequest)
    SalesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SalesRequest.newBuilder() to construct.
  private SalesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SalesRequest() {
    sectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SalesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SalesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sectionId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.grpc.SalesHeatmap.SalesHeatmapImpl.internal_static_retail_SalesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.SalesHeatmap.SalesHeatmapImpl.internal_static_retail_SalesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.SalesHeatmap.SalesRequest.class, generated.grpc.SalesHeatmap.SalesRequest.Builder.class);
  }

  public static final int SECTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sectionId_;
  /**
   * <code>string section_id = 1;</code>
   * @return The sectionId.
   */
  @java.lang.Override
  public java.lang.String getSectionId() {
    java.lang.Object ref = sectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sectionId_ = s;
      return s;
    }
  }
  /**
   * <code>string section_id = 1;</code>
   * @return The bytes for sectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSectionIdBytes() {
    java.lang.Object ref = sectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sectionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sectionId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.grpc.SalesHeatmap.SalesRequest)) {
      return super.equals(obj);
    }
    generated.grpc.SalesHeatmap.SalesRequest other = (generated.grpc.SalesHeatmap.SalesRequest) obj;

    if (!getSectionId()
        .equals(other.getSectionId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSectionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.SalesHeatmap.SalesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.grpc.SalesHeatmap.SalesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code retail.SalesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:retail.SalesRequest)
      generated.grpc.SalesHeatmap.SalesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.SalesHeatmap.SalesHeatmapImpl.internal_static_retail_SalesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.SalesHeatmap.SalesHeatmapImpl.internal_static_retail_SalesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.SalesHeatmap.SalesRequest.class, generated.grpc.SalesHeatmap.SalesRequest.Builder.class);
    }

    // Construct using generated.grpc.SalesHeatmap.SalesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sectionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.SalesHeatmap.SalesHeatmapImpl.internal_static_retail_SalesRequest_descriptor;
    }

    @java.lang.Override
    public generated.grpc.SalesHeatmap.SalesRequest getDefaultInstanceForType() {
      return generated.grpc.SalesHeatmap.SalesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.SalesHeatmap.SalesRequest build() {
      generated.grpc.SalesHeatmap.SalesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.SalesHeatmap.SalesRequest buildPartial() {
      generated.grpc.SalesHeatmap.SalesRequest result = new generated.grpc.SalesHeatmap.SalesRequest(this);
      result.sectionId_ = sectionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.grpc.SalesHeatmap.SalesRequest) {
        return mergeFrom((generated.grpc.SalesHeatmap.SalesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.SalesHeatmap.SalesRequest other) {
      if (other == generated.grpc.SalesHeatmap.SalesRequest.getDefaultInstance()) return this;
      if (!other.getSectionId().isEmpty()) {
        sectionId_ = other.sectionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.grpc.SalesHeatmap.SalesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.SalesHeatmap.SalesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sectionId_ = "";
    /**
     * <code>string section_id = 1;</code>
     * @return The sectionId.
     */
    public java.lang.String getSectionId() {
      java.lang.Object ref = sectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string section_id = 1;</code>
     * @return The bytes for sectionId.
     */
    public com.google.protobuf.ByteString
        getSectionIdBytes() {
      java.lang.Object ref = sectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string section_id = 1;</code>
     * @param value The sectionId to set.
     * @return This builder for chaining.
     */
    public Builder setSectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string section_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSectionId() {
      
      sectionId_ = getDefaultInstance().getSectionId();
      onChanged();
      return this;
    }
    /**
     * <code>string section_id = 1;</code>
     * @param value The bytes for sectionId to set.
     * @return This builder for chaining.
     */
    public Builder setSectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sectionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:retail.SalesRequest)
  }

  // @@protoc_insertion_point(class_scope:retail.SalesRequest)
  private static final generated.grpc.SalesHeatmap.SalesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.SalesHeatmap.SalesRequest();
  }

  public static generated.grpc.SalesHeatmap.SalesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SalesRequest>
      PARSER = new com.google.protobuf.AbstractParser<SalesRequest>() {
    @java.lang.Override
    public SalesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SalesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SalesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SalesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.SalesHeatmap.SalesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

