package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广留资schema
 *
 * @author auto create
 * @since 1.0, 2024-10-12 10:17:20
 */
public class PromotePageProperty extends AlipayObject {

	private static final long serialVersionUID = 7637231952931941676L;

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
	 * 自建站留资字段类型
	 */
	@ApiField("type")
	private String type;

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

}
