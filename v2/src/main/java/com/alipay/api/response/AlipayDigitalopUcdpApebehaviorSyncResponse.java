package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apebehavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-06 13:06:39
 */
public class AlipayDigitalopUcdpApebehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4245314179894687949L;

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
