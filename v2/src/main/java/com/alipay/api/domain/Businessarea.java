package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:32:10
 */
public class Businessarea extends AlipayObject {

	private static final long serialVersionUID = 1731732199638538681L;

	/**
	 * 商圈所在区域的adcode
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商圈中心点经纬度
	 */
	@ApiField("location")
	private String location;

	/**
	 * 商圈名称
	 */
	@ApiField("name")
	private String name;

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
