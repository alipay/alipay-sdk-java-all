package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claim.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-19 17:52:11
 */
public class AlipayCommerceMedicalInsuranceClaimModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6624962334887813865L;

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
