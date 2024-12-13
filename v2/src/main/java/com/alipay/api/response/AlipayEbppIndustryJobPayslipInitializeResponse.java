package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-25 14:09:26
 */
public class AlipayEbppIndustryJobPayslipInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5549122827461461337L;

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
