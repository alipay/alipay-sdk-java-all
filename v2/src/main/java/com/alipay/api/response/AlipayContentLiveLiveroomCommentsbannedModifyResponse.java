package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.commentsbanned.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 21:32:30
 */
public class AlipayContentLiveLiveroomCommentsbannedModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7221419964788964113L;

	/** 
	 * 日志链路ID
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

}
