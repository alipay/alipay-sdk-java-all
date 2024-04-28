package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.certify.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-08 11:41:40
 */
public class AnttechBlockchainTwcCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8759763753454467273L;

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
