package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品动态价格设置
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class AlipayCommerceMerchantcardTemplatepriceSetModel extends AlipayObject {

	private static final long serialVersionUID = 2693577158255671178L;

	/**
	 * 普通日历价配置，至少包含一条星期固定价或日期固定价。
	 */
	@ApiField("calendar_price")
	private MerchantCardTemplateCalendarPrice calendarPrice;

	/**
	 * 需要设置动态价格的商品模板ID。
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * null
	 */
	@ApiListField("region_price_list")
	@ApiField("merchant_card_template_region_price")
	private List<MerchantCardTemplateRegionPrice> regionPriceList;

	/**
	 * null
	 */
	@ApiListField("shop_price_list")
	@ApiField("merchant_card_template_shop_price")
	private List<MerchantCardTemplateShopPrice> shopPriceList;

	public MerchantCardTemplateCalendarPrice getCalendarPrice() {
		return this.calendarPrice;
	}
	public void setCalendarPrice(MerchantCardTemplateCalendarPrice calendarPrice) {
		this.calendarPrice = calendarPrice;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public List<MerchantCardTemplateRegionPrice> getRegionPriceList() {
		return this.regionPriceList;
	}
	public void setRegionPriceList(List<MerchantCardTemplateRegionPrice> regionPriceList) {
		this.regionPriceList = regionPriceList;
	}

	public List<MerchantCardTemplateShopPrice> getShopPriceList() {
		return this.shopPriceList;
	}
	public void setShopPriceList(List<MerchantCardTemplateShopPrice> shopPriceList) {
		this.shopPriceList = shopPriceList;
	}

}
