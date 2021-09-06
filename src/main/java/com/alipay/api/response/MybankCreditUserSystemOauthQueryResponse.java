package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.system.oauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 10:36:16
 */
public class MybankCreditUserSystemOauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7767531137478585218L;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 访问令牌的有效时间，单位是秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间，单位是秒。
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 刷新令牌。通过该令牌可以刷新access_token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}
	public String getReExpiresIn( ) {
		return this.reExpiresIn;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
