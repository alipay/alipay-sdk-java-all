package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.coefficient.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:50:23
 */
public class AlipayInsDataAutoCoefficientSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1116339276625583884L;

	/** 
	 * 用户唯一请求id
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
