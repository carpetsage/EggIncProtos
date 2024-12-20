// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializeperiodicalsResponse")
public inline fun periodicalsResponse(block: ei.PeriodicalsResponseKt.Dsl.() -> kotlin.Unit): ei.Ei.PeriodicalsResponse =
  ei.PeriodicalsResponseKt.Dsl._create(ei.Ei.PeriodicalsResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.PeriodicalsResponse`
 */
public object PeriodicalsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.PeriodicalsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.PeriodicalsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.PeriodicalsResponse = _builder.build()

    /**
     * `optional .ei.SalesInfo sales = 1;`
     */
    public var sales: ei.Ei.SalesInfo
      @JvmName("getSales")
      get() = _builder.sales
      @JvmName("setSales")
      set(value) {
        _builder.sales = value
      }
    /**
     * `optional .ei.SalesInfo sales = 1;`
     */
    public fun clearSales() {
      _builder.clearSales()
    }
    /**
     * `optional .ei.SalesInfo sales = 1;`
     * @return Whether the sales field is set.
     */
    public fun hasSales(): kotlin.Boolean {
      return _builder.hasSales()
    }
    public val PeriodicalsResponseKt.Dsl.salesOrNull: ei.Ei.SalesInfo?
      get() = _builder.salesOrNull

    /**
     * `optional .ei.EggIncCurrentEvents events = 2;`
     */
    public var events: ei.Ei.EggIncCurrentEvents
      @JvmName("getEvents")
      get() = _builder.events
      @JvmName("setEvents")
      set(value) {
        _builder.events = value
      }
    /**
     * `optional .ei.EggIncCurrentEvents events = 2;`
     */
    public fun clearEvents() {
      _builder.clearEvents()
    }
    /**
     * `optional .ei.EggIncCurrentEvents events = 2;`
     * @return Whether the events field is set.
     */
    public fun hasEvents(): kotlin.Boolean {
      return _builder.hasEvents()
    }
    public val PeriodicalsResponseKt.Dsl.eventsOrNull: ei.Ei.EggIncCurrentEvents?
      get() = _builder.eventsOrNull

    /**
     * `optional .ei.ContractsResponse contracts = 3;`
     */
    public var contracts: ei.Ei.ContractsResponse
      @JvmName("getContracts")
      get() = _builder.contracts
      @JvmName("setContracts")
      set(value) {
        _builder.contracts = value
      }
    /**
     * `optional .ei.ContractsResponse contracts = 3;`
     */
    public fun clearContracts() {
      _builder.clearContracts()
    }
    /**
     * `optional .ei.ContractsResponse contracts = 3;`
     * @return Whether the contracts field is set.
     */
    public fun hasContracts(): kotlin.Boolean {
      return _builder.hasContracts()
    }
    public val PeriodicalsResponseKt.Dsl.contractsOrNull: ei.Ei.ContractsResponse?
      get() = _builder.contractsOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EvaluationsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     */
     public val evaluations: com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.evaluationsList
      )
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     * @param value The evaluations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvaluations")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.add(value: ei.Ei.ContractEvaluation) {
      _builder.addEvaluations(value)
    }
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     * @param value The evaluations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvaluations")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.plusAssign(value: ei.Ei.ContractEvaluation) {
      add(value)
    }
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     * @param values The evaluations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvaluations")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ContractEvaluation>) {
      _builder.addAllEvaluations(values)
    }
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     * @param values The evaluations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvaluations")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ContractEvaluation>) {
      addAll(values)
    }
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     * @param index The index to set the value at.
     * @param value The evaluations to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvaluations")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.set(index: kotlin.Int, value: ei.Ei.ContractEvaluation) {
      _builder.setEvaluations(index, value)
    }
    /**
     * `repeated .ei.ContractEvaluation evaluations = 8;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvaluations")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation, EvaluationsProxy>.clear() {
      _builder.clearEvaluations()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class GiftsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     */
     public val gifts: com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.giftsList
      )
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     * @param value The gifts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addGifts")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.add(value: ei.Ei.ServerGift) {
      _builder.addGifts(value)
    }
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     * @param value The gifts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignGifts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.plusAssign(value: ei.Ei.ServerGift) {
      add(value)
    }
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     * @param values The gifts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllGifts")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ServerGift>) {
      _builder.addAllGifts(values)
    }
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     * @param values The gifts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllGifts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ServerGift>) {
      addAll(values)
    }
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     * @param index The index to set the value at.
     * @param value The gifts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setGifts")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.set(index: kotlin.Int, value: ei.Ei.ServerGift) {
      _builder.setGifts(index, value)
    }
    /**
     * `repeated .ei.ServerGift gifts = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearGifts")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ServerGift, GiftsProxy>.clear() {
      _builder.clearGifts()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ArtifactCasesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     */
     public val artifactCases: com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.artifactCasesList
      )
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     * @param value The artifactCases to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addArtifactCases")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.add(value: ei.Ei.CompleteMissionResponse) {
      _builder.addArtifactCases(value)
    }
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     * @param value The artifactCases to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignArtifactCases")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.plusAssign(value: ei.Ei.CompleteMissionResponse) {
      add(value)
    }
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     * @param values The artifactCases to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllArtifactCases")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.CompleteMissionResponse>) {
      _builder.addAllArtifactCases(values)
    }
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     * @param values The artifactCases to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllArtifactCases")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.CompleteMissionResponse>) {
      addAll(values)
    }
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     * @param index The index to set the value at.
     * @param value The artifactCases to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setArtifactCases")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.set(index: kotlin.Int, value: ei.Ei.CompleteMissionResponse) {
      _builder.setArtifactCases(index, value)
    }
    /**
     * `repeated .ei.CompleteMissionResponse artifact_cases = 9;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearArtifactCases")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.CompleteMissionResponse, ArtifactCasesProxy>.clear() {
      _builder.clearArtifactCases()
    }


    /**
     * `optional .ei.LiveConfig live_config = 5;`
     */
    public var liveConfig: ei.Ei.LiveConfig
      @JvmName("getLiveConfig")
      get() = _builder.liveConfig
      @JvmName("setLiveConfig")
      set(value) {
        _builder.liveConfig = value
      }
    /**
     * `optional .ei.LiveConfig live_config = 5;`
     */
    public fun clearLiveConfig() {
      _builder.clearLiveConfig()
    }
    /**
     * `optional .ei.LiveConfig live_config = 5;`
     * @return Whether the liveConfig field is set.
     */
    public fun hasLiveConfig(): kotlin.Boolean {
      return _builder.hasLiveConfig()
    }
    public val PeriodicalsResponseKt.Dsl.liveConfigOrNull: ei.Ei.LiveConfig?
      get() = _builder.liveConfigOrNull

    /**
     * `optional .ei.MailDB mail_bag = 6;`
     */
    public var mailBag: ei.Ei.MailDB
      @JvmName("getMailBag")
      get() = _builder.mailBag
      @JvmName("setMailBag")
      set(value) {
        _builder.mailBag = value
      }
    /**
     * `optional .ei.MailDB mail_bag = 6;`
     */
    public fun clearMailBag() {
      _builder.clearMailBag()
    }
    /**
     * `optional .ei.MailDB mail_bag = 6;`
     * @return Whether the mailBag field is set.
     */
    public fun hasMailBag(): kotlin.Boolean {
      return _builder.hasMailBag()
    }
    public val PeriodicalsResponseKt.Dsl.mailBagOrNull: ei.Ei.MailDB?
      get() = _builder.mailBagOrNull

    /**
     * `optional .ei.ContractPlayerInfo contract_player_info = 7;`
     */
    public var contractPlayerInfo: ei.Ei.ContractPlayerInfo
      @JvmName("getContractPlayerInfo")
      get() = _builder.contractPlayerInfo
      @JvmName("setContractPlayerInfo")
      set(value) {
        _builder.contractPlayerInfo = value
      }
    /**
     * `optional .ei.ContractPlayerInfo contract_player_info = 7;`
     */
    public fun clearContractPlayerInfo() {
      _builder.clearContractPlayerInfo()
    }
    /**
     * `optional .ei.ContractPlayerInfo contract_player_info = 7;`
     * @return Whether the contractPlayerInfo field is set.
     */
    public fun hasContractPlayerInfo(): kotlin.Boolean {
      return _builder.hasContractPlayerInfo()
    }
    public val PeriodicalsResponseKt.Dsl.contractPlayerInfoOrNull: ei.Ei.ContractPlayerInfo?
      get() = _builder.contractPlayerInfoOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ShowcaseRoyaltiesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     */
     public val showcaseRoyalties: com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.showcaseRoyaltiesList
      )
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     * @param value The showcaseRoyalties to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addShowcaseRoyalties")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.add(value: ei.Ei.PeriodicalsResponse.RoyaltyInfo) {
      _builder.addShowcaseRoyalties(value)
    }
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     * @param value The showcaseRoyalties to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignShowcaseRoyalties")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.plusAssign(value: ei.Ei.PeriodicalsResponse.RoyaltyInfo) {
      add(value)
    }
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     * @param values The showcaseRoyalties to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllShowcaseRoyalties")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.PeriodicalsResponse.RoyaltyInfo>) {
      _builder.addAllShowcaseRoyalties(values)
    }
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     * @param values The showcaseRoyalties to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllShowcaseRoyalties")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.PeriodicalsResponse.RoyaltyInfo>) {
      addAll(values)
    }
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     * @param index The index to set the value at.
     * @param value The showcaseRoyalties to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setShowcaseRoyalties")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.set(index: kotlin.Int, value: ei.Ei.PeriodicalsResponse.RoyaltyInfo) {
      _builder.setShowcaseRoyalties(index, value)
    }
    /**
     * `repeated .ei.PeriodicalsResponse.RoyaltyInfo showcase_royalties = 10;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearShowcaseRoyalties")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.PeriodicalsResponse.RoyaltyInfo, ShowcaseRoyaltiesProxy>.clear() {
      _builder.clearShowcaseRoyalties()
    }

  }
  @kotlin.jvm.JvmName("-initializeroyaltyInfo")
  public inline fun royaltyInfo(block: ei.PeriodicalsResponseKt.RoyaltyInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.PeriodicalsResponse.RoyaltyInfo =
    ei.PeriodicalsResponseKt.RoyaltyInfoKt.Dsl._create(ei.Ei.PeriodicalsResponse.RoyaltyInfo.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `ei.PeriodicalsResponse.RoyaltyInfo`
   */
  public object RoyaltyInfoKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: ei.Ei.PeriodicalsResponse.RoyaltyInfo.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: ei.Ei.PeriodicalsResponse.RoyaltyInfo.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): ei.Ei.PeriodicalsResponse.RoyaltyInfo = _builder.build()

      /**
       * `optional string id = 1;`
       */
      public var id: kotlin.String
        @JvmName("getId")
        get() = _builder.id
        @JvmName("setId")
        set(value) {
          _builder.id = value
        }
      /**
       * `optional string id = 1;`
       */
      public fun clearId() {
        _builder.clearId()
      }
      /**
       * `optional string id = 1;`
       * @return Whether the id field is set.
       */
      public fun hasId(): kotlin.Boolean {
        return _builder.hasId()
      }

      /**
       * `optional uint32 amount = 2;`
       */
      public var amount: kotlin.Int
        @JvmName("getAmount")
        get() = _builder.amount
        @JvmName("setAmount")
        set(value) {
          _builder.amount = value
        }
      /**
       * `optional uint32 amount = 2;`
       */
      public fun clearAmount() {
        _builder.clearAmount()
      }
      /**
       * `optional uint32 amount = 2;`
       * @return Whether the amount field is set.
       */
      public fun hasAmount(): kotlin.Boolean {
        return _builder.hasAmount()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.PeriodicalsResponse.copy(block: `ei`.PeriodicalsResponseKt.Dsl.() -> kotlin.Unit): ei.Ei.PeriodicalsResponse =
  `ei`.PeriodicalsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.PeriodicalsResponse.RoyaltyInfo.copy(block: `ei`.PeriodicalsResponseKt.RoyaltyInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.PeriodicalsResponse.RoyaltyInfo =
  `ei`.PeriodicalsResponseKt.RoyaltyInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ei.Ei.PeriodicalsResponseOrBuilder.salesOrNull: ei.Ei.SalesInfo?
  get() = if (hasSales()) getSales() else null

public val ei.Ei.PeriodicalsResponseOrBuilder.eventsOrNull: ei.Ei.EggIncCurrentEvents?
  get() = if (hasEvents()) getEvents() else null

public val ei.Ei.PeriodicalsResponseOrBuilder.contractsOrNull: ei.Ei.ContractsResponse?
  get() = if (hasContracts()) getContracts() else null

public val ei.Ei.PeriodicalsResponseOrBuilder.liveConfigOrNull: ei.Ei.LiveConfig?
  get() = if (hasLiveConfig()) getLiveConfig() else null

public val ei.Ei.PeriodicalsResponseOrBuilder.mailBagOrNull: ei.Ei.MailDB?
  get() = if (hasMailBag()) getMailBag() else null

public val ei.Ei.PeriodicalsResponseOrBuilder.contractPlayerInfoOrNull: ei.Ei.ContractPlayerInfo?
  get() = if (hasContractPlayerInfo()) getContractPlayerInfo() else null

