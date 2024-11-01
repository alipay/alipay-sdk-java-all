package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.healthcert.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-29 15:02:13
 */
public class AlipayEbppIndustryJobHealthcertApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2527236969169495945L;

	/** 
	 * 支付宝就业健康证认证页面URL
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
