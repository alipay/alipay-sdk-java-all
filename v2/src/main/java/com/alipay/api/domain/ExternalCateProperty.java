package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商对外-类目属性
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:44
 */
public class ExternalCateProperty extends AlipayObject {

	private static final long serialVersionUID = 3686591827178458498L;

	/**
	 * 条件必填说明
	 */
	@ApiField("condition_note")
	private String conditionNote;

	/**
	 * 配置信息
	 */
	@ApiField("config")
	private String config;

	/**
	 * 属性别名
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

	/**
	 * 属性名称
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 属性类型
	 */
	@ApiField("property_type")
	private String propertyType;

	/**
	 * 属性值列表
	 */
	@ApiListField("property_value_list")
	@ApiField("external_cate_property_value")
	private List<ExternalCatePropertyValue> propertyValueList;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private String required;

	/**
	 * 属性值类型
	 */
	@ApiField("value_type")
	private String valueType;

	public String getConditionNote() {
		return this.conditionNote;
	}
	public void setConditionNote(String conditionNote) {
		this.conditionNote = conditionNote;
	}

	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyType() {
		return this.propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public List<ExternalCatePropertyValue> getPropertyValueList() {
		return this.propertyValueList;
	}
	public void setPropertyValueList(List<ExternalCatePropertyValue> propertyValueList) {
		this.propertyValueList = propertyValueList;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequired() {
		return this.required;
	}
	public void setRequired(String required) {
		this.required = required;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
