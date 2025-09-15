package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:13:24
 */
public class AlipayOpenAppOpenidApplyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6636113273794364848L;

	/** 
	 * 工单的唯一标识
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
