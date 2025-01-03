package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 20:57:22
 */
public class AlipayCommerceMedicalEbbenefitOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1437923172424986693L;

	/** 
	 * 订单ID
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
