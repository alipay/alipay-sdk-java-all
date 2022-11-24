package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.ar.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-11 17:20:01
 */
public class MybankCreditSupplychainArUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8484544122241749397L;

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
