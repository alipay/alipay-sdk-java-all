package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码失效
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:07:37
 */
public class MybankPaymentTradeQrcodeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8439648925748918416L;

	/**
	 * 加密token
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
