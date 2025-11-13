package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 11:17:39
 */
public class AlipayMarketingBenefitaccountAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1189234178817795924L;

	/** 
	 * 权益账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/** 
	 * 外标打款卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}
	public String getBenefitAccountNo( ) {
		return this.benefitAccountNo;
	}

	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}
	public String getOutCardNo( ) {
		return this.outCardNo;
	}

}
