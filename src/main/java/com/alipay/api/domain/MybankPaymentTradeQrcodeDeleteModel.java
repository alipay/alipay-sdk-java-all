package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码失效
 *
 * @author auto create
 * @since 1.0, 2019-12-31 19:36:41
 */
public class MybankPaymentTradeQrcodeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8747948291656451868L;

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
