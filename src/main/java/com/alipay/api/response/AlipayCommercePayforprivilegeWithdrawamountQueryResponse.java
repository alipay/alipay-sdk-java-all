package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.payforprivilege.withdrawamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-18 17:31:38
 */
public class AlipayCommercePayforprivilegeWithdrawamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2277714395727488223L;

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
