package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.industry.platform.create.token response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:45:26
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 4717326255994874944L;

	/** 
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * appid
	 */
	@ApiField("requst_app_id")
	private String requstAppId;

	/** 
	 * scope
	 */
	@ApiField("scope")
	private String scope;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setRequstAppId(String requstAppId) {
		this.requstAppId = requstAppId;
	}
	public String getRequstAppId( ) {
		return this.requstAppId;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getScope( ) {
		return this.scope;
	}

}
