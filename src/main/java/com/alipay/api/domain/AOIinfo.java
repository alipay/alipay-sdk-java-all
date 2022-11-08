package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AOI信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:32:06
 */
public class AOIinfo extends AlipayObject {

	private static final long serialVersionUID = 5863331478743382743L;

	/**
	 * 所属AOI所在区域编码
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 所属AOI点面积，单位是平方米
	 */
	@ApiField("area")
	private String area;

	/**
	 * 输入经纬度是否在aoi面之中，取值为0时表示在AOI内，其他值表示距离AOI的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 所属AOI的id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 所属AOI的中心点坐标
	 */
	@ApiField("location")
	private String location;

	/**
	 * 所属AOI名称
	 */
	@ApiField("name")
	private String name;

	public String getAdcode() {
		return this.adcode;
	}
	public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
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
