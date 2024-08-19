package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 17:23:24
 */
public class AlipayIserviceIcontrolServiceorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5535671526955711324L;

	/** 
	 * 经度
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
