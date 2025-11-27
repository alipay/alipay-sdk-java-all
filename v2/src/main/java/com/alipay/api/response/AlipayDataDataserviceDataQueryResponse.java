package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-25 20:47:41
 */
public class AlipayDataDataserviceDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7744372917112672462L;

	/** 
	 * 11
	 */
	@ApiField("amount")
	private Long amount;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

}
