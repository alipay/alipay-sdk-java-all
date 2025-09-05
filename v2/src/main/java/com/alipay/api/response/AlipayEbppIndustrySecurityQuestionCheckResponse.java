package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.security.question.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 15:13:43
 */
public class AlipayEbppIndustrySecurityQuestionCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1354131964546834754L;

	/** 
	 * 检测结果是否安全
	 */
	@ApiField("safe")
	private Boolean safe;

	/** 
	 * 会话动作
	 */
	@ApiField("session_action")
	private String sessionAction;

	public void setSafe(Boolean safe) {
		this.safe = safe;
	}
	public Boolean getSafe( ) {
		return this.safe;
	}

	public void setSessionAction(String sessionAction) {
		this.sessionAction = sessionAction;
	}
	public String getSessionAction( ) {
		return this.sessionAction;
	}

}
