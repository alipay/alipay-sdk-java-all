package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.aq.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-05 18:07:41
 */
public class AlipayCommerceMedicalAqTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4633457672683674337L;

	/** 
	 * 访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 授权token开始时间，作为有效期计算的起点
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 访问令牌的有效时间，单位是秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * 刷新令牌
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}
	public Date getAuthStart( ) {
		return this.authStart;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

}
