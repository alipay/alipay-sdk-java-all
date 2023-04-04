package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:56:39
 */
public class ZhimaCreditPayafteruseCreditagreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7861926459696173523L;

	/** 
	 * 开通/授权状态，VALID: 有效，INVALID: 无效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 开通时间，agreement_status为VALID有效。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/** 
	 * 芝麻开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	public Date getBizTime( ) {
		return this.bizTime;
	}

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
