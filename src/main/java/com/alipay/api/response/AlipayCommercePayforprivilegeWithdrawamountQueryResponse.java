package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.payforprivilege.withdrawamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-18 09:21:48
 */
public class AlipayCommercePayforprivilegeWithdrawamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7785843192259528394L;

	/** 
	 * 总金额
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 可提现金额，单位元
	 */
	@ApiField("withdraw_balance")
	private String withdrawBalance;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setWithdrawBalance(String withdrawBalance) {
		this.withdrawBalance = withdrawBalance;
	}
	public String getWithdrawBalance( ) {
		return this.withdrawBalance;
	}

}
