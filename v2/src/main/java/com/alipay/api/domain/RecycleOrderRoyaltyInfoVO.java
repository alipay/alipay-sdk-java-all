package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:36
 */
public class RecycleOrderRoyaltyInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6132799821627686157L;

	/**
	 * 交易金额，单位元
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易对象
	 */
	@ApiField("trade_in")
	private String tradeIn;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 交易完成时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeIn() {
		return this.tradeIn;
	}
	public void setTradeIn(String tradeIn) {
		this.tradeIn = tradeIn;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

}
