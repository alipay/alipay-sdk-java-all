package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留资属性实例信息列表
 *
 * @author auto create
 * @since 1.0, 2024-10-12 10:17:16
 */
public class PromotePagePropertyInstance extends AlipayObject {

	private static final long serialVersionUID = 1119379961437352931L;

	/**
	 * 留资属性key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 留资属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 自建站留资字段的类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 留资属性实例值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

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
