package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.nlink.urlsecurity.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 20:22:25
 */
public class AlipayCommerceCityfacilitatorNlinkUrlsecurityVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4542172447832889667L;

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
	 * 查询服务端日志使用
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	/** 
	 * 是否验签成功
	 */
	@ApiField("verify_flag")
	private Boolean verifyFlag;

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

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

	public void setVerifyFlag(Boolean verifyFlag) {
		this.verifyFlag = verifyFlag;
	}
	public Boolean getVerifyFlag( ) {
		return this.verifyFlag;
	}

}
