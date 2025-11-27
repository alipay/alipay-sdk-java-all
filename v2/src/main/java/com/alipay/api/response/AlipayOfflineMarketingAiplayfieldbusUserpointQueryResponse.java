package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.userpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:07:31
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7756692564643755374L;

	/** 
	 * 用户可兑奖卡数量
	 */
	@ApiField("point")
	private String point;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setPoint(String point) {
		this.point = point;
	}
	public String getPoint( ) {
		return this.point;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
