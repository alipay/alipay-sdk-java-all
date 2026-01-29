package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AxfItemAttrTemplate extends AlipayObject {

	private static final long serialVersionUID = 3469226566182417629L;

	/**
	 * 属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

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

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
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

}
