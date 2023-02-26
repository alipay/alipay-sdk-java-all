package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.agreement.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:06:23
 */
public class AlipayUserCharityAgreementApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3785471935782119464L;

	/** 
	 * 状态
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
