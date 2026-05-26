package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化门店信息
 *
 * @author auto create
 * @since 1.0, 2026-05-09 00:05:21
 */
public class DigitalPoi extends AlipayObject {

	private static final long serialVersionUID = 7454172882558128351L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * MCC一级Code
	 */
	@ApiField("category_one")
	private String categoryOne;

	/**
	 * MCC二级Code
	 */
	@ApiField("category_two")
	private String categoryTwo;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 门店维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 点位ID
	 */
	@ApiField("poi_mid")
	private String poiMid;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategoryOne() {
		return this.categoryOne;
	}
	public void setCategoryOne(String categoryOne) {
		this.categoryOne = categoryOne;
	}

	public String getCategoryTwo() {
		return this.categoryTwo;
	}
	public void setCategoryTwo(String categoryTwo) {
		this.categoryTwo = categoryTwo;
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

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPoiMid() {
		return this.poiMid;
	}
	public void setPoiMid(String poiMid) {
		this.poiMid = poiMid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
