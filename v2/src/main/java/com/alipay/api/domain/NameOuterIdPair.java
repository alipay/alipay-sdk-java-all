package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据名称与外部的ID的Pair对，用于将规格、属性对应的外部ID返回
 *
 * @author auto create
 * @since 1.0, 2020-03-30 15:26:07
 */
public class NameOuterIdPair extends AlipayObject {

	private static final long serialVersionUID = 1629673367479354376L;

	/**
	 * 属性或者规格的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部ID
	 */
	@ApiField("outer_id")
	private String outerId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

}
