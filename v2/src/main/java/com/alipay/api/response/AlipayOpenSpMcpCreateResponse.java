package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-16 15:06:25
 */
public class AlipayOpenSpMcpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6219692168167121226L;

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
