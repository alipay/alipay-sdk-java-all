package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1768113191586767989L;

	/** 
	 * 申请单号
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
