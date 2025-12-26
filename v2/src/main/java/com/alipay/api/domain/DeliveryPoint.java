package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送范围坐标，包含经度和纬度
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:03:01
 */
public class DeliveryPoint extends AlipayObject {

	private static final long serialVersionUID = 4465699776757779818L;

	/**
	 * 纬度坐标
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度坐标
	 */
	@ApiField("longitude")
	private String longitude;

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

}
