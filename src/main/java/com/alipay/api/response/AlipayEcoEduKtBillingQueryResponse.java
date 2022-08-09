package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.billing.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-30 17:00:27
 */
public class AlipayEcoEduKtBillingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8446719827841529737L;

	/** 
	 * NOT_PAY  待缴费
PAYING  支付中
PAY_SUCCESS 支付成功，处理中
BILLING_SUCCESS 缴费成功
TIMEOUT_CLOSED 逾期关闭账单
ISV_CLOSED 账单关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * ISV发送账单时输入ISV端的账单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
