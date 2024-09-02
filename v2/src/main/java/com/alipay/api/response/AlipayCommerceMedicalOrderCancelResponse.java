package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 14:37:08
 */
public class AlipayCommerceMedicalOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1388643292884617197L;

	/** 
	 * 返回结果
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
