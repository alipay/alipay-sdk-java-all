package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.oauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-28 16:27:41
 */
public class AlipayCommerceMedicalHomedoctorOauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7265142131434196567L;

	/** 
	 * AQ访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("aq_access_token")
	private String aqAccessToken;

	/** 
	 * 用户对外开放openid
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
