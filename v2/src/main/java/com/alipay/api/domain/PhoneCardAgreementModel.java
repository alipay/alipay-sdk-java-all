package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡协议
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:15
 */
public class PhoneCardAgreementModel extends AlipayObject {

	private static final long serialVersionUID = 2885753936994867156L;

	/**
	 * html文本，用于前端页面展示
	 */
	@ApiField("agreement_content")
	private String agreementContent;

	/**
	 * 协议id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 协议标题
	 */
	@ApiField("agreement_title")
	private String agreementTitle;

	/**
	 * 协议类型
	 */
	@ApiField("agreement_type")
	private String agreementType;

	public String getAgreementContent() {
		return this.agreementContent;
	}
	public void setAgreementContent(String agreementContent) {
		this.agreementContent = agreementContent;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAgreementTitle() {
		return this.agreementTitle;
	}
	public void setAgreementTitle(String agreementTitle) {
		this.agreementTitle = agreementTitle;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

}
