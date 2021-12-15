package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.login.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-23 20:40:14
 */
public class AlipayUserAccountLoginTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685738346229557727L;

	/** 
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
