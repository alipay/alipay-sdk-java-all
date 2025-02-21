package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.itemdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:58
 */
public class AlipayOpenNppdItemdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2668316811997181883L;

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
