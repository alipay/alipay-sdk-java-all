package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.oauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-30 14:07:41
 */
public class AlipayCommerceMedicalHomedoctorOauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8175255343876394386L;

	/** 
	 * 蚂蚁健康访问令牌。通过该令牌调用需要授权接口
	 */
	@ApiField("aq_access_token")
	private String aqAccessToken;

	/** 
	 * 蚂蚁健康用户用户对外开放OPEN_ID
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/** 
	 * 访问令牌的有效时间，单位是秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	public void setAqAccessToken(String aqAccessToken) {
		this.aqAccessToken = aqAccessToken;
	}
	public String getAqAccessToken( ) {
		return this.aqAccessToken;
	}

	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}
	public String getAqOpenId( ) {
		return this.aqOpenId;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

}
