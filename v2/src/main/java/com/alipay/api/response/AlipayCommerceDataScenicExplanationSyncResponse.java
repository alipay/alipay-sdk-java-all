package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.explanation.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:10:04
 */
public class AlipayCommerceDataScenicExplanationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4863759266167286122L;

	/** 
	 * 成功请求ID。
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
