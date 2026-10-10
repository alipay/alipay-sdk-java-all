package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.charge.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 16:42:58
 */
public class AlipayTradeSubscriptionChargeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1824882216462924199L;

	/** 
	 * 支付链接
	 */
	@ApiField("cashier_url")
	private String cashierUrl;

	/** 
	 * 续费模式
	 */
	@ApiField("charge_mode")
	private String chargeMode;

	/** 
	 * 当前账单截止时间
	 */
	@ApiField("current_period_end")
	private String currentPeriodEnd;

	/** 
	 * 当前账单开始时间
	 */
	@ApiField("current_period_start")
	private String currentPeriodStart;

	/** 
	 * 订阅项id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付单ID
	 */
	@ApiField("payment_order_id")
	private String paymentOrderId;

	/** 
	 * 支付单对应的账单截止时间
	 */
	@ApiField("payment_period_end")
	private String paymentPeriodEnd;

	/** 
	 * 支付单对应的账单开始时间
	 */
	@ApiField("payment_period_start")
	private String paymentPeriodStart;

	/** 
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public void setCashierUrl(String cashierUrl) {
		this.cashierUrl = cashierUrl;
	}
	public String getCashierUrl( ) {
		return this.cashierUrl;
	}

	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}
	public String getChargeMode( ) {
		return this.chargeMode;
	}

	public void setCurrentPeriodEnd(String currentPeriodEnd) {
		this.currentPeriodEnd = currentPeriodEnd;
	}
	public String getCurrentPeriodEnd( ) {
		return this.currentPeriodEnd;
	}

	public void setCurrentPeriodStart(String currentPeriodStart) {
		this.currentPeriodStart = currentPeriodStart;
	}
	public String getCurrentPeriodStart( ) {
		return this.currentPeriodStart;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPaymentOrderId(String paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}
	public String getPaymentOrderId( ) {
		return this.paymentOrderId;
	}

	public void setPaymentPeriodEnd(String paymentPeriodEnd) {
		this.paymentPeriodEnd = paymentPeriodEnd;
	}
	public String getPaymentPeriodEnd( ) {
		return this.paymentPeriodEnd;
	}

	public void setPaymentPeriodStart(String paymentPeriodStart) {
		this.paymentPeriodStart = paymentPeriodStart;
	}
	public String getPaymentPeriodStart( ) {
		return this.paymentPeriodStart;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

}
