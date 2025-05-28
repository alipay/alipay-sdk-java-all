package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.advancepay.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-05 11:47:24
 */
public class AlipayCommerceMedicalInsuranceAdvancepaySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4844163732381313291L;

	/** 
	 * 同步返回值
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
