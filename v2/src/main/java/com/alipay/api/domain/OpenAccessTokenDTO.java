package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权临牌信息
 *
 * @author auto create
 * @since 1.0, 2024-08-15 19:43:24
 */
public class OpenAccessTokenDTO extends AlipayObject {

	private static final long serialVersionUID = 1728675889465557793L;

	/**
	 * 授权令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 授权令牌有效时间,单位为毫秒时间戳
	 */
	@ApiField("access_token_expire_time")
	private String accessTokenExpireTime;

	/**
	 * 刷新令牌
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * 刷新令牌有效时间,单位为毫秒时间戳
	 */
	@ApiField("refresh_token_expire_time")
	private String refreshTokenExpireTime;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessTokenExpireTime() {
		return this.accessTokenExpireTime;
	}
	public void setAccessTokenExpireTime(String accessTokenExpireTime) {
		this.accessTokenExpireTime = accessTokenExpireTime;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRefreshTokenExpireTime() {
		return this.refreshTokenExpireTime;
	}
	public void setRefreshTokenExpireTime(String refreshTokenExpireTime) {
		this.refreshTokenExpireTime = refreshTokenExpireTime;
	}

}
