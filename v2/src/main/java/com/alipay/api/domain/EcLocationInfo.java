package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码地址信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:34:29
 */
public class EcLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 8218588695375595828L;

	/**
	 * 地址描述
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 地区编码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 纬度，单位：度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，单位：度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 位置ID
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

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

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
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

}
