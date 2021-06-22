package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-14 14:27:20
 */
public class AlipayOpenAuthAppApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2457589373975977761L;

	/** 
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 刷新令牌
	 */
	@ApiField("app_refresh_token")
	private String appRefreshToken;

	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}
	public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

	public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}
	public String getAppRefreshToken( ) {
		return this.appRefreshToken;
	}

}
