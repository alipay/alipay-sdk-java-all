package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.authlogin.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:31:48
 */
public class AnttechBlockchainFinanceTruspleAuthloginSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5656937536331165317L;

	/** 
	 * 四要素认证通过的authToken，可用于后续登录
	 */
	@ApiField("auth_token")
	private String authToken;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

}
