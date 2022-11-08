package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素材字段模型
 *
 * @author auto create
 * @since 1.0, 2022-07-08 20:14:06
 */
public class MaterialField extends AlipayObject {

	private static final long serialVersionUID = 3154665374499146419L;

	/**
	 * 素材字段名称，来源于素材规范定义的字段名称。注意一次素材提报中字段名称不能重复。
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 素材字段值，素材字段提报的实际值，支持多值，具体的要求请查看素材规范或对应的产品文档。
	 */
	@ApiListField("field_value")
	@ApiField("string")
	private List<String> fieldValue;

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<String> getFieldValue() {
		return this.fieldValue;
	}
	public void setFieldValue(List<String> fieldValue) {
		this.fieldValue = fieldValue;
	}

}
