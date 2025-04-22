package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌详情，包括名称、数量等
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:00:04
 */
public class InsightBrandItem extends AlipayObject {

	private static final long serialVersionUID = 1659177171814543771L;

	/**
	 * 品牌编码
	 */
	@ApiField("key")
	private String key;

	/**
	 * 品牌名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 品牌数量
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

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
