package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.certify response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-08 11:51:37
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432814393865366776L;

	/** 
	 * 核验不一致原因
	 */
	@ApiField("mismatch_reason")
	private String mismatchReason;

	/** 
	 * 是否通过，通过为T，不通过为F
	 */
	@ApiField("passed")
	private String passed;

	public void setMismatchReason(String mismatchReason) {
		this.mismatchReason = mismatchReason;
	}
	public String getMismatchReason( ) {
		return this.mismatchReason;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
