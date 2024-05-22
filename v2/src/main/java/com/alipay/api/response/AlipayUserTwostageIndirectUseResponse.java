package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.twostage.indirect.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:55
 */
public class AlipayUserTwostageIndirectUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8445568895882546728L;

	/** 
	 * 蚂蚁统一会员ID
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
