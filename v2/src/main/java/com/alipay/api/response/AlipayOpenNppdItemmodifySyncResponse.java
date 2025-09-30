package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.itemmodify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 13:57:32
 */
public class AlipayOpenNppdItemmodifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6187971274953785751L;

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
