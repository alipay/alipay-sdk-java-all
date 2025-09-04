package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收商信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:41:25
 */
public class RecycleMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 5212956624884777335L;

	/**
	 * 商户logo链接
	 */
	@ApiField("merchant_logo_url")
	private String merchantLogoUrl;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public String getMerchantLogoUrl() {
		return this.merchantLogoUrl;
	}
	public void setMerchantLogoUrl(String merchantLogoUrl) {
		this.merchantLogoUrl = merchantLogoUrl;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

}
