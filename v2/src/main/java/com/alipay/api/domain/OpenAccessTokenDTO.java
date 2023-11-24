package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权临牌信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 14:53:25
 */
public class OpenAccessTokenDTO extends AlipayObject {

	private static final long serialVersionUID = 7168894177767246858L;

	/**
	 * 授权令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 刷新令牌
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * 刷新令牌有效时间
	 */
	@ApiField("refresh_token_expire_time")
	private String refreshTokenExpireTime;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
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
