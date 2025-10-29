package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥设置
 *
 * @author auto create
 * @since 1.0, 2025-08-05 16:44:29
 */
public class AlipayOpenAuthAppAesSetModel extends AlipayObject {

	private static final long serialVersionUID = 8135414518864322432L;

	/**
	 * 商家应用appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

}
