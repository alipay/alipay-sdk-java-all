package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-07 10:11:43
 */
public class AlipayOpenAppOpenidApplyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4385317854829673343L;

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
