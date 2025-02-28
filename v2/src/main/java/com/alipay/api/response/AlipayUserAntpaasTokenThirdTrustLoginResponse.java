package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.third.trust.login response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayUserAntpaasTokenThirdTrustLoginResponse extends AlipayResponse {

	private static final long serialVersionUID = 5124753617937976187L;

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
