package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.appinfo.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 19:23:48
 */
public class AlipaySecurityRiskAppinfoDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1288968979649579328L;

	/** 
	 * app风险列表信息
	 */
	@ApiField("app_risk_info_list")
	private String appRiskInfoList;

	/** 
	 * 产商请求返回为false，主动推送为true
	 */
	@ApiField("push")
	private Boolean push;

	/** 
	 * 对应请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setAppRiskInfoList(String appRiskInfoList) {
		this.appRiskInfoList = appRiskInfoList;
	}
	public String getAppRiskInfoList( ) {
		return this.appRiskInfoList;
	}

	public void setPush(Boolean push) {
		this.push = push;
	}
	public Boolean getPush( ) {
		return this.push;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
