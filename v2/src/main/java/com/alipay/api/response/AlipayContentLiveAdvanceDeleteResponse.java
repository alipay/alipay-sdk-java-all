package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.advance.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 14:02:30
 */
public class AlipayContentLiveAdvanceDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143399487192869517L;

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
