package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-15 13:49:22
 */
public class CategoryAttributeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7596859443758144516L;

	/**
	 * 属性code
	 */
	@ApiField("attr_code")
	private String attrCode;

	/**
	 * 属性KEY
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 属性类型
	 */
	@ApiField("attr_type")
	private String attrType;

	/**
	 * null
	 */
	@ApiListField("attr_value_list")
	@ApiField("attribute_value_info")
	private List<AttributeValueInfo> attrValueList;

	/**
	 * 属性值类型
	 */
	@ApiField("attr_value_type")
	private String attrValueType;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 提报商品时该属性是否支持自定义输入
	 */
	@ApiField("custom_input")
	private String customInput;

	/**
	 * 是否决策属性
	 */
	@ApiField("decided")
	private String decided;

	/**
	 * 提报商品时该属性是否支持多选
	 */
	@ApiField("multi_select")
	private String multiSelect;

	/**
	 * 提报商品时该属性是否必填
	 */
	@ApiField("required")
	private String required;

	/**
	 * 属性状态
	 */
	@ApiField("status")
	private String status;

	public String getAttrCode() {
		return this.attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
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

	public List<AttributeValueInfo> getAttrValueList() {
		return this.attrValueList;
	}
	public void setAttrValueList(List<AttributeValueInfo> attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getAttrValueType() {
		return this.attrValueType;
	}
	public void setAttrValueType(String attrValueType) {
		this.attrValueType = attrValueType;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCustomInput() {
		return this.customInput;
	}
	public void setCustomInput(String customInput) {
		this.customInput = customInput;
	}

	public String getDecided() {
		return this.decided;
	}
	public void setDecided(String decided) {
		this.decided = decided;
	}

	public String getMultiSelect() {
		return this.multiSelect;
	}
	public void setMultiSelect(String multiSelect) {
		this.multiSelect = multiSelect;
	}

	public String getRequired() {
		return this.required;
	}
	public void setRequired(String required) {
		this.required = required;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
