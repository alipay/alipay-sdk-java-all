package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销详情
 *
 * @author auto create
 * @since 1.0, 2023-05-30 23:34:10
 */
public class CertificateUseInfo extends AlipayObject {

	private static final long serialVersionUID = 1283667536521388536L;

	/**
	 * 三方码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 核销准备返回的支付宝平台加密券码
	 */
	@ApiField("encrypted_code")
	private String encryptedCode;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEncryptedCode() {
		return this.encryptedCode;
	}
	public void setEncryptedCode(String encryptedCode) {
		this.encryptedCode = encryptedCode;
	}

}
