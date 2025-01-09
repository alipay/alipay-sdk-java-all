package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.certify.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:09
 */
public class AnttechBlockchainTwcCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4549574566394912891L;

	/** 
	 * T:验证通过；F:验证不通过
	 */
	@ApiField("passed")
	private String passed;

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
