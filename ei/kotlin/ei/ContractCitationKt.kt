// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializecontractCitation")
public inline fun contractCitation(block: ei.ContractCitationKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractCitation =
  ei.ContractCitationKt.Dsl._create(ei.Ei.ContractCitation.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.ContractCitation`
 */
public object ContractCitationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ContractCitation.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ContractCitation.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ContractCitation = _builder.build()

    /**
     * `optional .ei.ContractEvaluation.PoorBehavior issue = 1;`
     */
    public var issue: ei.Ei.ContractEvaluation.PoorBehavior
      @JvmName("getIssue")
      get() = _builder.issue
      @JvmName("setIssue")
      set(value) {
        _builder.issue = value
      }
    /**
     * `optional .ei.ContractEvaluation.PoorBehavior issue = 1;`
     */
    public fun clearIssue() {
      _builder.clearIssue()
    }
    /**
     * `optional .ei.ContractEvaluation.PoorBehavior issue = 1;`
     * @return Whether the issue field is set.
     */
    public fun hasIssue(): kotlin.Boolean {
      return _builder.hasIssue()
    }

    /**
     * `optional double timestamp = 2;`
     */
    public var timestamp: kotlin.Double
      @JvmName("getTimestamp")
      get() = _builder.timestamp
      @JvmName("setTimestamp")
      set(value) {
        _builder.timestamp = value
      }
    /**
     * `optional double timestamp = 2;`
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * `optional double timestamp = 2;`
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }

    /**
     * `optional .ei.Contract.PlayerGrade grade = 3;`
     */
    public var grade: ei.Ei.Contract.PlayerGrade
      @JvmName("getGrade")
      get() = _builder.grade
      @JvmName("setGrade")
      set(value) {
        _builder.grade = value
      }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 3;`
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }
    /**
     * `optional .ei.Contract.PlayerGrade grade = 3;`
     * @return Whether the grade field is set.
     */
    public fun hasGrade(): kotlin.Boolean {
      return _builder.hasGrade()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractCitation.copy(block: `ei`.ContractCitationKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractCitation =
  `ei`.ContractCitationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

