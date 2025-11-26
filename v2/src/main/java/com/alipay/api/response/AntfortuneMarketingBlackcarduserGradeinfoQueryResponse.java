package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.blackcarduser.gradeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 11:32:41
 */
public class AntfortuneMarketingBlackcarduserGradeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6494219597793827136L;

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
