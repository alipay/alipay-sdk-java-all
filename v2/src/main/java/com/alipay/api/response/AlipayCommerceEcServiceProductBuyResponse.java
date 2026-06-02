package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.product.buy response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-07 16:12:45
 */
public class AlipayCommerceEcServiceProductBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2824886673229371913L;

	/** 
	 * 服务订购单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
