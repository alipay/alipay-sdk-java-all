package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码查询api
 *
 * @author auto create
 * @since 1.0, 2023-05-18 21:35:12
 */
public class MybankPaymentTradeQrcodePayresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7275627995456955917L;

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
