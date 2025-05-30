package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claim.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 18:02:28
 */
public class AlipayCommerceMedicalInsuranceClaimSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1736444834527157218L;

	/** 
	 * 支付宝理赔报案号
	 */
	@ApiField("ant_claim_no")
	private String antClaimNo;

	public void setAntClaimNo(String antClaimNo) {
		this.antClaimNo = antClaimNo;
	}
	public String getAntClaimNo( ) {
		return this.antClaimNo;
	}

}
