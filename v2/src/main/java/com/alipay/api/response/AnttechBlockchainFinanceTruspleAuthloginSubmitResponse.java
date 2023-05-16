package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.authlogin.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:21:55
 */
public class AnttechBlockchainFinanceTruspleAuthloginSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5663148944165138172L;

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
