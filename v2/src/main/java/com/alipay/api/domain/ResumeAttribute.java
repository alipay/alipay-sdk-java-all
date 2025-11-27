package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:45:57
 */
public class ResumeAttribute extends AlipayObject {

	private static final long serialVersionUID = 1174849363317722211L;

	/**
	 * 数据key
	 */
	@ApiField("attribute_key")
	private String attributeKey;

	/**
	 * 数据值
	 */
	@ApiField("attribute_value")
	private String attributeValue;

	public String getAttributeKey() {
		return this.attributeKey;
	}
	public void setAttributeKey(String attributeKey) {
		this.attributeKey = attributeKey;
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

}
