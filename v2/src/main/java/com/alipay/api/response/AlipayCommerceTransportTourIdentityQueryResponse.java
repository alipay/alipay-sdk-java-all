package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 15:22:40
 */
public class AlipayCommerceTransportTourIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1227441655987513424L;

	/** 
	 * 查询返回结果
	 */
	@ApiField("identity_result")
	private String identityResult;

	public void setIdentityResult(String identityResult) {
		this.identityResult = identityResult;
	}
	public String getIdentityResult( ) {
		return this.identityResult;
	}

}
