package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-14 17:12:21
 */
public class ZhimaCreditPayafteruseCreditagreementTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466185323824434361L;

	/** 
	 * 芝麻开通协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 当operation_type==AGREEMENT_TRANSFER时，并且是迁移到小程序商家版时有值，其他情况下不返回
	 */
	@ApiField("deduct_agreement_no")
	private String deductAgreementNo;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setDeductAgreementNo(String deductAgreementNo) {
		this.deductAgreementNo = deductAgreementNo;
	}
	public String getDeductAgreementNo( ) {
		return this.deductAgreementNo;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

}
