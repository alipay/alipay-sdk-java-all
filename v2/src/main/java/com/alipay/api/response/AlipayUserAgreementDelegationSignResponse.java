package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.delegation.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:07
 */
public class AlipayUserAgreementDelegationSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4279362637552655848L;

	/** 
	 * AI支付协议号
	 */
	@ApiField("ai_pay_agreement_no")
	private String aiPayAgreementNo;

	/** 
	 * 委托号，用于发起支付
	 */
	@ApiField("delegation_id")
	private String delegationId;

	/** 
	 * 外部委托号
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	/** 
	 * 免密协议号
	 */
	@ApiField("no_pwd_agreement_no")
	private String noPwdAgreementNo;

	public void setAiPayAgreementNo(String aiPayAgreementNo) {
		this.aiPayAgreementNo = aiPayAgreementNo;
	}
	public String getAiPayAgreementNo( ) {
		return this.aiPayAgreementNo;
	}

	public void setDelegationId(String delegationId) {
		this.delegationId = delegationId;
	}
	public String getDelegationId( ) {
		return this.delegationId;
	}

	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}
	public String getExternalDelegationId( ) {
		return this.externalDelegationId;
	}

	public void setNoPwdAgreementNo(String noPwdAgreementNo) {
		this.noPwdAgreementNo = noPwdAgreementNo;
	}
	public String getNoPwdAgreementNo( ) {
		return this.noPwdAgreementNo;
	}

}
