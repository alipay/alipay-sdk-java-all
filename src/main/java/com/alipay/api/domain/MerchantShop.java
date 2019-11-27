package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class MerchantShop extends AlipayObject {

	private static final long serialVersionUID = 4166932284188895525L;

	/**
	 * 门店市ID
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 门店城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 门店区ID
	 */
	@ApiField("county_id")
	private String countyId;

	/**
	 * 门店区名称
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 门店省ID
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 门店省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店状态
	 */
	@ApiField("shop_status")
	private String shopStatus;

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyId() {
		return this.countyId;
	}
	public void setCountyId(String countyId) {
		this.countyId = countyId;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getProvinceId() {
		return this.provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
