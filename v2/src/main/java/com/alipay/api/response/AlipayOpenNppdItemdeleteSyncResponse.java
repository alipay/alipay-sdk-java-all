package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.itemdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 13:58:05
 */
public class AlipayOpenNppdItemdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1646157147361561242L;

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
