package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 15:32:38
 */
public class AlipayFincoreFunddsAccountWitnessModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2283893522432464673L;

	/** 
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

}
