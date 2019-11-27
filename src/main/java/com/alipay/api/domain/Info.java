package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监控指标的各项属性
 *
 * @author auto create
 * @since 1.0, 2017-12-21 21:40:35
 */
public class Info extends AlipayObject {

	private static final long serialVersionUID = 8688424133978592125L;

	/**
	 * 监控指标属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 监控指标属性值
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
