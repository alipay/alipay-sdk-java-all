package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.insturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:46:49
 */
public class MybankCreditLoanapplyInsturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8235848178245428122L;

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
