package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监控共建自定义指标维度
 *
 * @author auto create
 * @since 1.0, 2019-02-15 20:05:22
 */
public class Dimension extends AlipayObject {

	private static final long serialVersionUID = 3617343994571996269L;

	/**
	 * 维度类型
	 */
	@ApiField("name")
	private String name;

	/**
	 * 维度值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
