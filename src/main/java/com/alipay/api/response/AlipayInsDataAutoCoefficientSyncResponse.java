package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.coefficient.sync response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-08 15:48:05
 */
public class AlipayInsDataAutoCoefficientSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7664153979157615417L;

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
