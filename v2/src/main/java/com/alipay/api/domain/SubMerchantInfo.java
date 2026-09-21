package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通场景传入的二级商户信息
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:23
 */
public class SubMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 6743377383759279664L;

	/**
	 * 二级商户进件的smid信息,取自支付宝开放平台进件中的二级商户对应信息
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
