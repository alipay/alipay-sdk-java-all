package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.blackcarduser.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AntfortuneMarketingBlackcarduserUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3611624657355764912L;

	/** 
	 * 检查结果是否通过：true/false
	 */
	@ApiField("auth_result")
	private String authResult;

	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}
	public String getAuthResult( ) {
		return this.authResult;
	}

}
