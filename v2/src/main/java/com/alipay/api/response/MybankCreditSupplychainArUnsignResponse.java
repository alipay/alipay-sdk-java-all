package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.ar.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:59:32
 */
public class MybankCreditSupplychainArUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3112822612657484517L;

	/** 
	 * 解约结果：true/false
	 */
	@ApiField("invalid_result")
	private Boolean invalidResult;

	public void setInvalidResult(Boolean invalidResult) {
		this.invalidResult = invalidResult;
	}
	public Boolean getInvalidResult( ) {
		return this.invalidResult;
	}

}
