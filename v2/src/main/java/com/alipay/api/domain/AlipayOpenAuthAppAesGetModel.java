package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥查询
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:17:03
 */
public class AlipayOpenAuthAppAesGetModel extends AlipayObject {

	private static final long serialVersionUID = 7481483131295199575L;

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
