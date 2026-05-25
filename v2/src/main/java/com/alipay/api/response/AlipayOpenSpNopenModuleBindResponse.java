package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.module.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 19:32:48
 */
public class AlipayOpenSpNopenModuleBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8175249315335238175L;

	/** 
	 * 模组SN
	 */
	@ApiField("sn")
	private String sn;

	/** 
	 * traceId信息
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	/** 
	 * N链接URL
	 */
	@ApiField("url")
	private String url;

	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSn( ) {
		return this.sn;
	}

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
