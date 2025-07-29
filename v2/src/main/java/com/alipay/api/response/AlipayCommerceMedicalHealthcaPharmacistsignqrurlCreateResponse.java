package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.pharmacistsignqrurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-06 16:12:28
 */
public class AlipayCommerceMedicalHealthcaPharmacistsignqrurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6632479651449676723L;

	/** 
	 * 二维码链接
	 */
	@ApiField("qr_url")
	private String qrUrl;

	/** 
	 * 签署合同ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public void setQrUrl(String qrUrl) {
		this.qrUrl = qrUrl;
	}
	public String getQrUrl( ) {
		return this.qrUrl;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

}
