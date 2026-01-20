package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claim.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-18 10:38:04
 */
public class AlipayCommerceMedicalInsuranceClaimModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1648186962429261188L;

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
