package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 11:57:40
 */
public class AlipayCommerceRentOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6297992886296275541L;

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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
