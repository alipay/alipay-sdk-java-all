package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class HeaderParam extends AlipayObject {

	private static final long serialVersionUID = 8441875159912772181L;

	/**
	 * 参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参数类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 参数值
	 */
	@ApiField("value")
	private String value;

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

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
