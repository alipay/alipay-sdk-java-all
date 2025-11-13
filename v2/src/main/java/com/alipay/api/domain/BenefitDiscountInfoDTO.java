package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益优惠
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:14:30
 */
public class BenefitDiscountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8332585192185956266L;

	/**
	 * discount_type=voucher，券ID
discount_type=exchange，权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 如果是券，标识是否已膨胀
	 */
	@ApiField("dilate")
	private String dilate;

	/**
	 * 券金额中，商家侧优惠券的出资金额 单位：元
	 */
	@ApiField("merchant_discount")
	private String merchantDiscount;

	/**
	 * 券金额中，平台侧优惠券的出资金额 单位：元
	 */
	@ApiField("platform_discount")
	private String platformDiscount;

	/**
	 * 券核销规则Key，支付下单的时候透传订单优惠标记（promo_params）
	 */
	@ApiField("promo_rule_key")
	private String promoRuleKey;

	/**
	 * 券核销规则Value，支付下单的时候透传订单优惠标记（promo_params）
	 */
	@ApiField("promo_rule_value")
	private String promoRuleValue;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getDilate() {
		return this.dilate;
	}
	public void setDilate(String dilate) {
		this.dilate = dilate;
	}

	public String getMerchantDiscount() {
		return this.merchantDiscount;
	}
	public void setMerchantDiscount(String merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}

	public String getPlatformDiscount() {
		return this.platformDiscount;
	}
	public void setPlatformDiscount(String platformDiscount) {
		this.platformDiscount = platformDiscount;
	}

	public String getPromoRuleKey() {
		return this.promoRuleKey;
	}
	public void setPromoRuleKey(String promoRuleKey) {
		this.promoRuleKey = promoRuleKey;
	}

	public String getPromoRuleValue() {
		return this.promoRuleValue;
	}
	public void setPromoRuleValue(String promoRuleValue) {
		this.promoRuleValue = promoRuleValue;
	}

}
