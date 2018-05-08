package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-22 11:18:47
 */
public class MybankCreditLoanapplyArrangementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4747568314149963955L;

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
