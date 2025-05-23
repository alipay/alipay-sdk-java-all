package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.itemincrement.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:52
 */
public class AlipayOpenNppdItemincrementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572979983128431266L;

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
