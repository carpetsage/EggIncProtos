// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializeauthenticatedMessage")
public inline fun authenticatedMessage(block: ei.AuthenticatedMessageKt.Dsl.() -> kotlin.Unit): ei.Ei.AuthenticatedMessage =
  ei.AuthenticatedMessageKt.Dsl._create(ei.Ei.AuthenticatedMessage.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.AuthenticatedMessage`
 */
public object AuthenticatedMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.AuthenticatedMessage.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.AuthenticatedMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.AuthenticatedMessage = _builder.build()

    /**
     * `optional bytes message = 1;`
     */
    public var message: com.google.protobuf.ByteString
      @JvmName("getMessage")
      get() = _builder.message
      @JvmName("setMessage")
      set(value) {
        _builder.message = value
      }
    /**
     * `optional bytes message = 1;`
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
    /**
     * `optional bytes message = 1;`
     * @return Whether the message field is set.
     */
    public fun hasMessage(): kotlin.Boolean {
      return _builder.hasMessage()
    }

    /**
     * `optional uint32 version = 3;`
     */
    public var version: kotlin.Int
      @JvmName("getVersion")
      get() = _builder.version
      @JvmName("setVersion")
      set(value) {
        _builder.version = value
      }
    /**
     * `optional uint32 version = 3;`
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * `optional uint32 version = 3;`
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }

    /**
     * `optional string code = 2;`
     */
    public var code: kotlin.String
      @JvmName("getCode")
      get() = _builder.code
      @JvmName("setCode")
      set(value) {
        _builder.code = value
      }
    /**
     * `optional string code = 2;`
     */
    public fun clearCode() {
      _builder.clearCode()
    }
    /**
     * `optional string code = 2;`
     * @return Whether the code field is set.
     */
    public fun hasCode(): kotlin.Boolean {
      return _builder.hasCode()
    }

    /**
     * `optional bool compressed = 4;`
     */
    public var compressed: kotlin.Boolean
      @JvmName("getCompressed")
      get() = _builder.compressed
      @JvmName("setCompressed")
      set(value) {
        _builder.compressed = value
      }
    /**
     * `optional bool compressed = 4;`
     */
    public fun clearCompressed() {
      _builder.clearCompressed()
    }
    /**
     * `optional bool compressed = 4;`
     * @return Whether the compressed field is set.
     */
    public fun hasCompressed(): kotlin.Boolean {
      return _builder.hasCompressed()
    }

    /**
     * `optional uint32 original_size = 5;`
     */
    public var originalSize: kotlin.Int
      @JvmName("getOriginalSize")
      get() = _builder.originalSize
      @JvmName("setOriginalSize")
      set(value) {
        _builder.originalSize = value
      }
    /**
     * `optional uint32 original_size = 5;`
     */
    public fun clearOriginalSize() {
      _builder.clearOriginalSize()
    }
    /**
     * `optional uint32 original_size = 5;`
     * @return Whether the originalSize field is set.
     */
    public fun hasOriginalSize(): kotlin.Boolean {
      return _builder.hasOriginalSize()
    }

    /**
     * `optional string user_id = 6;`
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.userId
      @JvmName("setUserId")
      set(value) {
        _builder.userId = value
      }
    /**
     * `optional string user_id = 6;`
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * `optional string user_id = 6;`
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.AuthenticatedMessage.copy(block: `ei`.AuthenticatedMessageKt.Dsl.() -> kotlin.Unit): ei.Ei.AuthenticatedMessage =
  `ei`.AuthenticatedMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

