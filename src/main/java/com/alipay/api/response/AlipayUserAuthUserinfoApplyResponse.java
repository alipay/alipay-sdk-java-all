package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.userinfo.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-17 11:40:18
 */
public class AlipayUserAuthUserinfoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1452652174819261248L;

	/** 
	 * 授权的码
	 */
	@ApiField("auth_code")
	private String authCode;

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

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
