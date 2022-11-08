package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * POI信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:32:02
 */
public class POIinfo extends AlipayObject {

	private static final long serialVersionUID = 7373726636786346593L;

	/**
	 * poi地址信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * POI所在商圈名称
	 */
	@ApiField("businessarea")
	private String businessarea;

	/**
	 * 输入点相对POI的方位
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 该POI到请求坐标的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * POI的id
	 */
	@ApiField("id")
	private String id;

	/**
	 * POI中心点的坐标
	 */
	@ApiField("location")
	private String location;

	/**
	 * POI名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话号码
	 */
	@ApiField("tel")
	private String tel;

	/**
	 * POI的类型
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessarea() {
		return this.businessarea;
	}
	public void setBusinessarea(String businessarea) {
		this.businessarea = businessarea;
	}

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

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
