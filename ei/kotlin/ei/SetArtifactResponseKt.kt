// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializesetArtifactResponse")
public inline fun setArtifactResponse(block: ei.SetArtifactResponseKt.Dsl.() -> kotlin.Unit): ei.Ei.SetArtifactResponse =
  ei.SetArtifactResponseKt.Dsl._create(ei.Ei.SetArtifactResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.SetArtifactResponse`
 */
public object SetArtifactResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.SetArtifactResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.SetArtifactResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.SetArtifactResponse = _builder.build()

    /**
     * `optional bool success = 1;`
     */
    public var success: kotlin.Boolean
      @JvmName("getSuccess")
      get() = _builder.success
      @JvmName("setSuccess")
      set(value) {
        _builder.success = value
      }
    /**
     * `optional bool success = 1;`
     */
    public fun clearSuccess() {
      _builder.clearSuccess()
    }
    /**
     * `optional bool success = 1;`
     * @return Whether the success field is set.
     */
    public fun hasSuccess(): kotlin.Boolean {
      return _builder.hasSuccess()
    }

    /**
     * `optional uint64 original_item_id = 2;`
     */
    public var originalItemId: kotlin.Long
      @JvmName("getOriginalItemId")
      get() = _builder.originalItemId
      @JvmName("setOriginalItemId")
      set(value) {
        _builder.originalItemId = value
      }
    /**
     * `optional uint64 original_item_id = 2;`
     */
    public fun clearOriginalItemId() {
      _builder.clearOriginalItemId()
    }
    /**
     * `optional uint64 original_item_id = 2;`
     * @return Whether the originalItemId field is set.
     */
    public fun hasOriginalItemId(): kotlin.Boolean {
      return _builder.hasOriginalItemId()
    }

    /**
     * `optional string ei_user_id = 5;`
     */
    public var eiUserId: kotlin.String
      @JvmName("getEiUserId")
      get() = _builder.eiUserId
      @JvmName("setEiUserId")
      set(value) {
        _builder.eiUserId = value
      }
    /**
     * `optional string ei_user_id = 5;`
     */
    public fun clearEiUserId() {
      _builder.clearEiUserId()
    }
    /**
     * `optional string ei_user_id = 5;`
     * @return Whether the eiUserId field is set.
     */
    public fun hasEiUserId(): kotlin.Boolean {
      return _builder.hasEiUserId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.SetArtifactResponse.copy(block: `ei`.SetArtifactResponseKt.Dsl.() -> kotlin.Unit): ei.Ei.SetArtifactResponse =
  `ei`.SetArtifactResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

