package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.interactive.state.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 14:02:29
 */
public class AlipayContentLiveInteractiveStateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4411352927446456648L;

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
