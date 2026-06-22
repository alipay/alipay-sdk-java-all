package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.order.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-06 11:32:44
 */
public class AlipayCommerceMedicalRegisterOrderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2764744251164553467L;

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
