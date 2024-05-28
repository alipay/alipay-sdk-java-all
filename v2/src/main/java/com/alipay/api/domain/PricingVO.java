package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 源汇率
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PricingVO extends AlipayObject {

	private static final long serialVersionUID = 4254626767945642691L;

	/**
	 * 买入价
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 基准币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基本币种单位
	 */
	@ApiField("currency_unit")
	private Long currencyUnit;

	/**
	 * 汇率失效时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expiry_timestamp")
	private String expiryTimestamp;

	/**
	 * 汇率生成时间 用来做幂等 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("generate_timestamp")
	private String generateTimestamp;

	/**
	 * 远期或者掉期到期时间 yyyyMMdd
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
	 * 标准期限TODAY TOM SPOT 1D 1W 1M 1Y
	 */
	@ApiField("period")
	private String period;

	/**
	 * 源汇率参考id 唯一id
	 */
	@ApiField("rate_reference_id")
	private String rateReferenceId;

	/**
	 * 汇率类型 SPOT FORWARD
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 即期买入价
	 */
	@ApiField("spot_bid")
	private String spotBid;

	/**
	 * 即期中间价
	 */
	@ApiField("spot_mid")
	private String spotMid;

	/**
	 * 即期卖出价
	 */
	@ApiField("spot_offer")
	private String spotOffer;

	/**
	 * 汇率生效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_timestamp")
	private String startTimestamp;

	/**
	 * 货币对
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 汇率缓冲时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("threshold_timestamp")
	private String thresholdTimestamp;

	/**
	 * 锁汇失效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_timestamp")
	private String validTimestamp;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCurrencyUnit() {
		return this.currencyUnit;
	}
	public void setCurrencyUnit(Long currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	public String getExpiryTimestamp() {
		return this.expiryTimestamp;
	}
	public void setExpiryTimestamp(String expiryTimestamp) {
		this.expiryTimestamp = expiryTimestamp;
	}

	public String getGenerateTimestamp() {
		return this.generateTimestamp;
	}
	public void setGenerateTimestamp(String generateTimestamp) {
		this.generateTimestamp = generateTimestamp;
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

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRateReferenceId() {
		return this.rateReferenceId;
	}
	public void setRateReferenceId(String rateReferenceId) {
		this.rateReferenceId = rateReferenceId;
	}

	public String getRateType() {
		return this.rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getSpotBid() {
		return this.spotBid;
	}
	public void setSpotBid(String spotBid) {
		this.spotBid = spotBid;
	}

	public String getSpotMid() {
		return this.spotMid;
	}
	public void setSpotMid(String spotMid) {
		this.spotMid = spotMid;
	}

	public String getSpotOffer() {
		return this.spotOffer;
	}
	public void setSpotOffer(String spotOffer) {
		this.spotOffer = spotOffer;
	}

	public String getStartTimestamp() {
		return this.startTimestamp;
	}
	public void setStartTimestamp(String startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getThresholdTimestamp() {
		return this.thresholdTimestamp;
	}
	public void setThresholdTimestamp(String thresholdTimestamp) {
		this.thresholdTimestamp = thresholdTimestamp;
	}

	public String getValidTimestamp() {
		return this.validTimestamp;
	}
	public void setValidTimestamp(String validTimestamp) {
		this.validTimestamp = validTimestamp;
	}

}
