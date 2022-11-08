package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置点
 *
 * @author auto create
 * @since 1.0, 2022-10-14 16:49:30
 */
public class PositionPoint extends AlipayObject {

	private static final long serialVersionUID = 3175498362913285521L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 位置点维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 位置点经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 位置点订单数
	 */
	@ApiField("order_count")
	private String orderCount;

	/**
	 * 位置点半径
	 */
	@ApiField("radius")
	private String radius;

	/**
	 * 标签值
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 位置点出租车数
	 */
	@ApiField("taxi_count")
	private String taxiCount;

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

	public String getOrderCount() {
		return this.orderCount;
	}
	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTaxiCount() {
		return this.taxiCount;
	}
	public void setTaxiCount(String taxiCount) {
		this.taxiCount = taxiCount;
	}

}
