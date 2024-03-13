package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.authlogin.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:00
 */
public class AnttechBlockchainFinanceTruspleAuthloginSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4522197961113833779L;

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
