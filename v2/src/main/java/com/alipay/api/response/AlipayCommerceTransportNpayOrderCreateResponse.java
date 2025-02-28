package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.npay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-28 17:27:27
 */
public class AlipayCommerceTransportNpayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4391383421927985367L;

	/** 
	 * 行业订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
