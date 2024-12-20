// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializeconfigRequest")
public inline fun configRequest(block: ei.ConfigRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ConfigRequest =
  ei.ConfigRequestKt.Dsl._create(ei.Ei.ConfigRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.ConfigRequest`
 */
public object ConfigRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ConfigRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ConfigRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ConfigRequest = _builder.build()

    /**
     * `optional .ei.BasicRequestInfo rinfo = 1;`
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.rinfo
      @JvmName("setRinfo")
      set(value) {
        _builder.rinfo = value
      }
    /**
     * `optional .ei.BasicRequestInfo rinfo = 1;`
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * `optional .ei.BasicRequestInfo rinfo = 1;`
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val ConfigRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * `optional double soul_eggs = 2;`
     */
    public var soulEggs: kotlin.Double
      @JvmName("getSoulEggs")
      get() = _builder.soulEggs
      @JvmName("setSoulEggs")
      set(value) {
        _builder.soulEggs = value
      }
    /**
     * `optional double soul_eggs = 2;`
     */
    public fun clearSoulEggs() {
      _builder.clearSoulEggs()
    }
    /**
     * `optional double soul_eggs = 2;`
     * @return Whether the soulEggs field is set.
     */
    public fun hasSoulEggs(): kotlin.Boolean {
      return _builder.hasSoulEggs()
    }

    /**
     * `optional bool contracts_unlocked = 5;`
     */
    public var contractsUnlocked: kotlin.Boolean
      @JvmName("getContractsUnlocked")
      get() = _builder.contractsUnlocked
      @JvmName("setContractsUnlocked")
      set(value) {
        _builder.contractsUnlocked = value
      }
    /**
     * `optional bool contracts_unlocked = 5;`
     */
    public fun clearContractsUnlocked() {
      _builder.clearContractsUnlocked()
    }
    /**
     * `optional bool contracts_unlocked = 5;`
     * @return Whether the contractsUnlocked field is set.
     */
    public fun hasContractsUnlocked(): kotlin.Boolean {
      return _builder.hasContractsUnlocked()
    }

    /**
     * `optional bool artifacts_unlocked = 3;`
     */
    public var artifactsUnlocked: kotlin.Boolean
      @JvmName("getArtifactsUnlocked")
      get() = _builder.artifactsUnlocked
      @JvmName("setArtifactsUnlocked")
      set(value) {
        _builder.artifactsUnlocked = value
      }
    /**
     * `optional bool artifacts_unlocked = 3;`
     */
    public fun clearArtifactsUnlocked() {
      _builder.clearArtifactsUnlocked()
    }
    /**
     * `optional bool artifacts_unlocked = 3;`
     * @return Whether the artifactsUnlocked field is set.
     */
    public fun hasArtifactsUnlocked(): kotlin.Boolean {
      return _builder.hasArtifactsUnlocked()
    }

    /**
     * `optional bool fuel_tank_unlocked = 4;`
     */
    public var fuelTankUnlocked: kotlin.Boolean
      @JvmName("getFuelTankUnlocked")
      get() = _builder.fuelTankUnlocked
      @JvmName("setFuelTankUnlocked")
      set(value) {
        _builder.fuelTankUnlocked = value
      }
    /**
     * `optional bool fuel_tank_unlocked = 4;`
     */
    public fun clearFuelTankUnlocked() {
      _builder.clearFuelTankUnlocked()
    }
    /**
     * `optional bool fuel_tank_unlocked = 4;`
     * @return Whether the fuelTankUnlocked field is set.
     */
    public fun hasFuelTankUnlocked(): kotlin.Boolean {
      return _builder.hasFuelTankUnlocked()
    }

    /**
     * `optional bool pro_permit = 6;`
     */
    public var proPermit: kotlin.Boolean
      @JvmName("getProPermit")
      get() = _builder.proPermit
      @JvmName("setProPermit")
      set(value) {
        _builder.proPermit = value
      }
    /**
     * `optional bool pro_permit = 6;`
     */
    public fun clearProPermit() {
      _builder.clearProPermit()
    }
    /**
     * `optional bool pro_permit = 6;`
     * @return Whether the proPermit field is set.
     */
    public fun hasProPermit(): kotlin.Boolean {
      return _builder.hasProPermit()
    }

    /**
     * `optional bool ultra = 7;`
     */
    public var ultra: kotlin.Boolean
      @JvmName("getUltra")
      get() = _builder.ultra
      @JvmName("setUltra")
      set(value) {
        _builder.ultra = value
      }
    /**
     * `optional bool ultra = 7;`
     */
    public fun clearUltra() {
      _builder.clearUltra()
    }
    /**
     * `optional bool ultra = 7;`
     * @return Whether the ultra field is set.
     */
    public fun hasUltra(): kotlin.Boolean {
      return _builder.hasUltra()
    }

    /**
     * `optional string tips_checksum = 8;`
     */
    public var tipsChecksum: kotlin.String
      @JvmName("getTipsChecksum")
      get() = _builder.tipsChecksum
      @JvmName("setTipsChecksum")
      set(value) {
        _builder.tipsChecksum = value
      }
    /**
     * `optional string tips_checksum = 8;`
     */
    public fun clearTipsChecksum() {
      _builder.clearTipsChecksum()
    }
    /**
     * `optional string tips_checksum = 8;`
     * @return Whether the tipsChecksum field is set.
     */
    public fun hasTipsChecksum(): kotlin.Boolean {
      return _builder.hasTipsChecksum()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ConfigRequest.copy(block: `ei`.ConfigRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ConfigRequest =
  `ei`.ConfigRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ei.Ei.ConfigRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null

