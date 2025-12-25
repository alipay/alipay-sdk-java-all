package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位坐标
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:39:11
 */
public class RoboPoint extends AlipayObject {

	private static final long serialVersionUID = 8845861882465319732L;

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

}
