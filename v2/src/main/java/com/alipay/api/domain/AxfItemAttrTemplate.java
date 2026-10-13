package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 11:37:58
 */
public class AxfItemAttrTemplate extends AlipayObject {

	private static final long serialVersionUID = 4262186559952133273L;

	/**
	 * 属性说明
	 */
	@ApiField("attr_desc")
	private String attrDesc;

	/**
	 * DESC，表明该商品属性为描述性字段；SPEC，表明该商品属性为规格字段，创建SKU商品时，需要在sku_list中sku_attrs内填写该属性相关的key和value
	 */
	@ApiField("attr_field_type")
	private String attrFieldType;

	/**
	 * 属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 商品属性
	 */
	@ApiField("attr_type")
	private String attrType;

	/**
	 * 所属类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * null
	 */
	@ApiListField("enum_values")
	@ApiField("axf_enum_value_item")
	private List<AxfEnumValueItem> enumValues;

	/**
	 * 是否可枚举
	 */
	@ApiField("enumerable")
	private Boolean enumerable;

	/**
	 * 是否可输入
	 */
	@ApiField("input")
	private Boolean input;

	/**
	 * 是否多选
	 */
	@ApiField("multiple")
	private Boolean multiple;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * null
	 */
	@ApiListField("unit")
	@ApiField("string")
	private List<String> unit;

	public String getAttrDesc() {
		return this.attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}

	public String getAttrFieldType() {
		return this.attrFieldType;
	}
	public void setAttrFieldType(String attrFieldType) {
		this.attrFieldType = attrFieldType;
	}

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrType() {
		return this.attrType;
	}
	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<AxfEnumValueItem> getEnumValues() {
		return this.enumValues;
	}
	public void setEnumValues(List<AxfEnumValueItem> enumValues) {
		this.enumValues = enumValues;
	}

	public Boolean getEnumerable() {
		return this.enumerable;
	}
	public void setEnumerable(Boolean enumerable) {
		this.enumerable = enumerable;
	}

	public Boolean getInput() {
		return this.input;
	}
	public void setInput(Boolean input) {
		this.input = input;
	}

	public Boolean getMultiple() {
		return this.multiple;
	}
	public void setMultiple(Boolean multiple) {
		this.multiple = multiple;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public List<String> getUnit() {
		return this.unit;
	}
	public void setUnit(List<String> unit) {
		this.unit = unit;
	}

}
