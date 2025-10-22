package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.signqrurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-11 17:17:40
 */
public class AlipayCommerceMedicalHealthcaSignqrurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833571584339779811L;

	/** 
	 * 签署合同ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/** 
	 * 签约链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
