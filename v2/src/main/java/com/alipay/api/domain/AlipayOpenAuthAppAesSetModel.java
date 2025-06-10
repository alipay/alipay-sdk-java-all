package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥设置
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:16:35
 */
public class AlipayOpenAuthAppAesSetModel extends AlipayObject {

	private static final long serialVersionUID = 5524882413118844679L;

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
