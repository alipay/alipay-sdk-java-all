package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.itemincrement.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:07:31
 */
public class AlipayOfflineMarketingAiplayfieldbusItemincrementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8367833818398358921L;

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
