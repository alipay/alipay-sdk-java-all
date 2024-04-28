package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门牌信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:52
 */
public class Streetnumber extends AlipayObject {

	private static final long serialVersionUID = 6658524179328619668L;

	/**
	 * 街道方向
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 门牌地址到请求坐标的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 坐标点
	 */
	@ApiField("location")
	private String location;

	/**
	 * 门牌号
	 */
	@ApiField("number")
	private String number;

	/**
	 * 街道名称
	 */
	@ApiField("street")
	private String street;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}
