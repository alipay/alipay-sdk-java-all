package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.bayu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:08
 */
public class AlipaySecurityBayuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1478166297855528144L;

	/** 
	 * 金额
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
