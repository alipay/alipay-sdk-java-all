package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.parentaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 10:12:27
 */
public class AlipayCommerceLogisticsFreightflowParentaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2698547767589718539L;

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
