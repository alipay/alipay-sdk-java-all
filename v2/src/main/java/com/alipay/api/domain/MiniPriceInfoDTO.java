package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销记录对应凭证金额拆分后的价格信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniPriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2287366583966321273L;

	/**
	 * 分摊到凭证次序号维度的商家侧优惠，单位：元
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/**
	 * 分摊到凭证次序号维度的平台侧优惠，单位：元
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	public String getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

}
