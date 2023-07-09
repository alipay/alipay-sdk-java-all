package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.behavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:26:48
 */
public class TechriskInnovateMpcpromoBehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1459254337573235894L;

	/** 
	 * 请求的traceid，用于排查问题
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
