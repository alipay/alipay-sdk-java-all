package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置经纬度信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:27:55
 */
public class CloudbusLocation extends AlipayObject {

	private static final long serialVersionUID = 3574336274797524166L;

	/**
	 * 维度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
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
