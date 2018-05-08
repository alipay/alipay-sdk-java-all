package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.insturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-10 17:41:27
 */
public class MybankCreditLoanapplyInsturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4364245624475182578L;

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
