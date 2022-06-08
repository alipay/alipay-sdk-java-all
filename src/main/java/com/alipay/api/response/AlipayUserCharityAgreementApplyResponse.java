package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.agreement.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-01 14:46:38
 */
public class AlipayUserCharityAgreementApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3168742619386868942L;

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
