package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AgreementTemplate extends AlipayObject {

	private static final long serialVersionUID = 6262162653434574891L;

	/**
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/**
	 * 协议模版id
	 */
	@ApiField("agreement_template_id")
	private String agreementTemplateId;

	/**
	 * 协议链接
	 */
	@ApiField("agreement_url")
	private String agreementUrl;

	public String getAgreementName() {
		return this.agreementName;
	}
	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}

	public String getAgreementTemplateId() {
		return this.agreementTemplateId;
	}
	public void setAgreementTemplateId(String agreementTemplateId) {
		this.agreementTemplateId = agreementTemplateId;
	}

	public String getAgreementUrl() {
		return this.agreementUrl;
	}
	public void setAgreementUrl(String agreementUrl) {
		this.agreementUrl = agreementUrl;
	}

}
