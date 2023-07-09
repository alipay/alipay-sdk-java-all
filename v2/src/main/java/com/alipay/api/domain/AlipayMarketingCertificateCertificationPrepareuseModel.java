package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销准备
 *
 * @author auto create
 * @since 1.0, 2023-07-05 22:59:20
 */
public class AlipayMarketingCertificateCertificationPrepareuseModel extends AlipayObject {

	private static final long serialVersionUID = 3588838457993172384L;

	/**
	 * 用户出示的核销二维码下方的12位券码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 根据用户出示的核销二维码解析出来的标识
	 */
	@ApiField("encrypted_data")
	private String encryptedData;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEncryptedData() {
		return this.encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

}
