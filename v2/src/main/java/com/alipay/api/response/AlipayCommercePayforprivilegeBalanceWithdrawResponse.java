package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.payforprivilege.balance.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:11:46
 */
public class AlipayCommercePayforprivilegeBalanceWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 5638314789488479616L;

	/** 
	 * 提现流水号
	 */
	@ApiField("withdraw_id")
	private String withdrawId;

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}
	public String getWithdrawId( ) {
		return this.withdrawId;
	}

}
