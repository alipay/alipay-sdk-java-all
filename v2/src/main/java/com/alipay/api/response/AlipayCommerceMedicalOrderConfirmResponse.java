package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 17:32:23
 */
public class AlipayCommerceMedicalOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7142726855911394929L;

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
