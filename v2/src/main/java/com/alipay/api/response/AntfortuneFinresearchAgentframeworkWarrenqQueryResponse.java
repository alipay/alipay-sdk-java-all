package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.agentframework.warrenq.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-06 00:06:33
 */
public class AntfortuneFinresearchAgentframeworkWarrenqQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123931565166437725L;

	/** 
	 * 请求的唯一ID
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
