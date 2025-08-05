package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.userorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:46
 */
public class AlipayOfflineMarketingAiplayfieldbusUserorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5498719317844254675L;

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
