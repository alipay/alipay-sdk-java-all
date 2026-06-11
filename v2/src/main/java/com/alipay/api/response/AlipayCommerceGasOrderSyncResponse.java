package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 19:52:44
 */
public class AlipayCommerceGasOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3644913365353874597L;

	/** 
	 * 同步成功或失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
