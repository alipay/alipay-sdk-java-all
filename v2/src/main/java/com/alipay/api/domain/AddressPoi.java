package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置poi信息
 *
 * @author auto create
 * @since 1.0, 2023-11-17 14:55:29
 */
public class AddressPoi extends AlipayObject {

	private static final long serialVersionUID = 4632554943358434154L;

	/**
	 * 城市编码
	 */
	@ApiField("county_code")
	private String countyCode;

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
	 * 位置名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 位置id
	 */
	@ApiField("poi_id")
	private String poiId;

	public String getCountyCode() {
		return this.countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
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

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

}
