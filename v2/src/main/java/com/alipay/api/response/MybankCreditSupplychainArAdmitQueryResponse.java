package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.ar.admit.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainArAdmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1166775551897213932L;

	/** 
	 * 准入/不准入：true/false
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 不准入说明
	 */
	@ApiField("context")
	private String context;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setContext(String context) {
		this.context = context;
	}
	public String getContext( ) {
		return this.context;
	}

}
