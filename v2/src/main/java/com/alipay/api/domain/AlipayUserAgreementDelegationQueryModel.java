package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人代买委托任务查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-16 15:38:28
 */
public class AlipayUserAgreementDelegationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8339885112721197694L;

	/**
	 * AI付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 代买委托id
	 */
	@ApiField("delegation_id")
	private String delegationId;

	/**
	 * AI付外部签约号
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 外部代买委托id
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDelegationId() {
		return this.delegationId;
	}
	public void setDelegationId(String delegationId) {
		this.delegationId = delegationId;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getExternalDelegationId() {
		return this.externalDelegationId;
	}
	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}

}
