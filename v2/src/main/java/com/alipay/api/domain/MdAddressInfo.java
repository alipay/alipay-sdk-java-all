package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户地址信息
 *
 * @author auto create
 * @since 1.0, 2024-09-05 11:58:30
 */
public class MdAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 8535925459994238991L;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 国家名称
	 */
	@ApiField("country_name")
	private String countryName;

	/**
	 * 详细地址，从区开始描述，无需写省市区
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 地区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 纬度，最多保留6位小数
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，最多保留6位小数
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return this.countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
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

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
