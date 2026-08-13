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
public class MerchantCardTemplateRegionPrice extends AlipayObject {

	private static final long serialVersionUID = 3345329793225491995L;

	/**
	 * 市级行政区划码，与省、区编码三选一。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * null
	 */
	@ApiListField("date_price_list")
	@ApiField("merchant_card_template_price_date_rule")
	private List<MerchantCardTemplatePriceDateRule> datePriceList;

	/**
	 * 区级行政区划码，与省、市编码三选一。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区域基础原价，单位为分；如传入，不得小于售价。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 省级行政区划码，与市、区编码三选一。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 区域基础售价，单位为分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * null
	 */
	@ApiListField("week_price_list")
	@ApiField("merchant_card_template_price_week_rule")
	private List<MerchantCardTemplatePriceWeekRule> weekPriceList;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<MerchantCardTemplatePriceDateRule> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<MerchantCardTemplatePriceDateRule> datePriceList) {
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public List<MerchantCardTemplatePriceWeekRule> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<MerchantCardTemplatePriceWeekRule> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
