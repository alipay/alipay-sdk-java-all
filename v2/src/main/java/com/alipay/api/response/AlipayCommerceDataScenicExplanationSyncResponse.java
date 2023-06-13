package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.explanation.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:12:57
 */
public class AlipayCommerceDataScenicExplanationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5514771741862973791L;

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
