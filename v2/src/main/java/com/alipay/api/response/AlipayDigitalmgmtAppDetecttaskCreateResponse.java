package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.app.detecttask.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:21:43
 */
public class AlipayDigitalmgmtAppDetecttaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8513141492284773324L;

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
