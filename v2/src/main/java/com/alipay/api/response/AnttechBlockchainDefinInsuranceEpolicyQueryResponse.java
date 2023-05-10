package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.epolicy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:26:05
 */
public class AnttechBlockchainDefinInsuranceEpolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7221526866188626237L;

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
