package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实体地址
 *
 * @author auto create
 * @since 1.0, 2024-09-06 17:16:00
 */
public class EntityAddress extends AlipayObject {

	private static final long serialVersionUID = 4422759768945357811L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 省市辖区的区域代码，参考GB/T 2260-
2007
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家，不传默认中国
	 */
	@ApiField("country")
	private String country;

	/**
	 * 国家编码，不传默认CN-中国
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 纬度，GCJ-02坐标系，保留数点后6位。。单位度(°)
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，GCJ-02坐标系，保留数点后6位。单位度(°)
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
