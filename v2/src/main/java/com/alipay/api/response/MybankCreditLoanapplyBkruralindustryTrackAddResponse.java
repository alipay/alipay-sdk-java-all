package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkruralindustry.track.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:33:17
 */
public class MybankCreditLoanapplyBkruralindustryTrackAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5618329861552736724L;

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
