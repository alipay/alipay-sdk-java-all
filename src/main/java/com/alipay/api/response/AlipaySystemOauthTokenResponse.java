package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.oauth.token response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 17:14:48
 */
public class AlipaySystemOauthTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 6312731375671493565L;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 已废弃，请勿使用
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 授权token开始时间，作为有效期计算的起点
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 令牌类型，permanent表示返回的access_token和refresh_token永久有效，非永久令牌不返回该字段
	 */
	@ApiField("auth_token_type")
	private String authTokenType;

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
	 * 支付宝用户的唯一标识。以2088开头的16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}
	public Date getAuthStart( ) {
		return this.authStart;
	}

	public void setAuthTokenType(String authTokenType) {
		this.authTokenType = authTokenType;
	}
	public String getAuthTokenType( ) {
		return this.authTokenType;
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
