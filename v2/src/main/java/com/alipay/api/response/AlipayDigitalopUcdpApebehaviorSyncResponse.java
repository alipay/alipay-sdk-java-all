package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apebehavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 17:31:54
 */
public class AlipayDigitalopUcdpApebehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1383172249544179421L;

	/** 
	 * 请求链路标识，用于排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
