package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.user.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 09:22:36
 */
public class AlipayCommerceMedicalInsuranceUserSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1357792485234678952L;

	/** 
	 * 结果
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
