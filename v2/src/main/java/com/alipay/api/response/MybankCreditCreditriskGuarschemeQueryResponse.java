package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.guarscheme.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:11:01
 */
public class MybankCreditCreditriskGuarschemeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3236652684638722184L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 可用担保额度
	 */
	@ApiField("available_amt")
	private String availableAmt;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}
	public String getAvailableAmt( ) {
		return this.availableAmt;
	}

}
