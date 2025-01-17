package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置卡自定义价格
 *
 * @author auto create
 * @since 1.0, 2024-12-05 18:45:18
 */
public class AlipayCommerceMerchantcardPricepropertyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8271523366734151671L;

	/**
	 * 周期卡计费信息，周期卡一客一价需要修改扣款方式可传该字段，非周期卡不传
	 */
	@ApiField("card_property_cycle")
	private CardPropertyCycle cardPropertyCycle;

	/**
	 * 卡ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 卡名称
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

	/**
	 * 卡类型，当不传card_template_id且传入card_type时，会取商户的默认卡ID
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 原价，单位：分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 每期价格
	 */
	@ApiListField("period_price_list")
	@ApiField("card_period_price")
	private List<CardPeriodPrice> periodPriceList;

	/**
	 * 售卖价格，单位：分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	public CardPropertyCycle getCardPropertyCycle() {
		return this.cardPropertyCycle;
	}
	public void setCardPropertyCycle(CardPropertyCycle cardPropertyCycle) {
		this.cardPropertyCycle = cardPropertyCycle;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardTemplateName() {
		return this.cardTemplateName;
	}
	public void setCardTemplateName(String cardTemplateName) {
		this.cardTemplateName = cardTemplateName;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<CardPeriodPrice> getPeriodPriceList() {
		return this.periodPriceList;
	}
	public void setPeriodPriceList(List<CardPeriodPrice> periodPriceList) {
		this.periodPriceList = periodPriceList;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

}
