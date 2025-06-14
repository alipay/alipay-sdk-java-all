package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 10:12:28
 */
public class AlipayCommerceLogisticsFreightflowSubaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5345366326342123816L;

	/** 
	 * 账户余额，单位分
	 */
	@ApiField("account_balance")
	private String accountBalance;

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountBalance( ) {
		return this.accountBalance;
	}

}
