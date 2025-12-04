package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.nlink.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-28 16:22:41
 */
public class AlipayOpenSpNopenNlinkGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7531441752115818615L;

	/** 
	 * 耗时单位毫秒
	 */
	@ApiField("cost_time")
	private Long costTime;

	/** 
	 * 碰一下链接
	 */
	@ApiField("n_link_url")
	private String nLinkUrl;

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

	public void setnLinkUrl(String nLinkUrl) {
		this.nLinkUrl = nLinkUrl;
	}
	public String getnLinkUrl( ) {
		return this.nLinkUrl;
	}

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
