// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializeautoJoinCoopRequest")
public inline fun autoJoinCoopRequest(block: ei.AutoJoinCoopRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.AutoJoinCoopRequest =
  ei.AutoJoinCoopRequestKt.Dsl._create(ei.Ei.AutoJoinCoopRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.AutoJoinCoopRequest`
 */
public object AutoJoinCoopRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.AutoJoinCoopRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.AutoJoinCoopRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.AutoJoinCoopRequest = _builder.build()

    /**
     * `optional .ei.BasicRequestInfo rinfo = 9;`
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.rinfo
      @JvmName("setRinfo")
      set(value) {
        _builder.rinfo = value
      }
    /**
     * `optional .ei.BasicRequestInfo rinfo = 9;`
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * `optional .ei.BasicRequestInfo rinfo = 9;`
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val AutoJoinCoopRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * `optional string contract_identifier = 1;`
     */
    public var contractIdentifier: kotlin.String
      @JvmName("getContractIdentifier")
      get() = _builder.contractIdentifier
      @JvmName("setContractIdentifier")
      set(value) {
        _builder.contractIdentifier = value
      }
    /**
     * `optional string contract_identifier = 1;`
     */
    public fun clearContractIdentifier() {
      _builder.clearContractIdentifier()
    }
    /**
     * `optional string contract_identifier = 1;`
     * @return Whether the contractIdentifier field is set.
     */
    public fun hasContractIdentifier(): kotlin.Boolean {
      return _builder.hasContractIdentifier()
    }

    /**
     * `optional string user_id = 2;`
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.userId
      @JvmName("setUserId")
      set(value) {
        _builder.userId = value
      }
    /**
     * `optional string user_id = 2;`
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * `optional string user_id = 2;`
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }

    /**
     * `optional string user_name = 3;`
     */
    public var userName: kotlin.String
      @JvmName("getUserName")
      get() = _builder.userName
      @JvmName("setUserName")
      set(value) {
        _builder.userName = value
      }
    /**
     * `optional string user_name = 3;`
     */
    public fun clearUserName() {
      _builder.clearUserName()
    }
    /**
     * `optional string user_name = 3;`
     * @return Whether the userName field is set.
     */
    public fun hasUserName(): kotlin.Boolean {
      return _builder.hasUserName()
    }

    /**
     * `optional double soul_power = 4;`
     */
    public var soulPower: kotlin.Double
      @JvmName("getSoulPower")
      get() = _builder.soulPower
      @JvmName("setSoulPower")
      set(value) {
        _builder.soulPower = value
      }
    /**
     * `optional double soul_power = 4;`
     */
    public fun clearSoulPower() {
      _builder.clearSoulPower()
    }
    /**
     * `optional double soul_power = 4;`
     * @return Whether the soulPower field is set.
     */
    public fun hasSoulPower(): kotlin.Boolean {
      return _builder.hasSoulPower()
    }

    /**
     * `optional double eop = 10;`
     */
    public var eop: kotlin.Double
      @JvmName("getEop")
      get() = _builder.eop
      @JvmName("setEop")
      set(value) {
        _builder.eop = value
      }
    /**
     * `optional double eop = 10;`
     */
    public fun clearEop() {
      _builder.clearEop()
    }
    /**
     * `optional double eop = 10;`
     * @return Whether the eop field is set.
     */
    public fun hasEop(): kotlin.Boolean {
      return _builder.hasEop()
    }

    /**
     * `optional uint32 league = 8;`
     */
    public var league: kotlin.Int
      @JvmName("getLeague")
      get() = _builder.league
      @JvmName("setLeague")
      set(value) {
        _builder.league = value
      }
    /**
     * `optional uint32 league = 8;`
     */
    public fun clearLeague() {
      _builder.clearLeague()
    }
    /**
     * `optional uint32 league = 8;`
     * @return Whether the league field is set.
     */
    public fun hasLeague(): kotlin.Boolean {
      return _builder.hasLeague()
    }

    /**
     * `optional .ei.Contract.PlayerGrade grade = 12;`
     */
    public var grade: ei.Ei.Contract.PlayerGrade
      @JvmName("getGrade")
      get() = _builder.grade
      @JvmName("setGrade")
      set(value) {
        _builder.grade = value
      }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 12;`
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 12;`
     * @return Whether the grade field is set.
     */
    public fun hasGrade(): kotlin.Boolean {
      return _builder.hasGrade()
    }

    /**
     * `optional bool points_replay = 14;`
     */
    public var pointsReplay: kotlin.Boolean
      @JvmName("getPointsReplay")
      get() = _builder.pointsReplay
      @JvmName("setPointsReplay")
      set(value) {
        _builder.pointsReplay = value
      }
    /**
     * `optional bool points_replay = 14;`
     */
    public fun clearPointsReplay() {
      _builder.clearPointsReplay()
    }
    /**
     * `optional bool points_replay = 14;`
     * @return Whether the pointsReplay field is set.
     */
    public fun hasPointsReplay(): kotlin.Boolean {
      return _builder.hasPointsReplay()
    }

    /**
     * `optional double seconds_remaining = 5;`
     */
    public var secondsRemaining: kotlin.Double
      @JvmName("getSecondsRemaining")
      get() = _builder.secondsRemaining
      @JvmName("setSecondsRemaining")
      set(value) {
        _builder.secondsRemaining = value
      }
    /**
     * `optional double seconds_remaining = 5;`
     */
    public fun clearSecondsRemaining() {
      _builder.clearSecondsRemaining()
    }
    /**
     * `optional double seconds_remaining = 5;`
     * @return Whether the secondsRemaining field is set.
     */
    public fun hasSecondsRemaining(): kotlin.Boolean {
      return _builder.hasSecondsRemaining()
    }

    /**
     * `optional .ei.Platform platform = 6;`
     */
    public var platform: ei.Ei.Platform
      @JvmName("getPlatform")
      get() = _builder.platform
      @JvmName("setPlatform")
      set(value) {
        _builder.platform = value
      }
    /**
     * `optional .ei.Platform platform = 6;`
     */
    public fun clearPlatform() {
      _builder.clearPlatform()
    }
    /**
     * `optional .ei.Platform platform = 6;`
     * @return Whether the platform field is set.
     */
    public fun hasPlatform(): kotlin.Boolean {
      return _builder.hasPlatform()
    }

    /**
     * `optional uint32 client_version = 7;`
     */
    public var clientVersion: kotlin.Int
      @JvmName("getClientVersion")
      get() = _builder.clientVersion
      @JvmName("setClientVersion")
      set(value) {
        _builder.clientVersion = value
      }
    /**
     * `optional uint32 client_version = 7;`
     */
    public fun clearClientVersion() {
      _builder.clearClientVersion()
    }
    /**
     * `optional uint32 client_version = 7;`
     * @return Whether the clientVersion field is set.
     */
    public fun hasClientVersion(): kotlin.Boolean {
      return _builder.hasClientVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.AutoJoinCoopRequest.copy(block: `ei`.AutoJoinCoopRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.AutoJoinCoopRequest =
  `ei`.AutoJoinCoopRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ei.Ei.AutoJoinCoopRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null

