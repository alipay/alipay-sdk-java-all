package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.payfinish.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-06 11:02:44
 */
public class AlipayCommerceMedicalRegisterPayfinishNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4532321626847718432L;

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
