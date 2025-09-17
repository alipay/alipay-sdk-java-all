package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发奖凭证
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:32
 */
public class InsCertificate extends AlipayObject {

	private static final long serialVersionUID = 8361523687811232932L;

	/**
	 * 发奖凭证ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 发奖凭证类型;GIFT_INSURANCE:赠险
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 发奖凭证值
	 */
	@ApiField("certificate_value")
	private String certificateValue;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateValue() {
		return this.certificateValue;
	}
	public void setCertificateValue(String certificateValue) {
		this.certificateValue = certificateValue;
	}

}
