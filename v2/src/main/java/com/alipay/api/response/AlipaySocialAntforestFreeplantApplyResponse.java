package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.freeplant.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 16:17:31
 */
public class AlipaySocialAntforestFreeplantApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4876462687117466735L;

	/** 
	 * 证书ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateId( ) {
		return this.certificateId;
	}

}
