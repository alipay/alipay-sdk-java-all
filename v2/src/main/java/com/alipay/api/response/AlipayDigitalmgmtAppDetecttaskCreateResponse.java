package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.app.detecttask.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-17 19:32:00
 */
public class AlipayDigitalmgmtAppDetecttaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8554238254198163768L;

	/** 
	 * 请求幂等校验id
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
