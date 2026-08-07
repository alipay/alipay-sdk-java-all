package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经纬度信息
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:17:51
 */
public class LbsVO extends AlipayObject {

	private static final long serialVersionUID = 2489133338735533682L;

	/**
	 * 纬度（单位：度，WGS84 坐标系，字符串形式）。
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度（单位：度，WGS84 坐标系，字符串形式）。
	 */
	@ApiField("lng")
	private String lng;

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

}
