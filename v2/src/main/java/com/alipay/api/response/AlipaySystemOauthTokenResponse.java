package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.oauth.token response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:47
 */
public class AlipaySystemOauthTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 7411423784182241623L;

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
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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
	 * union_id是支付宝用户在开放平台的唯一标识符，在配置应用分组后会返回该值。
同一用户的union_id在同一分组内应用保持一致。
	 */
	@ApiField("union_id")
	private String unionId;

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

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
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

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getUnionId( ) {
		return this.unionId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
