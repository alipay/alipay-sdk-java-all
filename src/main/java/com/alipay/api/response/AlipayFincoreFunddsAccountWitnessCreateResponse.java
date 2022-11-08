package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-30 15:11:47
 */
public class AlipayFincoreFunddsAccountWitnessCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1112595272121748342L;

	/** 
	 * 开户账号
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
