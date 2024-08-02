package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据城市聚合的门店基本信息模型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:32:06
 */
public class CityShopModel extends AlipayObject {

	private static final long serialVersionUID = 3759943397135147338L;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区id
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 判断门店是否是简易门店
	 */
	@ApiField("pos_shop")
	private Boolean posShop;

	/**
	 * 省份id
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店id
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

	public String getDistrictId() {
		return this.districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Boolean getPosShop() {
		return this.posShop;
	}
	public void setPosShop(Boolean posShop) {
		this.posShop = posShop;
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
