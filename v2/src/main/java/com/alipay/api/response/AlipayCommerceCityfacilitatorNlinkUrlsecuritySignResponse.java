package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.nlink.urlsecurity.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 09:32:13
 */
public class AlipayCommerceCityfacilitatorNlinkUrlsecuritySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2219422398298611557L;

	/** 
	 * 耗时单位毫秒
	 */
	@ApiField("cost_time")
	private Long costTime;

	/** 
	 * 返回信息
	 */
	@ApiField("msg_info")
	private String msgInfo;

	/** 
	 * 服务端签名
	 */
	@ApiField("server_sign")
	private String serverSign;

	/** 
	 * trace_id_info
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	/** 
	 * 原始url
	 */
	@ApiField("url")
	private String url;

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}
	public Long getCostTime( ) {
		return this.costTime;
	}

	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}
	public String getMsgInfo( ) {
		return this.msgInfo;
	}

	public void setServerSign(String serverSign) {
		this.serverSign = serverSign;
	}
	public String getServerSign( ) {
		return this.serverSign;
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
