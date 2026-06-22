package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.module.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 19:32:48
 */
public class AlipayOpenSpNopenModuleUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6494469519512395368L;

	/** 
	 * traceId信息
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
