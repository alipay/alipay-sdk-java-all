package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.license.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-25 10:25:15
 */
public class AlipayOpenSpNopenLicenseInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7111499336513271436L;

	/** 
	 * 耗时单位毫秒
	 */
	@ApiField("cost_time")
	private Long costTime;

	/** 
	 * 查询服务端日志使用
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}
	public Long getCostTime( ) {
		return this.costTime;
	}

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
