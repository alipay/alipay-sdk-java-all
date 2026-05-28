package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.healthcert.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-07 19:22:21
 */
public class AlipayEbppIndustryJobHealthcertApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4424269869174843269L;

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
