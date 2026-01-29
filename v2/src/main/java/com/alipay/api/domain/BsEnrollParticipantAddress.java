package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名对象地理位置信息
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:12
 */
public class BsEnrollParticipantAddress extends AlipayObject {

	private static final long serialVersionUID = 8827151329663154456L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市行政区code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区行政区域code
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 正值默认北纬，小数点后6位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 正值默认东经，小数点后6位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省行政区code
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
