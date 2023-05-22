package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antsign.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:14:51
 */
public class AlipayBossProdAntsignUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7751753968146314835L;

	/** 
	 * 用户id
	 */
	@ApiField("sign_user_unique_id")
	private String signUserUniqueId;

	public void setSignUserUniqueId(String signUserUniqueId) {
		this.signUserUniqueId = signUserUniqueId;
	}
	public String getSignUserUniqueId( ) {
		return this.signUserUniqueId;
	}

}
