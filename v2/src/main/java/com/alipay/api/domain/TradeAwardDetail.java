package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-13 16:52:51
 */
public class TradeAwardDetail extends AlipayObject {

	private static final long serialVersionUID = 8657554783498267427L;

	/**
	 * 激励金额，单位：分
	 */
	@ApiField("award_amount")
	private String awardAmount;

	/**
	 * 门店LEADSID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 门店POIMID
	 */
	@ApiField("poi_mid")
	private String poiMid;

	/**
	 * 交易金额，单位：分
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getAwardAmount() {
		return this.awardAmount;
	}
	public void setAwardAmount(String awardAmount) {
		this.awardAmount = awardAmount;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getPoiMid() {
		return this.poiMid;
	}
	public void setPoiMid(String poiMid) {
		this.poiMid = poiMid;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

}
