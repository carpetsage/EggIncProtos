//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeshowcaseRoyaltyDeliveryConfirmation")
public inline fun showcaseRoyaltyDeliveryConfirmation(block: ei.ShowcaseRoyaltyDeliveryConfirmationKt.Dsl.() -> kotlin.Unit): ei.Ei.ShowcaseRoyaltyDeliveryConfirmation =
  ei.ShowcaseRoyaltyDeliveryConfirmationKt.Dsl._create(ei.Ei.ShowcaseRoyaltyDeliveryConfirmation.newBuilder()).apply { block() }._build()
public object ShowcaseRoyaltyDeliveryConfirmationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ShowcaseRoyaltyDeliveryConfirmation.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ShowcaseRoyaltyDeliveryConfirmation.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ShowcaseRoyaltyDeliveryConfirmation = _builder.build()

    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 3;</code>
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.getRinfo()
      @JvmName("setRinfo")
      set(value) {
        _builder.setRinfo(value)
      }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 3;</code>
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 3;</code>
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val ShowcaseRoyaltyDeliveryConfirmationKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string ids = 1;</code>
     * @return A list containing the ids.
     */
    public val ids: com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIdsList()
      )
    /**
     * <code>repeated string ids = 1;</code>
     * @param value The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.add(value: kotlin.String) {
      _builder.addIds(value)
    }
    /**
     * <code>repeated string ids = 1;</code>
     * @param value The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string ids = 1;</code>
     * @param values The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllIds(values)
    }
    /**
     * <code>repeated string ids = 1;</code>
     * @param values The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIds")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setIds(index, value)
    }/**
     * <code>repeated string ids = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, IdsProxy>.clear() {
      _builder.clearIds()
    }
    /**
     * <code>optional uint32 amount = 2;</code>
     */
    public var amount: kotlin.Int
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>optional uint32 amount = 2;</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
    /**
     * <code>optional uint32 amount = 2;</code>
     * @return Whether the amount field is set.
     */
    public fun hasAmount(): kotlin.Boolean {
      return _builder.hasAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ShowcaseRoyaltyDeliveryConfirmation.copy(block: ei.ShowcaseRoyaltyDeliveryConfirmationKt.Dsl.() -> kotlin.Unit): ei.Ei.ShowcaseRoyaltyDeliveryConfirmation =
  ei.ShowcaseRoyaltyDeliveryConfirmationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.ShowcaseRoyaltyDeliveryConfirmationOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null
