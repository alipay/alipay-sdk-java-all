package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-01 14:41:36
 */
public class AlipayUserCharityAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6185822541984146422L;

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
