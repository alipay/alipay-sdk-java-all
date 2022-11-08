package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.userlist.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-28 11:11:44
 */
public class MybankCreditLoanapplyUserlistUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648789747151541996L;

	/** 
	 * 请求是否成功
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
