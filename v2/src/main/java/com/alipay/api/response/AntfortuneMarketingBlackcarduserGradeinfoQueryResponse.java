package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.blackcarduser.gradeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-26 11:27:42
 */
public class AntfortuneMarketingBlackcarduserGradeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5346967469789769356L;

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
