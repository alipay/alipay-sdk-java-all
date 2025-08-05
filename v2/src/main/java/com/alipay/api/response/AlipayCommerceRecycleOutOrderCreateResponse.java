package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.out.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 13:47:33
 */
public class AlipayCommerceRecycleOutOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4775399799197192937L;

	/** 
	 * 交易组件订单号
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
