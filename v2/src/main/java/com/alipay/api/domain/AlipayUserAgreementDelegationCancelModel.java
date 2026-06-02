package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人代买委托任务取消接口
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:25:59
 */
public class AlipayUserAgreementDelegationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3521119966729214333L;

	/**
	 * AI付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 代买委托号
	 */
	@ApiField("delegation_id")
	private String delegationId;

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

}
