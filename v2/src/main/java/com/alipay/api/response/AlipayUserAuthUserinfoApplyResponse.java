package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.userinfo.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:13
 */
public class AlipayUserAuthUserinfoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678456129663345258L;

	/** 
	 * 授权的码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 用户在应用（AppId）下的用户唯一标识。
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户的支付宝id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
