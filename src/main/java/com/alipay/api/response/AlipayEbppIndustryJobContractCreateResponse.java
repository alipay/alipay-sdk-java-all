package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.contract.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-24 16:11:55
 */
public class AlipayEbppIndustryJobContractCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6199523482494448999L;

	/** 
	 * 电子合同用户签署地址，企业已自动签署
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
