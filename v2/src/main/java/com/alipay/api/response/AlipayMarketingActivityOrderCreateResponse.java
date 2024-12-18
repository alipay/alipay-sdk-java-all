package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:47:04
 */
public class AlipayMarketingActivityOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2323815737638325394L;

	/** 
	 * 购买商家兑换券的营销订单号。

主要用于后续的退款等操作。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部业务订单号。 同时具备幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝交易号。
用于后续的交易支付。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
