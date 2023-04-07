package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.tokenidentity.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:18
 */
public class AlipayUserAntpaasTokenidentityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1761442161541238441L;

	/** 
	 * 蚂蚁通行证id
	 */
	@ApiField("ant_id")
	private String antId;

	/** 
	 * 支付宝用户Id，即匿名用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAntId(String antId) {
		this.antId = antId;
	}
	public String getAntId( ) {
		return this.antId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
