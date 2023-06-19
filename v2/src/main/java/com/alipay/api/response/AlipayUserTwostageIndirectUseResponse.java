package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.twostage.indirect.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-27 10:24:16
 */
public class AlipayUserTwostageIndirectUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5124559444739247778L;

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
