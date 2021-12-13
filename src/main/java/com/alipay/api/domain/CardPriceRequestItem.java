package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待定价产品实例
 *
 * @author auto create
 * @since 1.0, 2021-06-09 16:17:19
 */
public class CardPriceRequestItem extends AlipayObject {

	private static final long serialVersionUID = 3114162783675462426L;

	/**
	 * 优惠卡原价，单位为分
	 */
	@ApiField("base_price_cent")
	private Long basePriceCent;

	/**
	 * 优惠卡类型，枚举值为 mcard(月卡),ycard(年卡)
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 进价(调用方建议价格)，单位为分
	 */
	@ApiField("default_promo_price_cent")
	private Long defaultPromoPriceCent;

	/**
	 * 优惠卡价格区间上限，单位为分
	 */
	@ApiField("high_price_cent")
	private Long highPriceCent;

	/**
	 * 当前请求的周期卡价格(用于不需要定价的情况),单位为分
	 */
	@ApiField("last_promo_price")
	private Long lastPromoPrice;

	/**
	 * 优惠卡价格区间下限，单位为分
	 */
	@ApiField("lower_price_cent")
	private Long lowerPriceCent;

	/**
	 * 是否定价，默认为true
	 */
	@ApiField("pricing")
	private Boolean pricing;

	/**
	 * 用户是否可购买，默认为true
	 */
	@ApiField("visible")
	private Boolean visible;

	public Long getBasePriceCent() {
		return this.basePriceCent;
	}
	public void setBasePriceCent(Long basePriceCent) {
		this.basePriceCent = basePriceCent;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getDefaultPromoPriceCent() {
		return this.defaultPromoPriceCent;
	}
	public void setDefaultPromoPriceCent(Long defaultPromoPriceCent) {
		this.defaultPromoPriceCent = defaultPromoPriceCent;
	}

	public Long getHighPriceCent() {
		return this.highPriceCent;
	}
	public void setHighPriceCent(Long highPriceCent) {
		this.highPriceCent = highPriceCent;
	}

	public Long getLastPromoPrice() {
		return this.lastPromoPrice;
	}
	public void setLastPromoPrice(Long lastPromoPrice) {
		this.lastPromoPrice = lastPromoPrice;
	}

	public Long getLowerPriceCent() {
		return this.lowerPriceCent;
	}
	public void setLowerPriceCent(Long lowerPriceCent) {
		this.lowerPriceCent = lowerPriceCent;
	}

	public Boolean getPricing() {
		return this.pricing;
	}
	public void setPricing(Boolean pricing) {
		this.pricing = pricing;
	}

	public Boolean getVisible() {
		return this.visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

}
