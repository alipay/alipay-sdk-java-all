package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.appointmentorder.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-05 10:36:57
 */
public class AlipayCommerceMedicalAppointmentorderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3167656787255161691L;

	/** 
	 * 订单id
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
