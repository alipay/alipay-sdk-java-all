package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广留资schema
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:41:14
 */
public class PromotePageProperty extends AlipayObject {

	private static final long serialVersionUID = 5138753364229171394L;

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

}
