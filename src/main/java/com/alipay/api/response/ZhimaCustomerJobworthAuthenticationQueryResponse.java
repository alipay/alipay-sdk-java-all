package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-01 13:59:03
 */
public class ZhimaCustomerJobworthAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876661496962468475L;

	/** 
	 * T代表可信，F代表不可信，U代表未知需要等待结果
	 */
	@ApiField("identity_result")
	private String identityResult;

	/** 
	 * 身份认证查询结果页面，有芝麻提供，商家可以继承到自己app或者小程序内，用户点击后即可看到认证结果
	 */
	@ApiField("identity_result_skip_url")
	private String identityResultSkipUrl;

	public void setIdentityResult(String identityResult) {
		this.identityResult = identityResult;
	}
	public String getIdentityResult( ) {
		return this.identityResult;
	}

	public void setIdentityResultSkipUrl(String identityResultSkipUrl) {
		this.identityResultSkipUrl = identityResultSkipUrl;
	}
	public String getIdentityResultSkipUrl( ) {
		return this.identityResultSkipUrl;
	}

}
