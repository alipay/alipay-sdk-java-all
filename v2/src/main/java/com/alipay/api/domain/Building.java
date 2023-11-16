package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建筑信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:49
 */
public class Building extends AlipayObject {

	private static final long serialVersionUID = 2811695883393587262L;

	/**
	 * 建筑名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * POI类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
