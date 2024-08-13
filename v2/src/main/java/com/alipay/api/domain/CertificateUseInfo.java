package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销详情
 *
 * @author auto create
 * @since 1.0, 2024-03-07 15:59:51
 */
public class CertificateUseInfo extends AlipayObject {

	private static final long serialVersionUID = 1258798647869694592L;

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

	/**
	 * 凭证核销次数。不传默认为1
	 */
	@ApiField("use_count")
	private Long useCount;

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

	public Long getUseCount() {
		return this.useCount;
	}
	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

}
