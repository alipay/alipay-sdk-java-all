package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 21:50:03
 */
public class AlipayTradeCustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1583922433818364299L;

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
