package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-31 09:42:54
 */
public class AlipayOpenSpMcpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2536155643422145656L;

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
