package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.logistics.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 17:22:23
 */
public class AlipayCommerceMedicalOrderLogisticsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2683176124988887823L;

	/** 
	 * true/false
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
