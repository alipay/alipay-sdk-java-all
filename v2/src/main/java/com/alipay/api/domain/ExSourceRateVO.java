package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 源汇率
 *
 * @author auto create
 * @since 1.0, 2018-10-27 17:06:04
 */
public class ExSourceRateVO extends AlipayObject {

	private static final long serialVersionUID = 7439868355491239112L;

	/**
	 * 买入价
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 报价币种对
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 报价单位
	 */
	@ApiField("currency_unit")
	private Long currencyUnit;

	/**
	 * 价格失效时间
	 */
	@ApiField("expiry_time")
	private Date expiryTime;

	/**
	 * 扩展字段
	 */
	@ApiField("extended_params")
	private String extendedParams;

	/**
	 * 报价生成日期
	 */
	@ApiField("generate_date")
	private String generateDate;

	/**
	 * 报价生成时间
	 */
	@ApiField("generate_time")
	private Date generateTime;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 报价是否可成交
	 */
	@ApiField("guaranteed")
	private String guaranteed;

	/**
	 * 主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 源汇率机构
	 */
	@ApiField("inst")
	private String inst;

	/**
	 * 报价源报价ID
	 */
	@ApiField("inst_rate_reference_id")
	private String instRateReferenceId;

	/**
	 * 是否异常源汇率，Y或者N
	 */
	@ApiField("is_exception")
	private String isException;

	/**
	 * 是否平盘价
	 */
	@ApiField("is_flat")
	private String isFlat;

	/**
	 * 是否需要格式化，Y或者N
	 */
	@ApiField("is_formatted")
	private String isFormatted;

	/**
	 * 汇率是否有效
	 */
	@ApiField("is_valid")
	private String isValid;

	/**
	 * 远期或掉期点价格到期日
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 该价格的最大买入量
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 该价格的最大卖出量
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 中间价
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 该价格的最小买入量
	 */
	@ApiField("minimum_bid_amount")
	private Long minimumBidAmount;

	/**
	 * 该价格的最小卖出量
	 */
	@ApiField("minimum_offer_amount")
	private Long minimumOfferAmount;

	/**
	 * 卖出价
	 */
	@ApiField("offer")
	private String offer;

	/**
	 * 在岸/离岸标识:ON/OFF
	 */
	@ApiField("on_off_shore")
	private String onOffShore;

	/**
	 * 期限(TODAY,TOM,SPOT)
	 */
	@ApiField("period")
	private String period;

	/**
	 * 业务自定义字段
	 */
	@ApiField("profile")
	private String profile;

	/**
	 * 价格类型 WHL/RTL
	 */
	@ApiField("quote_type")
	private String quoteType;

	/**
	 * 报价生成方式，用来区分人工指定报价或者渠道原始报价
	 */
	@ApiField("rate_method")
	private String rateMethod;

	/**
	 * 源汇率编码
	 */
	@ApiField("rate_source_code")
	private String rateSourceCode;

	/**
	 * 产品类型：即期，远期，掉期
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 端标识号
	 */
	@ApiField("segment_id")
	private String segmentId;

	/**
	 * 即期买入价
	 */
	@ApiField("sp_bid")
	private String spBid;

	/**
	 * 即期中间价
	 */
	@ApiField("sp_mid")
	private String spMid;

	/**
	 * 即期卖出价
	 */
	@ApiField("sp_offer")
	private String spOffer;

	/**
	 * 价格生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 子机构
	 */
	@ApiField("sub_inst")
	private String subInst;

	/**
	 * 报价缓冲时间
	 */
	@ApiField("threshold_time")
	private Date thresholdTime;

	/**
	 * 最晚用此报价发送交易时间
	 */
	@ApiField("valid_time")
	private Date validTime;

	/**
	 * 价格失效时间(带时区)
	 */
	@ApiField("zone_expiry_time")
	private String zoneExpiryTime;

	/**
	 * 报价生成时间(带时区)
	 */
	@ApiField("zone_generate_time")
	private String zoneGenerateTime;

	/**
	 * 创建日期(带时区)
	 */
	@ApiField("zone_gmt_create")
	private String zoneGmtCreate;

	/**
	 * 修改时间(带时区)
	 */
	@ApiField("zone_gmt_modified")
	private String zoneGmtModified;

	/**
	 * 价格生效时间(带时区)
	 */
	@ApiField("zone_start_time")
	private String zoneStartTime;

	/**
	 * 报价缓冲时间(带时区)
	 */
	@ApiField("zone_threshold_time")
	private String zoneThresholdTime;

