package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 14:12:02
 */
public class AlipayCommerceEcCreditLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3228236793578983272L;

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
