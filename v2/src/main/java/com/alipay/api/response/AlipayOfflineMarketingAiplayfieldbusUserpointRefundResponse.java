package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.userpoint.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:49
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8181357864417874375L;

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
