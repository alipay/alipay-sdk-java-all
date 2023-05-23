package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.secondparty.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:40:29
 */
public class AlipayUserAuthSecondpartyTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2589634142528164384L;

	/** 
	 * 淘宝用户id
	 */
	@ApiField("tb_user_id")
	private String tbUserId;

	public void setTbUserId(String tbUserId) {
		this.tbUserId = tbUserId;
	}
	public String getTbUserId( ) {
		return this.tbUserId;
	}

}
