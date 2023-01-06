package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.insturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-30 10:41:43
 */
public class MybankCreditLoanapplyInsturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2527899297651313681L;

	/** 
	 * 机构目标跳转链接地址
	 */
	@ApiField("target_url")
	private String targetUrl;

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getTargetUrl( ) {
		return this.targetUrl;
	}

}
