package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-06 14:36:58
 */
public class AlipayCommerceGasOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8521667317621733656L;

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
