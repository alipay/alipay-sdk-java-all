package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-25 15:57:01
 */
public class AlipayCommerceEcCreditLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8241895752732637127L;

	/** 
	 * 银行授信借款操作页面地址
	 */
	@ApiField("apply_url")
	private String applyUrl;

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}
	public String getApplyUrl( ) {
		return this.applyUrl;
	}

}
