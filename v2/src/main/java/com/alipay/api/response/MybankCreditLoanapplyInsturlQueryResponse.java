package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.insturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:21:04
 */
public class MybankCreditLoanapplyInsturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1727311576555666813L;

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
