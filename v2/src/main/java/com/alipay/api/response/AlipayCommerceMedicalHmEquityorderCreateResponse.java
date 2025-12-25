package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.equityorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class AlipayCommerceMedicalHmEquityorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7316827657611135378L;

	/** 
	 * 订单号
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
