package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.signautoqrurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 19:57:42
 */
public class AlipayCommerceMedicalHealthcaSignautoqrurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5651995456584319134L;

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
