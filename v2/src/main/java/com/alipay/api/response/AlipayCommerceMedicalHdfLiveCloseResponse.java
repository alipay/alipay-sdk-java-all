package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.live.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 21:12:27
 */
public class AlipayCommerceMedicalHdfLiveCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343647224926939763L;

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
