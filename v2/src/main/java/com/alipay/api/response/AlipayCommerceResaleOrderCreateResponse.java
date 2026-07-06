package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 17:22:45
 */
public class AlipayCommerceResaleOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351862582776986794L;

	/** 
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户订单h
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

}
