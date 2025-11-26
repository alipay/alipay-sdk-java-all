package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.token.invalid response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 14:22:40
 */
public class AlipayCommerceMedicalMemberTokenInvalidResponse extends AlipayResponse {

	private static final long serialVersionUID = 2122153466164146629L;

	/** 
	 * 来源
	 */
	@ApiField("source")
	private String source;

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

}
