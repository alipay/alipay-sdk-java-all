package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息
 *
 * @author auto create
 * @since 1.0, 2025-07-21 14:39:58
 */
public class RecycleStdOrderMerchantInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2242195439626547443L;

	/**
	 * 商户图标
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 联系电话
	 */
	@ApiField("merchant_phone")
	private String merchantPhone;

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPhone() {
		return this.merchantPhone;
	}
	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}

}
