package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥设置
 *
 * @author auto create
 * @since 1.0, 2020-01-08 11:54:26
 */
public class AlipayOpenAuthAppAesSetModel extends AlipayObject {

	private static final long serialVersionUID = 6568595123615378358L;

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
