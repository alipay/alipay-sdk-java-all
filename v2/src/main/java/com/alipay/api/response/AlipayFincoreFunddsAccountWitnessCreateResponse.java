package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:21:19
 */
public class AlipayFincoreFunddsAccountWitnessCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4435271682699427316L;

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
