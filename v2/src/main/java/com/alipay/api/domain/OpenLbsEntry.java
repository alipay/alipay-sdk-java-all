package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地理点位定向
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:19:19
 */
public class OpenLbsEntry extends AlipayObject {

	private static final long serialVersionUID = 1579319186425742848L;

	/**
	 * 地理点位地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * lbs地理点位的纬度，<a href="https://lbs.amap.com/tools/picker">高德坐标拾取</a>
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * lbs地理点位的经度，
<a href="https://lbs.amap.com/tools/picker">高德坐标拾取</a>
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 地理点位名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 投放半径，千米（KM）
	 */
	@ApiField("radius")
	private String radius;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

}
