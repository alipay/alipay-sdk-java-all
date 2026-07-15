package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:36
 */
public class RecycleOrderPayInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1883963472385548148L;

	/**
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 支付金额，单位元
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易完成时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

}
