package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.coefficient.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 19:28:05
 */
public class AlipayInsDataAutoCoefficientSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8526985421749599553L;

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
