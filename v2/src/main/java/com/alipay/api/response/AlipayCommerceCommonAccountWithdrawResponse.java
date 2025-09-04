package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.account.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:01:16
 */
public class AlipayCommerceCommonAccountWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153855954382248217L;

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
