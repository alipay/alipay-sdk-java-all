package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取预览链接的返回结果
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:49:27
 */
public class GetOfficePreviewURLResponse extends AlipayObject {

	private static final long serialVersionUID = 4745581756239859118L;

	/**
	 * ak
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * ak有效期
	 */
	@ApiField("access_token_expired_time")
	private String accessTokenExpiredTime;

	/**
	 * 预览地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 刷新token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * 刷新token有效期
	 */
	@ApiField("refresh_token_expired_time")
	private String refreshTokenExpiredTime;

	/**
	 * 请求号
	 */
	@ApiField("request_d")
	private String requestD;

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

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
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

	public String getRequestD() {
		return this.requestD;
	}
	public void setRequestD(String requestD) {
		this.requestD = requestD;
	}

}
