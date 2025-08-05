package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 属性对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:18
 */
public class AttributeBean extends AlipayObject {

	private static final long serialVersionUID = 6413444434633362753L;

	/**
	 * 属性名
	 */
	@ApiField("attribute_name")
	private String attributeName;

	/**
	 * 属性值
	 */
	@ApiField("attribute_value")
	private String attributeValue;

	/**
	 * 属性值列表
	 */
	@ApiListField("attribute_value_list")
	@ApiField("string")
	private List<String> attributeValueList;

	public String getAttributeName() {
		return this.attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public List<String> getAttributeValueList() {
		return this.attributeValueList;
	}
	public void setAttributeValueList(List<String> attributeValueList) {
		this.attributeValueList = attributeValueList;
	}

}
