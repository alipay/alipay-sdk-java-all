package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 13:48:25
 */
public class ZhimaCreditPayafteruseCreditagreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1814423711198416388L;

	/** 
	 * 芝麻协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

}
