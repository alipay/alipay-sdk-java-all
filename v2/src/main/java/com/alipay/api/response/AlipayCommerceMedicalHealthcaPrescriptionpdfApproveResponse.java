package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.prescriptionpdf.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 20:12:35
 */
public class AlipayCommerceMedicalHealthcaPrescriptionpdfApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8633961239716728157L;

	/** 
	 * 签署合同ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

}
