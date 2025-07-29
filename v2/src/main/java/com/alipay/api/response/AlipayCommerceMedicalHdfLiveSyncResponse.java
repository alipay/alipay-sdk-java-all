package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.live.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 13:52:29
 */
public class AlipayCommerceMedicalHdfLiveSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4829589772661616217L;

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
