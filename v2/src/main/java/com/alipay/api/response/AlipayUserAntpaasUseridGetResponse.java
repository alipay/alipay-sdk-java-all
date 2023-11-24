package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.userid.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:53
 */
public class AlipayUserAntpaasUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3791834598783289675L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
