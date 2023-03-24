package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkruralindustry.track.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:37:47
 */
public class MybankCreditLoanapplyBkruralindustryTrackAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2428393855267149126L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
