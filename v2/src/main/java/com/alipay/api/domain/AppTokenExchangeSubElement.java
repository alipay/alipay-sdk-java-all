package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用授权获取访问令牌，如果是批量授权，需要返回令牌列表
 *
 * @author auto create
 * @since 1.0, 2018-06-29 17:54:42
 */
public class AppTokenExchangeSubElement extends AlipayObject {

	private static final long serialVersionUID = 3668896214843382568L;

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

	/**
	 * 授权商户appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 过期时间
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/**
	 * 刷新令牌过期时间
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/**
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppAuthToken() {
		return this.appAuthToken;
	}
	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

	public String getAppRefreshToken() {
		return this.appRefreshToken;
	}
	public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public String getExpiresIn() {
		return this.expiresIn;
	}
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getReExpiresIn() {
		return this.reExpiresIn;
	}
	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
