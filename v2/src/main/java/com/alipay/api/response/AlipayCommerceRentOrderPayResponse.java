package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 19:47:50
 */
public class AlipayCommerceRentOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7848495825478135489L;

	/** 
	 * 交易组件业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 租金支付外部请求号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 租赁支付准入Token
	 */
	@ApiField("pay_token")
	private String payToken;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setPayToken(String payToken) {
		this.payToken = payToken;
	}
	public String getPayToken( ) {
		return this.payToken;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
