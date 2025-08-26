package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.order.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 16:12:36
 */
public class AlipayCommerceMedicalRegisterOrderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2857994373536416124L;

	/** 
	 * 支付宝订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 排班id
	 */
	@ApiField("register_id")
	private String registerId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
