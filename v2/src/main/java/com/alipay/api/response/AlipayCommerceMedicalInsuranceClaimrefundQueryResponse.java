package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EncryptRequest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claimrefund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-24 15:37:55
 */
public class AlipayCommerceMedicalInsuranceClaimrefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1687194965723844114L;

	/** 
	 * 响应体
	 */
	@ApiField("encrypt_response")
	private EncryptRequest encryptResponse;

	public void setEncryptResponse(EncryptRequest encryptResponse) {
		this.encryptResponse = encryptResponse;
	}
	public EncryptRequest getEncryptResponse( ) {
		return this.encryptResponse;
	}

}
