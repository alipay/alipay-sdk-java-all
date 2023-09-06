package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:32:59
 */
public class AlipayUserCharityAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142255178755468818L;

	/** 
	 * 协议是否有效
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
