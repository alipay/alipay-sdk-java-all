package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目属性值相关信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 11:41:30
 */
public class AttributeValueInfo extends AlipayObject {

	private static final long serialVersionUID = 5527923712748647974L;

	/**
	 * 属性值别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 属性值名称
	 */
	@ApiField("value")
	private String value;

	/**
	 * 属性值ID
	 */
	@ApiField("value_id")
	private String valueId;

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getValueId() {
		return this.valueId;
	}
	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

}
