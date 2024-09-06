package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 14:32:08
 */
public class AlipayCommerceMedicalOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5772841269881835671L;

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
