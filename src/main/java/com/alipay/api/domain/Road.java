package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 道路信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:55
 */
public class Road extends AlipayObject {

	private static final long serialVersionUID = 3674843542868813523L;

	/**
	 * 输入点和此路的相对方位
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 道路到请求坐标的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 道路ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 道路的中心点
	 */
	@ApiField("location")
	private String location;

	/**
	 * 道路名称
	 */
	@ApiField("name")
	private String name;

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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
