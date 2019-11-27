package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.complex.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-27 10:48:08
 */
public class AlipayOpenAppOpenbizmockComplexModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5647477951174871913L;

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
