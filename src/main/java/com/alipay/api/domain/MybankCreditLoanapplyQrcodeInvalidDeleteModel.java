package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效动态二维码
 *
 * @author auto create
 * @since 1.0, 2019-09-23 15:40:27
 */
public class MybankCreditLoanapplyQrcodeInvalidDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2168157132383665778L;

	/**
	 * 需要失效的二维码的加密 token 信息
	 */
	@ApiField("encrypt_token")
	private String encryptToken;

	public String getEncryptToken() {
		return this.encryptToken;
	}
	public void setEncryptToken(String encryptToken) {
		this.encryptToken = encryptToken;
	}

}
