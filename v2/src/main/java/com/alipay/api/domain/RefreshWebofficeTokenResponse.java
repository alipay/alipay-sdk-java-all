package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件编辑token刷新结果
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:49:46
 */
public class RefreshWebofficeTokenResponse extends AlipayObject {

	private static final long serialVersionUID = 6742144544413544433L;

	/**
	 * ak
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * ak过期时间
	 */
	@ApiField("access_token_expired_time")
	private String accessTokenExpiredTime;

	/**
	 * 刷新token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * 刷新token失效时间
	 */
	@ApiField("refresh_token_expired_time")
	private String refreshTokenExpiredTime;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessTokenExpiredTime() {
		return this.accessTokenExpiredTime;
	}
	public void setAccessTokenExpiredTime(String accessTokenExpiredTime) {
		this.accessTokenExpiredTime = accessTokenExpiredTime;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRefreshTokenExpiredTime() {
		return this.refreshTokenExpiredTime;
	}
	public void setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
		this.refreshTokenExpiredTime = refreshTokenExpiredTime;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
