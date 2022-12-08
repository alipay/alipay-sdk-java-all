package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份模型
 *
 * @author auto create
 * @since 1.0, 2021-07-27 11:06:37
 */
public class CertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 1399739622353734711L;

	/**
	 * 用户姓名
	 */
	@ApiField("certificate_name")
	private String certificateName;

	/**
	 * 身份证md5加密后字符串
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

}
