package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claimreport.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 09:37:44
 */
public class AlipayCommerceMedicalInsuranceClaimreportModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3327267983684832876L;

	/** 
	 * 回传成功标识
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
