package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.signauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 15:39:25
 */
public class AlipayOpenSpIsvSignauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6664998924753624341L;

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
