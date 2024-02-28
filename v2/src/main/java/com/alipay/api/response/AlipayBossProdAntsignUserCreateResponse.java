package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antsign.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 15:05:35
 */
public class AlipayBossProdAntsignUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2473414199749866989L;

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
