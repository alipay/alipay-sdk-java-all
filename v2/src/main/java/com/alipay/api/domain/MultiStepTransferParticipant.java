package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多步转账主体信息
 *
 * @author auto create
 * @since 1.0, 2025-06-23 10:10:38
 */
public class MultiStepTransferParticipant extends AlipayObject {

	private static final long serialVersionUID = 4287395191461234369L;

	/**
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 参与方的唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 唯一标识类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 还款协议号
	 */
	@ApiField("rent_agreement_no")
	private String rentAgreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRentAgreementNo() {
		return this.rentAgreementNo;
	}
	public void setRentAgreementNo(String rentAgreementNo) {
		this.rentAgreementNo = rentAgreementNo;
	}

}
