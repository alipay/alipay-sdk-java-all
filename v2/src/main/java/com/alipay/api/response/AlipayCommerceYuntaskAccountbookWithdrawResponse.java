package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.accountbook.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:31:42
 */
public class AlipayCommerceYuntaskAccountbookWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 2471699358354337559L;

	/** 
	 * 处理成功金额
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
