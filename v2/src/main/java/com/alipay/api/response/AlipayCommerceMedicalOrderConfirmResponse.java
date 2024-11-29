package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 11:42:10
 */
public class AlipayCommerceMedicalOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352356598677276426L;

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
