package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 16:47:25
 */
public class AlipayCommerceMedicalEbbenefitOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7723254332186624434L;

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
