//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeuserVerificationAnalysis")
public inline fun userVerificationAnalysis(block: ei.UserVerificationAnalysisKt.Dsl.() -> kotlin.Unit): ei.Ei.UserVerificationAnalysis =
  ei.UserVerificationAnalysisKt.Dsl._create(ei.Ei.UserVerificationAnalysis.newBuilder()).apply { block() }._build()
public object UserVerificationAnalysisKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.UserVerificationAnalysis.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.UserVerificationAnalysis.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.UserVerificationAnalysis = _builder.build()

    /**
     * <code>optional .ei.UserVerificationAnalysis.Status overall_status = 1;</code>
     */
    public var overallStatus: ei.Ei.UserVerificationAnalysis.Status
      @JvmName("getOverallStatus")
      get() = _builder.getOverallStatus()
      @JvmName("setOverallStatus")
      set(value) {
        _builder.setOverallStatus(value)
      }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status overall_status = 1;</code>
     */
    public fun clearOverallStatus() {
      _builder.clearOverallStatus()
    }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status overall_status = 1;</code>
     * @return Whether the overallStatus field is set.
     */
    public fun hasOverallStatus(): kotlin.Boolean {
      return _builder.hasOverallStatus()
    }

    /**
     * <code>optional double start_time = 2;</code>
     */
    public var startTime: kotlin.Double
      @JvmName("getStartTime")
      get() = _builder.getStartTime()
      @JvmName("setStartTime")
      set(value) {
        _builder.setStartTime(value)
      }
    /**
     * <code>optional double start_time = 2;</code>
     */
    public fun clearStartTime() {
      _builder.clearStartTime()
    }
    /**
     * <code>optional double start_time = 2;</code>
     * @return Whether the startTime field is set.
     */
    public fun hasStartTime(): kotlin.Boolean {
      return _builder.hasStartTime()
    }

    /**
     * <code>optional double completion_time = 3;</code>
     */
    public var completionTime: kotlin.Double
      @JvmName("getCompletionTime")
      get() = _builder.getCompletionTime()
      @JvmName("setCompletionTime")
      set(value) {
        _builder.setCompletionTime(value)
      }
    /**
     * <code>optional double completion_time = 3;</code>
     */
    public fun clearCompletionTime() {
      _builder.clearCompletionTime()
    }
    /**
     * <code>optional double completion_time = 3;</code>
     * @return Whether the completionTime field is set.
     */
    public fun hasCompletionTime(): kotlin.Boolean {
      return _builder.hasCompletionTime()
    }

    /**
     * <code>optional double num_prestiges = 14;</code>
     */
    public var numPrestiges: kotlin.Double
      @JvmName("getNumPrestiges")
      get() = _builder.getNumPrestiges()
      @JvmName("setNumPrestiges")
      set(value) {
        _builder.setNumPrestiges(value)
      }
    /**
     * <code>optional double num_prestiges = 14;</code>
     */
    public fun clearNumPrestiges() {
      _builder.clearNumPrestiges()
    }
    /**
     * <code>optional double num_prestiges = 14;</code>
     * @return Whether the numPrestiges field is set.
     */
    public fun hasNumPrestiges(): kotlin.Boolean {
      return _builder.hasNumPrestiges()
    }

    /**
     * <code>optional double soul_eggs = 15;</code>
     */
    public var soulEggs: kotlin.Double
      @JvmName("getSoulEggs")
      get() = _builder.getSoulEggs()
      @JvmName("setSoulEggs")
      set(value) {
        _builder.setSoulEggs(value)
      }
    /**
     * <code>optional double soul_eggs = 15;</code>
     */
    public fun clearSoulEggs() {
      _builder.clearSoulEggs()
    }
    /**
     * <code>optional double soul_eggs = 15;</code>
     * @return Whether the soulEggs field is set.
     */
    public fun hasSoulEggs(): kotlin.Boolean {
      return _builder.hasSoulEggs()
    }

    /**
     * <code>optional uint32 eggs_of_prophecy = 27;</code>
     */
    public var eggsOfProphecy: kotlin.Int
      @JvmName("getEggsOfProphecy")
      get() = _builder.getEggsOfProphecy()
      @JvmName("setEggsOfProphecy")
      set(value) {
        _builder.setEggsOfProphecy(value)
      }
    /**
     * <code>optional uint32 eggs_of_prophecy = 27;</code>
     */
    public fun clearEggsOfProphecy() {
      _builder.clearEggsOfProphecy()
    }
    /**
     * <code>optional uint32 eggs_of_prophecy = 27;</code>
     * @return Whether the eggsOfProphecy field is set.
     */
    public fun hasEggsOfProphecy(): kotlin.Boolean {
      return _builder.hasEggsOfProphecy()
    }

    /**
     * <code>optional .ei.UserVerificationAnalysis.Status iap_status = 18;</code>
     */
    public var iapStatus: ei.Ei.UserVerificationAnalysis.Status
      @JvmName("getIapStatus")
      get() = _builder.getIapStatus()
      @JvmName("setIapStatus")
      set(value) {
        _builder.setIapStatus(value)
      }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status iap_status = 18;</code>
     */
    public fun clearIapStatus() {
      _builder.clearIapStatus()
    }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status iap_status = 18;</code>
     * @return Whether the iapStatus field is set.
     */
    public fun hasIapStatus(): kotlin.Boolean {
      return _builder.hasIapStatus()
    }

    /**
     * <code>optional bool verified_pro_permit = 4;</code>
     */
    public var verifiedProPermit: kotlin.Boolean
      @JvmName("getVerifiedProPermit")
      get() = _builder.getVerifiedProPermit()
      @JvmName("setVerifiedProPermit")
      set(value) {
        _builder.setVerifiedProPermit(value)
      }
    /**
     * <code>optional bool verified_pro_permit = 4;</code>
     */
    public fun clearVerifiedProPermit() {
      _builder.clearVerifiedProPermit()
    }
    /**
     * <code>optional bool verified_pro_permit = 4;</code>
     * @return Whether the verifiedProPermit field is set.
     */
    public fun hasVerifiedProPermit(): kotlin.Boolean {
      return _builder.hasVerifiedProPermit()
    }

    /**
     * <code>optional uint32 verified_piggy_breaks = 5;</code>
     */
    public var verifiedPiggyBreaks: kotlin.Int
      @JvmName("getVerifiedPiggyBreaks")
      get() = _builder.getVerifiedPiggyBreaks()
      @JvmName("setVerifiedPiggyBreaks")
      set(value) {
        _builder.setVerifiedPiggyBreaks(value)
      }
    /**
     * <code>optional uint32 verified_piggy_breaks = 5;</code>
     */
    public fun clearVerifiedPiggyBreaks() {
      _builder.clearVerifiedPiggyBreaks()
    }
    /**
     * <code>optional uint32 verified_piggy_breaks = 5;</code>
     * @return Whether the verifiedPiggyBreaks field is set.
     */
    public fun hasVerifiedPiggyBreaks(): kotlin.Boolean {
      return _builder.hasVerifiedPiggyBreaks()
    }

    /**
     * <code>optional uint32 verified_other_iap = 6;</code>
     */
    public var verifiedOtherIap: kotlin.Int
      @JvmName("getVerifiedOtherIap")
      get() = _builder.getVerifiedOtherIap()
      @JvmName("setVerifiedOtherIap")
      set(value) {
        _builder.setVerifiedOtherIap(value)
      }
    /**
     * <code>optional uint32 verified_other_iap = 6;</code>
     */
    public fun clearVerifiedOtherIap() {
      _builder.clearVerifiedOtherIap()
    }
    /**
     * <code>optional uint32 verified_other_iap = 6;</code>
     * @return Whether the verifiedOtherIap field is set.
     */
    public fun hasVerifiedOtherIap(): kotlin.Boolean {
      return _builder.hasVerifiedOtherIap()
    }

    /**
     * <code>optional uint32 unverified_iap = 7;</code>
     */
    public var unverifiedIap: kotlin.Int
      @JvmName("getUnverifiedIap")
      get() = _builder.getUnverifiedIap()
      @JvmName("setUnverifiedIap")
      set(value) {
        _builder.setUnverifiedIap(value)
      }
    /**
     * <code>optional uint32 unverified_iap = 7;</code>
     */
    public fun clearUnverifiedIap() {
      _builder.clearUnverifiedIap()
    }
    /**
     * <code>optional uint32 unverified_iap = 7;</code>
     * @return Whether the unverifiedIap field is set.
     */
    public fun hasUnverifiedIap(): kotlin.Boolean {
      return _builder.hasUnverifiedIap()
    }

    /**
     * <code>optional double gold_earned = 13;</code>
     */
    public var goldEarned: kotlin.Double
      @JvmName("getGoldEarned")
      get() = _builder.getGoldEarned()
      @JvmName("setGoldEarned")
      set(value) {
        _builder.setGoldEarned(value)
      }
    /**
     * <code>optional double gold_earned = 13;</code>
     */
    public fun clearGoldEarned() {
      _builder.clearGoldEarned()
    }
    /**
     * <code>optional double gold_earned = 13;</code>
     * @return Whether the goldEarned field is set.
     */
    public fun hasGoldEarned(): kotlin.Boolean {
      return _builder.hasGoldEarned()
    }

    /**
     * <code>optional bool regular_iap_buyer = 22;</code>
     */
    public var regularIapBuyer: kotlin.Boolean
      @JvmName("getRegularIapBuyer")
      get() = _builder.getRegularIapBuyer()
      @JvmName("setRegularIapBuyer")
      set(value) {
        _builder.setRegularIapBuyer(value)
      }
    /**
     * <code>optional bool regular_iap_buyer = 22;</code>
     */
    public fun clearRegularIapBuyer() {
      _builder.clearRegularIapBuyer()
    }
    /**
     * <code>optional bool regular_iap_buyer = 22;</code>
     * @return Whether the regularIapBuyer field is set.
     */
    public fun hasRegularIapBuyer(): kotlin.Boolean {
      return _builder.hasRegularIapBuyer()
    }

    /**
     * <code>optional bool regular_iap_cheater = 23;</code>
     */
    public var regularIapCheater: kotlin.Boolean
      @JvmName("getRegularIapCheater")
      get() = _builder.getRegularIapCheater()
      @JvmName("setRegularIapCheater")
      set(value) {
        _builder.setRegularIapCheater(value)
      }
    /**
     * <code>optional bool regular_iap_cheater = 23;</code>
     */
    public fun clearRegularIapCheater() {
      _builder.clearRegularIapCheater()
    }
    /**
     * <code>optional bool regular_iap_cheater = 23;</code>
     * @return Whether the regularIapCheater field is set.
     */
    public fun hasRegularIapCheater(): kotlin.Boolean {
      return _builder.hasRegularIapCheater()
    }

    /**
     * <code>optional .ei.UserVerificationAnalysis.Status artifacts_status = 19;</code>
     */
    public var artifactsStatus: ei.Ei.UserVerificationAnalysis.Status
      @JvmName("getArtifactsStatus")
      get() = _builder.getArtifactsStatus()
      @JvmName("setArtifactsStatus")
      set(value) {
        _builder.setArtifactsStatus(value)
      }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status artifacts_status = 19;</code>
     */
    public fun clearArtifactsStatus() {
      _builder.clearArtifactsStatus()
    }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status artifacts_status = 19;</code>
     * @return Whether the artifactsStatus field is set.
     */
    public fun hasArtifactsStatus(): kotlin.Boolean {
      return _builder.hasArtifactsStatus()
    }

    /**
     * <code>optional uint32 missions_completed = 8;</code>
     */
    public var missionsCompleted: kotlin.Int
      @JvmName("getMissionsCompleted")
      get() = _builder.getMissionsCompleted()
      @JvmName("setMissionsCompleted")
      set(value) {
        _builder.setMissionsCompleted(value)
      }
    /**
     * <code>optional uint32 missions_completed = 8;</code>
     */
    public fun clearMissionsCompleted() {
      _builder.clearMissionsCompleted()
    }
    /**
     * <code>optional uint32 missions_completed = 8;</code>
     * @return Whether the missionsCompleted field is set.
     */
    public fun hasMissionsCompleted(): kotlin.Boolean {
      return _builder.hasMissionsCompleted()
    }

    /**
     * <code>optional double artifacts_collected = 9;</code>
     */
    public var artifactsCollected: kotlin.Double
      @JvmName("getArtifactsCollected")
      get() = _builder.getArtifactsCollected()
      @JvmName("setArtifactsCollected")
      set(value) {
        _builder.setArtifactsCollected(value)
      }
    /**
     * <code>optional double artifacts_collected = 9;</code>
     */
    public fun clearArtifactsCollected() {
      _builder.clearArtifactsCollected()
    }
    /**
     * <code>optional double artifacts_collected = 9;</code>
     * @return Whether the artifactsCollected field is set.
     */
    public fun hasArtifactsCollected(): kotlin.Boolean {
      return _builder.hasArtifactsCollected()
    }

    /**
     * <code>optional double artifacts_consumed = 10;</code>
     */
    public var artifactsConsumed: kotlin.Double
      @JvmName("getArtifactsConsumed")
      get() = _builder.getArtifactsConsumed()
      @JvmName("setArtifactsConsumed")
      set(value) {
        _builder.setArtifactsConsumed(value)
      }
    /**
     * <code>optional double artifacts_consumed = 10;</code>
     */
    public fun clearArtifactsConsumed() {
      _builder.clearArtifactsConsumed()
    }
    /**
     * <code>optional double artifacts_consumed = 10;</code>
     * @return Whether the artifactsConsumed field is set.
     */
    public fun hasArtifactsConsumed(): kotlin.Boolean {
      return _builder.hasArtifactsConsumed()
    }

    /**
     * <code>optional double artifacts_in_inventory = 11;</code>
     */
    public var artifactsInInventory: kotlin.Double
      @JvmName("getArtifactsInInventory")
      get() = _builder.getArtifactsInInventory()
      @JvmName("setArtifactsInInventory")
      set(value) {
        _builder.setArtifactsInInventory(value)
      }
    /**
     * <code>optional double artifacts_in_inventory = 11;</code>
     */
    public fun clearArtifactsInInventory() {
      _builder.clearArtifactsInInventory()
    }
    /**
     * <code>optional double artifacts_in_inventory = 11;</code>
     * @return Whether the artifactsInInventory field is set.
     */
    public fun hasArtifactsInInventory(): kotlin.Boolean {
      return _builder.hasArtifactsInInventory()
    }

    /**
     * <code>optional double gold_spent_crafting = 21;</code>
     */
    public var goldSpentCrafting: kotlin.Double
      @JvmName("getGoldSpentCrafting")
      get() = _builder.getGoldSpentCrafting()
      @JvmName("setGoldSpentCrafting")
      set(value) {
        _builder.setGoldSpentCrafting(value)
      }
    /**
     * <code>optional double gold_spent_crafting = 21;</code>
     */
    public fun clearGoldSpentCrafting() {
      _builder.clearGoldSpentCrafting()
    }
    /**
     * <code>optional double gold_spent_crafting = 21;</code>
     * @return Whether the goldSpentCrafting field is set.
     */
    public fun hasGoldSpentCrafting(): kotlin.Boolean {
      return _builder.hasGoldSpentCrafting()
    }

    /**
     * <code>optional bool excessive_consumes = 24;</code>
     */
    public var excessiveConsumes: kotlin.Boolean
      @JvmName("getExcessiveConsumes")
      get() = _builder.getExcessiveConsumes()
      @JvmName("setExcessiveConsumes")
      set(value) {
        _builder.setExcessiveConsumes(value)
      }
    /**
     * <code>optional bool excessive_consumes = 24;</code>
     */
    public fun clearExcessiveConsumes() {
      _builder.clearExcessiveConsumes()
    }
    /**
     * <code>optional bool excessive_consumes = 24;</code>
     * @return Whether the excessiveConsumes field is set.
     */
    public fun hasExcessiveConsumes(): kotlin.Boolean {
      return _builder.hasExcessiveConsumes()
    }

    /**
     * <code>optional bool excessive_inventory = 25;</code>
     */
    public var excessiveInventory: kotlin.Boolean
      @JvmName("getExcessiveInventory")
      get() = _builder.getExcessiveInventory()
      @JvmName("setExcessiveInventory")
      set(value) {
        _builder.setExcessiveInventory(value)
      }
    /**
     * <code>optional bool excessive_inventory = 25;</code>
     */
    public fun clearExcessiveInventory() {
      _builder.clearExcessiveInventory()
    }
    /**
     * <code>optional bool excessive_inventory = 25;</code>
     * @return Whether the excessiveInventory field is set.
     */
    public fun hasExcessiveInventory(): kotlin.Boolean {
      return _builder.hasExcessiveInventory()
    }

    /**
     * <code>optional bool excessive_spend = 26;</code>
     */
    public var excessiveSpend: kotlin.Boolean
      @JvmName("getExcessiveSpend")
      get() = _builder.getExcessiveSpend()
      @JvmName("setExcessiveSpend")
      set(value) {
        _builder.setExcessiveSpend(value)
      }
    /**
     * <code>optional bool excessive_spend = 26;</code>
     */
    public fun clearExcessiveSpend() {
      _builder.clearExcessiveSpend()
    }
    /**
     * <code>optional bool excessive_spend = 26;</code>
     * @return Whether the excessiveSpend field is set.
     */
    public fun hasExcessiveSpend(): kotlin.Boolean {
      return _builder.hasExcessiveSpend()
    }

    /**
     * <code>optional .ei.UserVerificationAnalysis.Status contracts_status = 20;</code>
     */
    public var contractsStatus: ei.Ei.UserVerificationAnalysis.Status
      @JvmName("getContractsStatus")
      get() = _builder.getContractsStatus()
      @JvmName("setContractsStatus")
      set(value) {
        _builder.setContractsStatus(value)
      }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status contracts_status = 20;</code>
     */
    public fun clearContractsStatus() {
      _builder.clearContractsStatus()
    }
    /**
     * <code>optional .ei.UserVerificationAnalysis.Status contracts_status = 20;</code>
     * @return Whether the contractsStatus field is set.
     */
    public fun hasContractsStatus(): kotlin.Boolean {
      return _builder.hasContractsStatus()
    }

    /**
     * <code>optional uint32 num_coop_memberships = 12;</code>
     */
    public var numCoopMemberships: kotlin.Int
      @JvmName("getNumCoopMemberships")
      get() = _builder.getNumCoopMemberships()
      @JvmName("setNumCoopMemberships")
      set(value) {
        _builder.setNumCoopMemberships(value)
      }
    /**
     * <code>optional uint32 num_coop_memberships = 12;</code>
     */
    public fun clearNumCoopMemberships() {
      _builder.clearNumCoopMemberships()
    }
    /**
     * <code>optional uint32 num_coop_memberships = 12;</code>
     * @return Whether the numCoopMemberships field is set.
     */
    public fun hasNumCoopMemberships(): kotlin.Boolean {
      return _builder.hasNumCoopMemberships()
    }

    /**
     * <code>optional uint32 valid_contracts = 16;</code>
     */
    public var validContracts: kotlin.Int
      @JvmName("getValidContracts")
      get() = _builder.getValidContracts()
      @JvmName("setValidContracts")
      set(value) {
        _builder.setValidContracts(value)
      }
    /**
     * <code>optional uint32 valid_contracts = 16;</code>
     */
    public fun clearValidContracts() {
      _builder.clearValidContracts()
    }
    /**
     * <code>optional uint32 valid_contracts = 16;</code>
     * @return Whether the validContracts field is set.
     */
    public fun hasValidContracts(): kotlin.Boolean {
      return _builder.hasValidContracts()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InvalidContractsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @return A list containing the invalidContracts.
     */
    public val invalidContracts: com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInvalidContractsList()
      )
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @param value The invalidContracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInvalidContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.add(value: kotlin.String) {
      _builder.addInvalidContracts(value)
    }
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @param value The invalidContracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInvalidContracts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @param values The invalidContracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInvalidContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllInvalidContracts(values)
    }
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @param values The invalidContracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInvalidContracts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string invalid_contracts = 17;</code>
     * @param index The index to set the value at.
     * @param value The invalidContracts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInvalidContracts")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setInvalidContracts(index, value)
    }/**
     * <code>repeated string invalid_contracts = 17;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInvalidContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InvalidContractsProxy>.clear() {
      _builder.clearInvalidContracts()
    }
    /**
     * <code>optional bool excessive_eop = 28;</code>
     */
    public var excessiveEop: kotlin.Boolean
      @JvmName("getExcessiveEop")
      get() = _builder.getExcessiveEop()
      @JvmName("setExcessiveEop")
      set(value) {
        _builder.setExcessiveEop(value)
      }
    /**
     * <code>optional bool excessive_eop = 28;</code>
     */
    public fun clearExcessiveEop() {
      _builder.clearExcessiveEop()
    }
    /**
     * <code>optional bool excessive_eop = 28;</code>
     * @return Whether the excessiveEop field is set.
     */
    public fun hasExcessiveEop(): kotlin.Boolean {
      return _builder.hasExcessiveEop()
    }

    /**
     * <code>optional bool excessive_invalid_contracts = 29;</code>
     */
    public var excessiveInvalidContracts: kotlin.Boolean
      @JvmName("getExcessiveInvalidContracts")
      get() = _builder.getExcessiveInvalidContracts()
      @JvmName("setExcessiveInvalidContracts")
      set(value) {
        _builder.setExcessiveInvalidContracts(value)
      }
    /**
     * <code>optional bool excessive_invalid_contracts = 29;</code>
     */
    public fun clearExcessiveInvalidContracts() {
      _builder.clearExcessiveInvalidContracts()
    }
    /**
     * <code>optional bool excessive_invalid_contracts = 29;</code>
     * @return Whether the excessiveInvalidContracts field is set.
     */
    public fun hasExcessiveInvalidContracts(): kotlin.Boolean {
      return _builder.hasExcessiveInvalidContracts()
    }

    /**
     * <code>optional bool verified = 30;</code>
     */
    public var verified: kotlin.Boolean
      @JvmName("getVerified")
      get() = _builder.getVerified()
      @JvmName("setVerified")
      set(value) {
        _builder.setVerified(value)
      }
    /**
     * <code>optional bool verified = 30;</code>
     */
    public fun clearVerified() {
      _builder.clearVerified()
    }
    /**
     * <code>optional bool verified = 30;</code>
     * @return Whether the verified field is set.
     */
    public fun hasVerified(): kotlin.Boolean {
      return _builder.hasVerified()
    }

    /**
     * <code>optional bool verification_override = 31;</code>
     */
    public var verificationOverride: kotlin.Boolean
      @JvmName("getVerificationOverride")
      get() = _builder.getVerificationOverride()
      @JvmName("setVerificationOverride")
      set(value) {
        _builder.setVerificationOverride(value)
      }
    /**
     * <code>optional bool verification_override = 31;</code>
     */
    public fun clearVerificationOverride() {
      _builder.clearVerificationOverride()
    }
    /**
     * <code>optional bool verification_override = 31;</code>
     * @return Whether the verificationOverride field is set.
     */
    public fun hasVerificationOverride(): kotlin.Boolean {
      return _builder.hasVerificationOverride()
    }

    /**
     * <code>optional bool verification_override_value = 32;</code>
     */
    public var verificationOverrideValue: kotlin.Boolean
      @JvmName("getVerificationOverrideValue")
      get() = _builder.getVerificationOverrideValue()
      @JvmName("setVerificationOverrideValue")
      set(value) {
        _builder.setVerificationOverrideValue(value)
      }
    /**
     * <code>optional bool verification_override_value = 32;</code>
     */
    public fun clearVerificationOverrideValue() {
      _builder.clearVerificationOverrideValue()
    }
    /**
     * <code>optional bool verification_override_value = 32;</code>
     * @return Whether the verificationOverrideValue field is set.
     */
    public fun hasVerificationOverrideValue(): kotlin.Boolean {
      return _builder.hasVerificationOverrideValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.UserVerificationAnalysis.copy(block: ei.UserVerificationAnalysisKt.Dsl.() -> kotlin.Unit): ei.Ei.UserVerificationAnalysis =
  ei.UserVerificationAnalysisKt.Dsl._create(this.toBuilder()).apply { block() }._build()
