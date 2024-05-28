package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 17:57:02
 */
public class AlipayCommerceMedicalAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8374794144173872693L;

	/** 
	 * 一码付签约状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
