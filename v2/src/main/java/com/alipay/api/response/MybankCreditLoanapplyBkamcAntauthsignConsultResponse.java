package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkamc.antauthsign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:38:18
 */
public class MybankCreditLoanapplyBkamcAntauthsignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343685391261848384L;

	/** 
	 * 是否有授权
	 */
	@ApiField("authed")
	private Boolean authed;

	public void setAuthed(Boolean authed) {
		this.authed = authed;
	}
	public Boolean getAuthed( ) {
		return this.authed;
	}

}
