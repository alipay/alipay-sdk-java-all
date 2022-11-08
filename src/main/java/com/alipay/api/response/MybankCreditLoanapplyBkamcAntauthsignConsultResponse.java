package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkamc.antauthsign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-02 17:00:16
 */
public class MybankCreditLoanapplyBkamcAntauthsignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5659125434658623626L;

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
