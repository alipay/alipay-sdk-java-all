package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包含小区的位置信息，经纬度、省市区编码、详情地址、
 *
 * @author auto create
 * @since 1.0, 2024-10-30 11:48:42
 */
public class AreaAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 5865612822928445611L;

	/**
	 * 小区所在的详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 小区所在的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 小区所在区县对应的编码
	 */
	@ApiField("county_code")
	private String countyCode;

	/**
	 * 小区地址对应的高德PoiId
	 */
	@ApiField("gaode_poi_id")
	private String gaodePoiId;

	/**
	 * 小区地址的纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 小区地址的经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 小区所在的省份/直辖市对应的编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountyCode() {
		return this.countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getGaodePoiId() {
		return this.gaodePoiId;
	}
	public void setGaodePoiId(String gaodePoiId) {
		this.gaodePoiId = gaodePoiId;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
