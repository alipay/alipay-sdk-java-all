package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.account.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-20 14:36:50
 */
public class AlipayCommerceCommonAccountWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 8336157462436753314L;

	/** 
	 * 提现成功金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

}
