package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.security.answer.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 15:13:44
 */
public class AlipayEbppIndustrySecurityAnswerCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8727777256681134712L;

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
