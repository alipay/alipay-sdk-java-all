package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.logistics.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 11:12:10
 */
public class AlipayCommerceMedicalOrderLogisticsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6861586986595929883L;

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
