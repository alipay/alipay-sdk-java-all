package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.payfinish.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:42:30
 */
public class AlipayCommerceMedicalRegisterPayfinishNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2299931185168438677L;

	/** 
	 * 退款中
	 */
	@ApiField("order_pay_status")
	private String orderPayStatus;

	public void setOrderPayStatus(String orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}
	public String getOrderPayStatus( ) {
		return this.orderPayStatus;
	}

}
