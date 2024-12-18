package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-16 13:57:15
 */
public class AlipayEbppIndustryJobPayslipInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4422696924986524979L;

	/** 
	 * 开通收款账号跳转地址
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
