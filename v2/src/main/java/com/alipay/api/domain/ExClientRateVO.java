package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户汇率
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ExClientRateVO extends AlipayObject {

	private static final long serialVersionUID = 6894921942648313478L;

	/**
	 * 协议编号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 基准货币。汇率货币单位默认为1，即1货币单位的基础货币，对应非基准货币的价格
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/**
	 * 买入价格 为交易对手添加了点差后，基准货币的买入价格，直接面向终端客户
	 */
	@ApiField("bid_rate")
	private String bidRate;

	/**
	 * 终端客户买入价格 面向交易对手的基准货币买入价格，不包含终端客户点差
	 */
	@ApiField("client_bid_rate")
	private String clientBidRate;

	/**
	 * 客户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 终端客户卖出价格 面向交易对手的基准货币卖出价格，不包含终端客户点差
	 */
	@ApiField("client_offer_rate")
	private String clientOfferRate;

	/**
	 * 基准货币/非基准货币
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 汇率的失效时间
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 汇率生成日期,yyyymmdd
	 */
	@ApiField("generate_date")
	private String generateDate;

	/**
	 * 汇率生成时间 与rateTime一致
	 */
	@ApiField("generate_time")
	private Date generateTime;

	/**
	 * 字典：T - 可交易，F - 仅作为参考，不可交易
	 */
	@ApiField("guaranteed")
	private String guaranteed;

	/**
	 * 远期或者掉期点价格到期日, yyyymmdd
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 基准货币买入的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 基准货币卖出的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 汇率中间价
	 */
	@ApiField("mid_rate")
	private String midRate;

	/**
	 * 基准货币买入的最小金额，对于单笔交易
	 */
	@ApiField("minimum_bid_amount")
	private String minimumBidAmount;

	/**
	 * 基准货币卖出的最小金额，对于单笔交易
	 */
	@ApiField("minimum_offer_amount")
	private String minimumOfferAmount;

	/**
	 * 卖出价格 添加了交易对手点差后，基准货币的卖出价格，直接面向终端客户
	 */
	@ApiField("offer_rate")
	private String offerRate;

	/**
	 * 在岸离岸标识 ON - 在岸，OFF - 离岸
	 */
	@ApiField("on_off_shore")
	private String onOffShore;

	/**
	 * 该汇率的来源机构
	 */
	@ApiField("origin_rate_inst")
	private String originRateInst;

	/**
	 * 原始汇率来源机构，对该汇率的唯一标识
	 */
	@ApiField("origin_rate_ref")
	private String originRateRef;

	/**
	 * 汇率期限 字典：TODAY, TOMORROW, SPOT, O/N, T/N等标准期限
	 */
	@ApiField("period")
	private String period;

	/**
	 * 子协议扩展号 对不同商户/渠道的报价协议
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 非基准货币
	 */
	@ApiField("quote_ccy")
	private String quoteCcy;

	/**
	 * 标识单一货币对，每次汇率生成时变化，不重复
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率发布时间
	 */
	@ApiField("rate_time")
	private String rateTime;

	/**
	 * 字典: SPOT - 即期，FORWORD - 远期，SWAP - 掉期点
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 汇率类型为远期下，即期的买入价
	 */
	@ApiField("sp_bid")
	private String spBid;

	/**
	 * 汇率类型为远期下，即期的中间价
	 */
	@ApiField("sp_mid")
	private String spMid;

	/**
	 * 汇率类型为远期下，即期的卖出价
	 */
	@ApiField("sp_offer")
	private String spOffer;

	/**
	 * 报价中心内部标准产品编码
	 */
	@ApiField("standard_product_rate_id")
	private String standardProductRateId;

	/**
	 * 汇率的有效时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子协议id
	 */
	@ApiField("sub_agreement_id")
	private String subAgreementId;

	/**
	 * 锁定汇率模式下，在新旧汇率交替时，仍可以使用旧汇率下单的最外时间
	 */
	@ApiField("threshold_time")
	private String thresholdTime;

	/**
	 * 时间所在的时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 交易货币类型 字典: DELIV - 原币交割，NDF - 非原币交割
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 保价过期时间
	 */
	@ApiField("valid_time")
	private String validTime;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getBaseCcy() {
		return this.baseCcy;
	}
	public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}

	public String getBidRate() {
		return this.bidRate;
	}
	public void setBidRate(String bidRate) {
		this.bidRate = bidRate;
	}

	public String getClientBidRate() {
		return this.clientBidRate;
	}
	public void setClientBidRate(String clientBidRate) {
		this.clientBidRate = clientBidRate;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientOfferRate() {
		return this.clientOfferRate;
	}
	public void setClientOfferRate(String clientOfferRate) {
		this.clientOfferRate = clientOfferRate;
	}

	public String getCurrencyPair() {
		return this.currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public String getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
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

	public String getGuaranteed() {
		return this.guaranteed;
	}
	public void setGuaranteed(String guaranteed) {
		this.guaranteed = guaranteed;
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

	public String getMidRate() {
		return this.midRate;
	}
	public void setMidRate(String midRate) {
		this.midRate = midRate;
	}

	public String getMinimumBidAmount() {
		return this.minimumBidAmount;
	}
	public void setMinimumBidAmount(String minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

	public String getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}
	public void setMinimumOfferAmount(String minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

	public String getOfferRate() {
		return this.offerRate;
	}
	public void setOfferRate(String offerRate) {
		this.offerRate = offerRate;
	}

	public String getOnOffShore() {
		return this.onOffShore;
	}
	public void setOnOffShore(String onOffShore) {
		this.onOffShore = onOffShore;
	}

	public String getOriginRateInst() {
		return this.originRateInst;
	}
	public void setOriginRateInst(String originRateInst) {
		this.originRateInst = originRateInst;
	}

	public String getOriginRateRef() {
		return this.originRateRef;
	}
	public void setOriginRateRef(String originRateRef) {
		this.originRateRef = originRateRef;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProfileId() {
		return this.profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getQuoteCcy() {
		return this.quoteCcy;
	}
	public void setQuoteCcy(String quoteCcy) {
		this.quoteCcy = quoteCcy;
	}

	public String getRateRef() {
		return this.rateRef;
	}
	public void setRateRef(String rateRef) {
		this.rateRef = rateRef;
	}

	public String getRateTime() {
		return this.rateTime;
	}
	public void setRateTime(String rateTime) {
		this.rateTime = rateTime;
	}

	public String getRateType() {
		return this.rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
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

	public String getStandardProductRateId() {
		return this.standardProductRateId;
	}
	public void setStandardProductRateId(String standardProductRateId) {
		this.standardProductRateId = standardProductRateId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubAgreementId() {
		return this.subAgreementId;
	}
	public void setSubAgreementId(String subAgreementId) {
		this.subAgreementId = subAgreementId;
	}

	public String getThresholdTime() {
		return this.thresholdTime;
	}
	public void setThresholdTime(String thresholdTime) {
		this.thresholdTime = thresholdTime;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTransactionCcyType() {
		return this.transactionCcyType;
	}
	public void setTransactionCcyType(String transactionCcyType) {
		this.transactionCcyType = transactionCcyType;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}
