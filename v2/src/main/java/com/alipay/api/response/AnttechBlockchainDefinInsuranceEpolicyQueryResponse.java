package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.epolicy.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:40
 */
public class AnttechBlockchainDefinInsuranceEpolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7651348197995576686L;

	/** 
	 * 电子保单url地址
	 */
	@ApiField("policy_url")
	private String policyUrl;

	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
	public String getPolicyUrl( ) {
		return this.policyUrl;
	}

}
