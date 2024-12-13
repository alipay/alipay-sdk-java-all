package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.point.rollback response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 12:02:22
 */
public class AlipayCommerceAcommunicationPointRollbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 6428113471739257473L;

	/** 
	 * 新积分id
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
