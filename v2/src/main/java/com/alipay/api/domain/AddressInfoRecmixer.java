package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置信息
 *
 * @author auto create
 * @since 1.0, 2023-10-31 17:17:43
 */
public class AddressInfoRecmixer extends AlipayObject {

	private static final long serialVersionUID = 5388454946536242287L;

	/**
	 * 城市code
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
