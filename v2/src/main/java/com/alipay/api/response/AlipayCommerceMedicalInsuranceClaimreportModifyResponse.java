package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claimreport.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 10:52:43
 */
public class AlipayCommerceMedicalInsuranceClaimreportModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8782116689639918939L;

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
