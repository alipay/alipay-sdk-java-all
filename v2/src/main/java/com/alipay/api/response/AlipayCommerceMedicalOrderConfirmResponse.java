package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 14:22:34
 */
public class AlipayCommerceMedicalOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2487136626894386931L;

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
