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
public class MerchantCardTemplatePriceItem extends AlipayObject {

	private static final long serialVersionUID = 3771557163842772959L;

	/**
	 * 市级区域价对应的行政区划码。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * null
	 */
	@ApiListField("date_price_list")
	@ApiField("merchant_card_template_price_date_rule_v_o")
	private List<MerchantCardTemplatePriceDateRuleVO> datePriceList;

	/**
	 * 区级区域价对应的行政区划码。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 基础原价，单位为分。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 动态价格模式：2为普通日历价，3为区域价，4为门店价。
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 省级区域价对应的行政区划码。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 区域价的行政区划层级。
	 */
	@ApiField("region_level")
	private String regionLevel;

	/**
	 * 基础售价，单位为分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 门店价对应的门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * null
	 */
	@ApiListField("week_price_list")
	@ApiField("merchant_card_template_price_week_rule_v_o")
	private List<MerchantCardTemplatePriceWeekRuleVO> weekPriceList;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<MerchantCardTemplatePriceDateRuleVO> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<MerchantCardTemplatePriceDateRuleVO> datePriceList) {
		this.datePriceList = datePriceList;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPriceMode() {
		return this.priceMode;
	}
	public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRegionLevel() {
		return this.regionLevel;
	}
	public void setRegionLevel(String regionLevel) {
		this.regionLevel = regionLevel;
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

	public List<MerchantCardTemplatePriceWeekRuleVO> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<MerchantCardTemplatePriceWeekRuleVO> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
