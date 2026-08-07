package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class MerchantCardTemplateShopPrice extends AlipayObject {

	private static final long serialVersionUID = 1559341958163511519L;

	/**
	 * null
	 */
	@ApiListField("date_price_list")
	@ApiField("merchant_card_template_price_date_rule")
	private List<MerchantCardTemplatePriceDateRule> datePriceList;

	/**
	 * 门店基础原价，单位为分；如传入，不得小于售价。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 门店基础售价，单位为分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 当前商户名下的有效门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * null
	 */
	@ApiListField("week_price_list")
	@ApiField("merchant_card_template_price_week_rule")
	private List<MerchantCardTemplatePriceWeekRule> weekPriceList;

	public List<MerchantCardTemplatePriceDateRule> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<MerchantCardTemplatePriceDateRule> datePriceList) {
		this.datePriceList = datePriceList;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<MerchantCardTemplatePriceWeekRule> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<MerchantCardTemplatePriceWeekRule> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
