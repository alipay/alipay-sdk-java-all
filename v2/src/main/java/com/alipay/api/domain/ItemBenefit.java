package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品权益
 *
 * @author auto create
 * @since 1.0, 2024-07-11 13:25:28
 */
public class ItemBenefit extends AlipayObject {

	private static final long serialVersionUID = 6333518748861856315L;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 一级子属性
	 */
	@ApiField("key")
	private String key;

	/**
	 * 二级子属性
	 */
	@ApiField("sub_key")
	private String subKey;

	/**
	 * 权益名称
	 */
	@ApiField("value")
	private String value;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getSubKey() {
		return this.subKey;
	}
	public void setSubKey(String subKey) {
		this.subKey = subKey;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
