package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.userorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 13:58:22
 */
public class AlipayOpenNppdUserorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7119787898165135183L;

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
