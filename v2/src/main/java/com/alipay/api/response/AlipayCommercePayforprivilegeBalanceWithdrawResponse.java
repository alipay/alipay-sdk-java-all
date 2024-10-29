package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.payforprivilege.balance.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:34
 */
public class AlipayCommercePayforprivilegeBalanceWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 7843531745894182215L;

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
