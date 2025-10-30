package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子围栏信息
 *
 * @author auto create
 * @since 1.0, 2024-05-06 16:53:20
 */
public class FenceInfo extends AlipayObject {

	private static final long serialVersionUID = 7799899958327754964L;

	/**
	 * 电子围栏中心点纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 电子围栏中心点经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 电子围栏半径，单位km
	 */
	@ApiField("radius")
	private Long radius;

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

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

}
