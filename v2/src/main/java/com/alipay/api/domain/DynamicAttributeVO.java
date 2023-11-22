package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 动态属性VO
 *
 * @author auto create
 * @since 1.0, 2023-04-28 13:56:08
 */
public class DynamicAttributeVO extends AlipayObject {

	private static final long serialVersionUID = 5631241244752422115L;

	/**
	 * 属性别名，英文名
	 */
	@ApiField("attr_alias")
	private String attrAlias;

	/**
	 * 属性值为JSONArray格式的字符串，不同value_type的组装格式不同
文本： 
是否：
离散：
数值：
	 */
	@ApiListField("attr_value")
	@ApiField("string")
	private List<String> attrValue;

	/**
	 * 属性值类型
	 */
	@ApiField("value_type")
	private String valueType;

	public String getAttrAlias() {
		return this.attrAlias;
	}
	public void setAttrAlias(String attrAlias) {
		this.attrAlias = attrAlias;
	}

	public List<String> getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(List<String> attrValue) {
		this.attrValue = attrValue;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
