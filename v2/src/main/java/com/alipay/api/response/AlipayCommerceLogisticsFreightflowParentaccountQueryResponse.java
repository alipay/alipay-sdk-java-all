package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.parentaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 14:17:43
 */
public class AlipayCommerceLogisticsFreightflowParentaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1169477938341818331L;

	/** 
	 * 账户余额，单位分
	 */
	@ApiField("account_balance")
	private String accountBalance;

	/** 
	 * 可用余额.单位为分
	 */
	@ApiField("actual_balance")
	private String actualBalance;

	/** 
	 * 冻结金额,单位为分
	 */
	@ApiField("freeze_amt")
	private String freezeAmt;

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountBalance( ) {
		return this.accountBalance;
	}

	public void setActualBalance(String actualBalance) {
		this.actualBalance = actualBalance;
	}
	public String getActualBalance( ) {
		return this.actualBalance;
	}

	public void setFreezeAmt(String freezeAmt) {
		this.freezeAmt = freezeAmt;
	}
	public String getFreezeAmt( ) {
		return this.freezeAmt;
	}

}
