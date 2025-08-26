package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 12:01:28
 */
public class AlipayMarketingBenefitaccountAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665518797181416968L;

	/** 
	 * 权益账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}
	public String getBenefitAccountNo( ) {
		return this.benefitAccountNo;
	}

}
