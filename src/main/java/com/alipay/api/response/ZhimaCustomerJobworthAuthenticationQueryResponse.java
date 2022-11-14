package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-11 17:31:34
 */
public class ZhimaCustomerJobworthAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1415992887448287581L;

	/** 
	 * SUCCESS代表可信，FAILED代表不可信，WAITING_VERIFY代表未知需要等待结果
	 */
	@ApiField("identity_result")
	private String identityResult;

	/** 
	 * 身份认证查询结果页面的小程序链接，有芝麻提供，用户在端内可直接访问
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
