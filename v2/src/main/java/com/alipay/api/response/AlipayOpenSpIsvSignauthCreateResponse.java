package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.signauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 11:27:35
 */
public class AlipayOpenSpIsvSignauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3253298262699942756L;

	/** 
	 * 签约授权一体化主单ID
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
