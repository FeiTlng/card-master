// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthCheckServer.proto

package top.kuronoks.card.protos.models.health;

public final class HealthCheckServer {
  private HealthCheckServer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Ping)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 ping = 1;</code>
     * @return The ping.
     */
    long getPing();
  }
  /**
   * Protobuf type {@code Ping}
   */
  public static final class Ping extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Ping)
      PingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Ping.newBuilder() to construct.
    private Ping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Ping() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Ping();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return top.kuronoks.card.protos.models.health.HealthCheckServer.internal_static_Ping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return top.kuronoks.card.protos.models.health.HealthCheckServer.internal_static_Ping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.class, top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.Builder.class);
    }

    public static final int PING_FIELD_NUMBER = 1;
    private long ping_ = 0L;
    /**
     * <code>int64 ping = 1;</code>
     * @return The ping.
     */
    @java.lang.Override
    public long getPing() {
      return ping_;
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
      if (ping_ != 0L) {
        output.writeInt64(1, ping_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ping_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, ping_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof top.kuronoks.card.protos.models.health.HealthCheckServer.Ping)) {
        return super.equals(obj);
      }
      top.kuronoks.card.protos.models.health.HealthCheckServer.Ping other = (top.kuronoks.card.protos.models.health.HealthCheckServer.Ping) obj;

      if (getPing()
          != other.getPing()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPing());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping parseFrom(
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
    public static Builder newBuilder(top.kuronoks.card.protos.models.health.HealthCheckServer.Ping prototype) {
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
     * Protobuf type {@code Ping}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Ping)
        top.kuronoks.card.protos.models.health.HealthCheckServer.PingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return top.kuronoks.card.protos.models.health.HealthCheckServer.internal_static_Ping_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return top.kuronoks.card.protos.models.health.HealthCheckServer.internal_static_Ping_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.class, top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.Builder.class);
      }

      // Construct using top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        ping_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return top.kuronoks.card.protos.models.health.HealthCheckServer.internal_static_Ping_descriptor;
      }

      @java.lang.Override
      public top.kuronoks.card.protos.models.health.HealthCheckServer.Ping getDefaultInstanceForType() {
        return top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.getDefaultInstance();
      }

      @java.lang.Override
      public top.kuronoks.card.protos.models.health.HealthCheckServer.Ping build() {
        top.kuronoks.card.protos.models.health.HealthCheckServer.Ping result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public top.kuronoks.card.protos.models.health.HealthCheckServer.Ping buildPartial() {
        top.kuronoks.card.protos.models.health.HealthCheckServer.Ping result = new top.kuronoks.card.protos.models.health.HealthCheckServer.Ping(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(top.kuronoks.card.protos.models.health.HealthCheckServer.Ping result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ping_ = ping_;
        }
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
        if (other instanceof top.kuronoks.card.protos.models.health.HealthCheckServer.Ping) {
          return mergeFrom((top.kuronoks.card.protos.models.health.HealthCheckServer.Ping)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(top.kuronoks.card.protos.models.health.HealthCheckServer.Ping other) {
        if (other == top.kuronoks.card.protos.models.health.HealthCheckServer.Ping.getDefaultInstance()) return this;
        if (other.getPing() != 0L) {
          setPing(other.getPing());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                ping_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long ping_ ;
      /**
       * <code>int64 ping = 1;</code>
       * @return The ping.
       */
      @java.lang.Override
      public long getPing() {
        return ping_;
      }
      /**
       * <code>int64 ping = 1;</code>
       * @param value The ping to set.
       * @return This builder for chaining.
       */
      public Builder setPing(long value) {

        ping_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 ping = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPing() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ping_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Ping)
    }

    // @@protoc_insertion_point(class_scope:Ping)
    private static final top.kuronoks.card.protos.models.health.HealthCheckServer.Ping DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new top.kuronoks.card.protos.models.health.HealthCheckServer.Ping();
    }

    public static top.kuronoks.card.protos.models.health.HealthCheckServer.Ping getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Ping>
        PARSER = new com.google.protobuf.AbstractParser<Ping>() {
      @java.lang.Override
      public Ping parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Ping> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Ping> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public top.kuronoks.card.protos.models.health.HealthCheckServer.Ping getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ping_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HealthCheckServer.proto\"\024\n\004Ping\022\014\n\004pin" +
      "g\030\001 \001(\003B8\n!top.kuronoks.card.protos.models.he" +
      "althB\021HealthCheckServerH\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ping_descriptor,
        new java.lang.String[] { "Ping", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}