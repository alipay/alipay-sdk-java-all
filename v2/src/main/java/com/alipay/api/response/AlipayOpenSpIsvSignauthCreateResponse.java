package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.signauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 15:54:20
 */
public class AlipayOpenSpIsvSignauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2341419363617691137L;

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
