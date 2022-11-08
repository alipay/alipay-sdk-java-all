package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书基本信息
 *
 * @author auto create
 * @since 1.0, 2022-05-07 09:57:14
 */
public class CloudResumeCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 3332546177568137879L;

	/**
	 * 证书名称
	 */
	@ApiField("certificate_name")
	private String certificateName;

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

}
