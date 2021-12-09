package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.address.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:05
 */
public class AlipayCommerceIotDeviceAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4411939385121631391L;

	/** 
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/** 
	 * 国家信息
	 */
	@ApiField("country_name")
	private String countryName;

	/** 
	 * 县/区名称
	 */
	@ApiField("county_name")
	private String countyName;

	/** 
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/** 
	 * 街道名称
	 */
	@ApiField("town_name")
	private String townName;

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryName( ) {
		return this.countryName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getCountyName( ) {
		return this.countyName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName( ) {
		return this.provinceName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getTownName( ) {
		return this.townName;
	}

}
