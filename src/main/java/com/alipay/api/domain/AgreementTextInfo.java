package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议文本信息
 *
 * @author auto create
 * @since 1.0, 2021-07-13 20:44:19
 */
public class AgreementTextInfo extends AlipayObject {

	private static final long serialVersionUID = 1858199235711386633L;

	/**
	 * 协议文本名称
	 */
	@ApiField("agreement_text_title")
	private String agreementTextTitle;

	/**
	 * 协议文本对应的url
	 */
	@ApiField("agreement_text_url")
	private String agreementTextUrl;

	public String getAgreementTextTitle() {
		return this.agreementTextTitle;
	}
	public void setAgreementTextTitle(String agreementTextTitle) {
		this.agreementTextTitle = agreementTextTitle;
	}

	public String getAgreementTextUrl() {
		return this.agreementTextUrl;
	}
	public void setAgreementTextUrl(String agreementTextUrl) {
		this.agreementTextUrl = agreementTextUrl;
	}

}
