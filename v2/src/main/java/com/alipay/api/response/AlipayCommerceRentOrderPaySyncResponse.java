package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.pay.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 18:27:31
 */
public class AlipayCommerceRentOrderPaySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6313331553842244688L;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 租金支付外部请求号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次支付请求的金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

}
