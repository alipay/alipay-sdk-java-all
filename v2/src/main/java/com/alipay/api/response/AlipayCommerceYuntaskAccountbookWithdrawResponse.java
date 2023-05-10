package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.accountbook.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:11:57
 */
public class AlipayCommerceYuntaskAccountbookWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 2537668696787773778L;

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
