package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-04 13:52:49
 */
public class TaxiOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 8294379563121638672L;

	/**
	 * 订单金额-元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 风控原因（未触发发奖时给出，触发发奖时为空）
	 */
	@ApiField("risk_control_reason")
	private String riskControlReason;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trade_time")
	private String tradeTime;

	/**
	 * 是否触发激励发奖 true false
	 */
	@ApiField("triggered_award")
	private Boolean triggeredAward;

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getRiskControlReason() {
		return this.riskControlReason;
	}
	public void setRiskControlReason(String riskControlReason) {
		this.riskControlReason = riskControlReason;
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

	public Boolean getTriggeredAward() {
		return this.triggeredAward;
	}
	public void setTriggeredAward(Boolean triggeredAward) {
		this.triggeredAward = triggeredAward;
	}

}
