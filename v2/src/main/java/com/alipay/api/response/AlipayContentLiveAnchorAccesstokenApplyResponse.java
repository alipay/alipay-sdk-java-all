package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.anchor.accesstoken.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 15:27:41
 */
public class AlipayContentLiveAnchorAccesstokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3285618579355145229L;

	/** 
	 * 鉴权token
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 用于全链路排查问题的追踪标识
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

}
