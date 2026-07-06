package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EncryptRequest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.authtoken.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-17 16:57:44
 */
public class AlipayCommerceMedicalInsuranceAuthtokenGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3351375146584172655L;

	/** 
	 * 加密出参
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
