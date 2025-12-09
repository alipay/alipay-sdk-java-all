package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.userpoint.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:07:37
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4272292898467672677L;

	/** 
	 * 请求id
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
