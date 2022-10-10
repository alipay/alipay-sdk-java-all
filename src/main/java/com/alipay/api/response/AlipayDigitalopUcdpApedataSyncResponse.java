package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apedata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 15:36:53
 */
public class AlipayDigitalopUcdpApedataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6655799318276457878L;

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
