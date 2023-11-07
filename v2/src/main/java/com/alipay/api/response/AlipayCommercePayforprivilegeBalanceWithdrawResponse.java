package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.payforprivilege.balance.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:31:55
 */
public class AlipayCommercePayforprivilegeBalanceWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 6352776887846685899L;

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
