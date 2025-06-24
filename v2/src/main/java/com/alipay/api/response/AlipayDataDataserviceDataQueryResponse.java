package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 17:42:26
 */
public class AlipayDataDataserviceDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2151138381843879173L;

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
