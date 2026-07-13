package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:56
 */
public class AlipayTradeCustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152132326885851837L;

	/** 
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

}
