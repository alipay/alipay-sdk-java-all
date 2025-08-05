package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.itemmodify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:45
 */
public class AlipayOfflineMarketingAiplayfieldbusItemmodifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4361541614325569966L;

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
