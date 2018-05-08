package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanar.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-02-08 14:35:20
 */
public class MybankCreditLoantradeLoanarCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3679345298849613877L;

	/** 
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

}
