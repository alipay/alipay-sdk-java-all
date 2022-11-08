package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-02 20:07:04
 */
public class AlipayOpenAuthUserauthTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238118418583974417L;

	/** 
	 * 授权开始时间
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("auth_token")
	private String authToken;

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

	public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}
	public Date getAuthStart( ) {
		return this.authStart;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
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

}
