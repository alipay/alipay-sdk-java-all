package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-08-01 20:15:36
 */
public class MybankCreditLoanapplyArrangementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1835193157422439764L;

	/** 
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

}
