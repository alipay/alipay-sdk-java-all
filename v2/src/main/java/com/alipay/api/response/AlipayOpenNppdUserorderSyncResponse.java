package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.userorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:27:37
 */
public class AlipayOpenNppdUserorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2143946391944528319L;

	/** 
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
