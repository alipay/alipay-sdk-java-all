package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.refund.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:06:46
 */
public class AlipayPcreditLoanRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143644965214194866L;

	/** 
	 * 受理的还款申请单号
	 */
	@ApiField("loan_repay_no")
	private String loanRepayNo;

	public void setLoanRepayNo(String loanRepayNo) {
		this.loanRepayNo = loanRepayNo;
	}
	public String getLoanRepayNo( ) {
		return this.loanRepayNo;
	}

}
