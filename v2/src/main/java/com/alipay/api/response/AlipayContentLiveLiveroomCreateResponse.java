package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 14:02:30
 */
public class AlipayContentLiveLiveroomCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3321671986121546716L;

	/** 
	 * 支付宝直播id
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/** 
	 * 日志链路id
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}
	public String getAlipayLiveId( ) {
		return this.alipayLiveId;
	}

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

}
