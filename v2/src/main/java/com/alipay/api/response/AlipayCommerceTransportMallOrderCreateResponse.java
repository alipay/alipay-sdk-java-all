package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.mall.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 10:22:43
 */
public class AlipayCommerceTransportMallOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7514764377736867161L;

	/** 
	 * 订单同步相关状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
