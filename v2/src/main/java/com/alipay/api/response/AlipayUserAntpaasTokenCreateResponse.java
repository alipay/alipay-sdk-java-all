package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:13
 */
public class AlipayUserAntpaasTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351377732778643514L;

	/** 
	 * 蚂蚁通行证id
	 */
	@ApiField("ant_id")
	private String antId;

	public void setAntId(String antId) {
		this.antId = antId;
	}
	public String getAntId( ) {
		return this.antId;
	}

}
