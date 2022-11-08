package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 道路交叉口
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:58
 */
public class Roadinter extends AlipayObject {

	private static final long serialVersionUID = 1439539175583513844L;

	/**
	 * 输入点相对路口的方位
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 交叉路口到请求坐标的距离，单位是米
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 第一条道路id
	 */
	@ApiField("first_id")
	private String firstId;

	/**
	 * 第一条道路名称
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 路口经纬度
	 */
	@ApiField("location")
	private String location;

	/**
	 * 第二条道路id
	 */
	@ApiField("second_id")
	private String secondId;

	/**
	 * 第二条道路名称
	 */
	@ApiField("second_name")
	private String secondName;

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

	public String getFirstId() {
		return this.firstId;
	}
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getSecondId() {
		return this.secondId;
	}
	public void setSecondId(String secondId) {
		this.secondId = secondId;
	}

	public String getSecondName() {
		return this.secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}
