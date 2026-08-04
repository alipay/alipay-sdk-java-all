package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品动态价格批量查询
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class AlipayCommerceMerchantcardTemplatepriceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8352144484542353775L;

	/**
	 * 需要查询动态价格的商品模板ID。
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 区域价查询条件；省、市、区编码最多传一个。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域价查询条件；省、市、区编码最多传一个。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 页码，不传默认1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，不传默认500，最大500。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 动态价格模式：2为普通日历价，3为区域价，4为门店价。
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 区域价查询条件；省、市、区编码最多传一个。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店价查询条件，仅price_mode=4时可传。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
