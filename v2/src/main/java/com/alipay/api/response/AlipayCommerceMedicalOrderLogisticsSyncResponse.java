package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.logistics.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 17:32:22
 */
public class AlipayCommerceMedicalOrderLogisticsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3492675997368675563L;

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
