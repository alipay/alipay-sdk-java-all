package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8369262347844359358L;

	/** 
	 * 可用余额。可用于支付或提现的余额。
	 */
	@ApiField("available_amount")
	private String availableAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

}
