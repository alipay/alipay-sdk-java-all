package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aosbehavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:16:57
 */
public class AlipayOpenMiniCloudAosbehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8768687284522154925L;

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