	/**
	 * 最晚用此报价发送交易时间(带时区)
	 */
	@ApiField("zone_valid_time")
	private String zoneValidTime;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getCurrencyPair() {
		return this.currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public Long getCurrencyUnit() {
		return this.currencyUnit;
	}
	public void setCurrencyUnit(Long currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	public Date getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getExtendedParams() {
		return this.extendedParams;
	}
	public void setExtendedParams(String extendedParams) {
		this.extendedParams = extendedParams;
	}

	public String getGenerateDate() {
		return this.generateDate;
	}
	public void setGenerateDate(String generateDate) {
		this.generateDate = generateDate;
	}

	public Date getGenerateTime() {
		return this.generateTime;
	}
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGuaranteed() {
		return this.guaranteed;
	}
	public void setGuaranteed(String guaranteed) {
		this.guaranteed = guaranteed;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInst() {
		return this.inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}

	public String getInstRateReferenceId() {
		return this.instRateReferenceId;
	}
	public void setInstRateReferenceId(String instRateReferenceId) {
		this.instRateReferenceId = instRateReferenceId;
	}

	public String getIsException() {
		return this.isException;
	}
	public void setIsException(String isException) {
		this.isException = isException;
	}

	public String getIsFlat() {
		return this.isFlat;
	}
	public void setIsFlat(String isFlat) {
		this.isFlat = isFlat;
	}

	public String getIsFormatted() {
		return this.isFormatted;
	}
	public void setIsFormatted(String isFormatted) {
		this.isFormatted = isFormatted;
	}

	public String getIsValid() {
		return this.isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Long getMaximumBidAmount() {
		return this.maximumBidAmount;
	}
	public void setMaximumBidAmount(Long maximumBidAmount) {
		this.maximumBidAmount = maximumBidAmount;
	}

	public Long getMaximumOfferAmount() {
		return this.maximumOfferAmount;
	}
	public void setMaximumOfferAmount(Long maximumOfferAmount) {
		this.maximumOfferAmount = maximumOfferAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public Long getMinimumBidAmount() {
		return this.minimumBidAmount;
	}
	public void setMinimumBidAmount(Long minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

	public Long getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}
	public void setMinimumOfferAmount(Long minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

	public String getOffer() {
		return this.offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}

	public String getOnOffShore() {
		return this.onOffShore;
	}
	public void setOnOffShore(String onOffShore) {
		this.onOffShore = onOffShore;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProfile() {
		return this.profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getQuoteType() {
		return this.quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}

	public String getRateMethod() {
		return this.rateMethod;
	}
	public void setRateMethod(String rateMethod) {
		this.rateMethod = rateMethod;
	}

	public String getRateSourceCode() {
		return this.rateSourceCode;
	}
	public void setRateSourceCode(String rateSourceCode) {
		this.rateSourceCode = rateSourceCode;
	}

	public String getRateType() {
		return this.rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getSegmentId() {
		return this.segmentId;
	}
	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public String getSpBid() {
		return this.spBid;
	}
	public void setSpBid(String spBid) {
		this.spBid = spBid;
	}

	public String getSpMid() {
		return this.spMid;
	}
	public void setSpMid(String spMid) {
		this.spMid = spMid;
	}

	public String getSpOffer() {
		return this.spOffer;
	}
	public void setSpOffer(String spOffer) {
		this.spOffer = spOffer;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubInst() {
		return this.subInst;
	}
	public void setSubInst(String subInst) {
		this.subInst = subInst;
	}

	public Date getThresholdTime() {
		return this.thresholdTime;
	}
	public void setThresholdTime(Date thresholdTime) {
		this.thresholdTime = thresholdTime;
	}

	public Date getValidTime() {
		return this.validTime;
	}
	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getZoneExpiryTime() {
		return this.zoneExpiryTime;
	}
	public void setZoneExpiryTime(String zoneExpiryTime) {
		this.zoneExpiryTime = zoneExpiryTime;
	}

	public String getZoneGenerateTime() {
		return this.zoneGenerateTime;
	}
	public void setZoneGenerateTime(String zoneGenerateTime) {
		this.zoneGenerateTime = zoneGenerateTime;
	}

	public String getZoneGmtCreate() {
		return this.zoneGmtCreate;
	}
	public void setZoneGmtCreate(String zoneGmtCreate) {
		this.zoneGmtCreate = zoneGmtCreate;
	}

	public String getZoneGmtModified() {
		return this.zoneGmtModified;
	}
	public void setZoneGmtModified(String zoneGmtModified) {
		this.zoneGmtModified = zoneGmtModified;
	}

	public String getZoneStartTime() {
		return this.zoneStartTime;
	}
	public void setZoneStartTime(String zoneStartTime) {
		this.zoneStartTime = zoneStartTime;
	}

	public String getZoneThresholdTime() {
		return this.zoneThresholdTime;
	}
	public void setZoneThresholdTime(String zoneThresholdTime) {
		this.zoneThresholdTime = zoneThresholdTime;
	}

	public String getZoneValidTime() {
		return this.zoneValidTime;
	}
	public void setZoneValidTime(String zoneValidTime) {
		this.zoneValidTime = zoneValidTime;
	}

}
