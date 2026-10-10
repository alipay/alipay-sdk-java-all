package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 13:37:57
 */
public class AlipayTradeCustomerModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7287571287664649716L;

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
