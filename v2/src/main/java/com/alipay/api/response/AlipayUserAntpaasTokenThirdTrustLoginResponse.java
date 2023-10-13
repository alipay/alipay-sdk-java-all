package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.third.trust.login response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:15:31
 */
public class AlipayUserAntpaasTokenThirdTrustLoginResponse extends AlipayResponse {

	private static final long serialVersionUID = 1429395117678244482L;

	/** 
	 * third_trust_token：用户免登的一次性token；后续使用改token进行免登请求。
	 */
	@ApiField("third_trust_token")
	private String thirdTrustToken;

	public void setThirdTrustToken(String thirdTrustToken) {
		this.thirdTrustToken = thirdTrustToken;
	}
	public String getThirdTrustToken( ) {
		return this.thirdTrustToken;
	}

}
