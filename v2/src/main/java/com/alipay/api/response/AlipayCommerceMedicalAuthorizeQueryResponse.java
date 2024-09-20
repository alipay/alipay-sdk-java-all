package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 16:54:51
 */
public class AlipayCommerceMedicalAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8744291216358259151L;

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
