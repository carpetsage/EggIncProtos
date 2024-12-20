// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializecollectContractArtifactRewardsRequest")
public inline fun collectContractArtifactRewardsRequest(block: ei.CollectContractArtifactRewardsRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.CollectContractArtifactRewardsRequest =
  ei.CollectContractArtifactRewardsRequestKt.Dsl._create(ei.Ei.CollectContractArtifactRewardsRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.CollectContractArtifactRewardsRequest`
 */
public object CollectContractArtifactRewardsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.CollectContractArtifactRewardsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.CollectContractArtifactRewardsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.CollectContractArtifactRewardsRequest = _builder.build()

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
    public val CollectContractArtifactRewardsRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * `optional string contract_identifier = 2;`
     */
    public var contractIdentifier: kotlin.String
      @JvmName("getContractIdentifier")
      get() = _builder.contractIdentifier
      @JvmName("setContractIdentifier")
      set(value) {
        _builder.contractIdentifier = value
      }
    /**
     * `optional string contract_identifier = 2;`
     */
    public fun clearContractIdentifier() {
      _builder.clearContractIdentifier()
    }
    /**
     * `optional string contract_identifier = 2;`
     * @return Whether the contractIdentifier field is set.
     */
    public fun hasContractIdentifier(): kotlin.Boolean {
      return _builder.hasContractIdentifier()
    }

    /**
     * `optional uint32 league = 5;`
     */
    public var league: kotlin.Int
      @JvmName("getLeague")
      get() = _builder.league
      @JvmName("setLeague")
      set(value) {
        _builder.league = value
      }
    /**
     * `optional uint32 league = 5;`
     */
    public fun clearLeague() {
      _builder.clearLeague()
    }
    /**
     * `optional uint32 league = 5;`
     * @return Whether the league field is set.
     */
    public fun hasLeague(): kotlin.Boolean {
      return _builder.hasLeague()
    }

    /**
     * `optional .ei.Contract.PlayerGrade grade = 6;`
     */
    public var grade: ei.Ei.Contract.PlayerGrade
      @JvmName("getGrade")
      get() = _builder.grade
      @JvmName("setGrade")
      set(value) {
        _builder.grade = value
      }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 6;`
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 6;`
     * @return Whether the grade field is set.
     */
    public fun hasGrade(): kotlin.Boolean {
      return _builder.hasGrade()
    }

    /**
     * `optional uint32 goal_index = 3;`
     */
    public var goalIndex: kotlin.Int
      @JvmName("getGoalIndex")
      get() = _builder.goalIndex
      @JvmName("setGoalIndex")
      set(value) {
        _builder.goalIndex = value
      }
    /**
     * `optional uint32 goal_index = 3;`
     */
    public fun clearGoalIndex() {
      _builder.clearGoalIndex()
    }
    /**
     * `optional uint32 goal_index = 3;`
     * @return Whether the goalIndex field is set.
     */
    public fun hasGoalIndex(): kotlin.Boolean {
      return _builder.hasGoalIndex()
    }

    /**
     * `optional .ei.MissionInfo.Spaceship best_ship = 4;`
     */
    public var bestShip: ei.Ei.MissionInfo.Spaceship
      @JvmName("getBestShip")
      get() = _builder.bestShip
      @JvmName("setBestShip")
      set(value) {
        _builder.bestShip = value
      }
    /**
     * `optional .ei.MissionInfo.Spaceship best_ship = 4;`
     */
    public fun clearBestShip() {
      _builder.clearBestShip()
    }
    /**
     * `optional .ei.MissionInfo.Spaceship best_ship = 4;`
     * @return Whether the bestShip field is set.
     */
    public fun hasBestShip(): kotlin.Boolean {
      return _builder.hasBestShip()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.CollectContractArtifactRewardsRequest.copy(block: `ei`.CollectContractArtifactRewardsRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.CollectContractArtifactRewardsRequest =
  `ei`.CollectContractArtifactRewardsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ei.Ei.CollectContractArtifactRewardsRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null

