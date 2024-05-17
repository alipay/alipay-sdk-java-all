package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-10 13:47:00
 */
public class AlipayCommerceGasOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5316594751854687113L;

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
