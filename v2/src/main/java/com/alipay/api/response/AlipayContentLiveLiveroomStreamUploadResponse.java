package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.stream.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 10:47:25
 */
public class AlipayContentLiveLiveroomStreamUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5417793613765394535L;

	/** 
	 * 日志链路id
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
