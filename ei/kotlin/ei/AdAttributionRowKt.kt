// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ei.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package ei;

@kotlin.jvm.JvmName("-initializeadAttributionRow")
public inline fun adAttributionRow(block: ei.AdAttributionRowKt.Dsl.() -> kotlin.Unit): ei.Ei.AdAttributionRow =
  ei.AdAttributionRowKt.Dsl._create(ei.Ei.AdAttributionRow.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `ei.AdAttributionRow`
 */
public object AdAttributionRowKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.AdAttributionRow.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.AdAttributionRow.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.AdAttributionRow = _builder.build()

    /**
     * `optional string user_id = 1;`
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.userId
      @JvmName("setUserId")
      set(value) {
        _builder.userId = value
      }
    /**
     * `optional string user_id = 1;`
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * `optional string user_id = 1;`
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }

    /**
     * `optional string ad_id = 2;`
     */
    public var adId: kotlin.String
      @JvmName("getAdId")
      get() = _builder.adId
      @JvmName("setAdId")
      set(value) {
        _builder.adId = value
      }
    /**
     * `optional string ad_id = 2;`
     */
    public fun clearAdId() {
      _builder.clearAdId()
    }
    /**
     * `optional string ad_id = 2;`
     * @return Whether the adId field is set.
     */
    public fun hasAdId(): kotlin.Boolean {
      return _builder.hasAdId()
    }

    /**
     * `optional string ad_network = 3;`
     */
    public var adNetwork: kotlin.String
      @JvmName("getAdNetwork")
      get() = _builder.adNetwork
      @JvmName("setAdNetwork")
      set(value) {
        _builder.adNetwork = value
      }
    /**
     * `optional string ad_network = 3;`
     */
    public fun clearAdNetwork() {
      _builder.clearAdNetwork()
    }
    /**
     * `optional string ad_network = 3;`
     * @return Whether the adNetwork field is set.
     */
    public fun hasAdNetwork(): kotlin.Boolean {
      return _builder.hasAdNetwork()
    }

    /**
     * `optional string campaign = 4;`
     */
    public var campaign: kotlin.String
      @JvmName("getCampaign")
      get() = _builder.campaign
      @JvmName("setCampaign")
      set(value) {
        _builder.campaign = value
      }
    /**
     * `optional string campaign = 4;`
     */
    public fun clearCampaign() {
      _builder.clearCampaign()
    }
    /**
     * `optional string campaign = 4;`
     * @return Whether the campaign field is set.
     */
    public fun hasCampaign(): kotlin.Boolean {
      return _builder.hasCampaign()
    }

    /**
     * `optional string keyword = 5;`
     */
    public var keyword: kotlin.String
      @JvmName("getKeyword")
      get() = _builder.keyword
      @JvmName("setKeyword")
      set(value) {
        _builder.keyword = value
      }
    /**
     * `optional string keyword = 5;`
     */
    public fun clearKeyword() {
      _builder.clearKeyword()
    }
    /**
     * `optional string keyword = 5;`
     * @return Whether the keyword field is set.
     */
    public fun hasKeyword(): kotlin.Boolean {
      return _builder.hasKeyword()
    }

    /**
     * `optional string extra = 6;`
     */
    public var extra: kotlin.String
      @JvmName("getExtra")
      get() = _builder.extra
      @JvmName("setExtra")
      set(value) {
        _builder.extra = value
      }
    /**
     * `optional string extra = 6;`
     */
    public fun clearExtra() {
      _builder.clearExtra()
    }
    /**
     * `optional string extra = 6;`
     * @return Whether the extra field is set.
     */
    public fun hasExtra(): kotlin.Boolean {
      return _builder.hasExtra()
    }

    /**
     * `optional float click_date = 7;`
     */
    public var clickDate: kotlin.Float
      @JvmName("getClickDate")
      get() = _builder.clickDate
      @JvmName("setClickDate")
      set(value) {
        _builder.clickDate = value
      }
    /**
     * `optional float click_date = 7;`
     */
    public fun clearClickDate() {
      _builder.clearClickDate()
    }
    /**
     * `optional float click_date = 7;`
     * @return Whether the clickDate field is set.
     */
    public fun hasClickDate(): kotlin.Boolean {
      return _builder.hasClickDate()
    }

    /**
     * `optional float download_date = 8;`
     */
    public var downloadDate: kotlin.Float
      @JvmName("getDownloadDate")
      get() = _builder.downloadDate
      @JvmName("setDownloadDate")
      set(value) {
        _builder.downloadDate = value
      }
    /**
     * `optional float download_date = 8;`
     */
    public fun clearDownloadDate() {
      _builder.clearDownloadDate()
    }
    /**
     * `optional float download_date = 8;`
     * @return Whether the downloadDate field is set.
     */
    public fun hasDownloadDate(): kotlin.Boolean {
      return _builder.hasDownloadDate()
    }

    /**
     * `optional float approx_time = 9;`
     */
    public var approxTime: kotlin.Float
      @JvmName("getApproxTime")
      get() = _builder.approxTime
      @JvmName("setApproxTime")
      set(value) {
        _builder.approxTime = value
      }
    /**
     * `optional float approx_time = 9;`
     */
    public fun clearApproxTime() {
      _builder.clearApproxTime()
    }
    /**
     * `optional float approx_time = 9;`
     * @return Whether the approxTime field is set.
     */
    public fun hasApproxTime(): kotlin.Boolean {
      return _builder.hasApproxTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.AdAttributionRow.copy(block: `ei`.AdAttributionRowKt.Dsl.() -> kotlin.Unit): ei.Ei.AdAttributionRow =
  `ei`.AdAttributionRowKt.Dsl._create(this.toBuilder()).apply { block() }._build()

