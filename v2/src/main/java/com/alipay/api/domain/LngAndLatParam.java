package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过经纬度定位H3坐标的经纬度列表
 *
 * @author auto create
 * @since 1.0, 2024-09-13 22:01:17
 */
public class LngAndLatParam extends AlipayObject {

	private static final long serialVersionUID = 3691992448464967715L;

	/**
	 * 维度坐标
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度坐标
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 经纬度定位网格坐标解析度，填写范围[6-9]
	 */
	@ApiField("resolution")
	private String resolution;

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

	public String getResolution() {
		return this.resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
