package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模型组成为模板的映射名：name、以及对应的值：value
 *
 * @author auto create
 * @since 1.0, 2020-12-24 22:43:21
 */
public class UniversalKeyword extends AlipayObject {

	private static final long serialVersionUID = 1748278287647545211L;

	/**
	 * 沟通平台动态字段映射字段名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 沟通平台动态字段映射字段值
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
