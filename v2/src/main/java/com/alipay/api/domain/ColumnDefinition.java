package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 列定义
 *
 * @author auto create
 * @since 1.0, 2025-08-22 10:35:07
 */
public class ColumnDefinition extends AlipayObject {

	private static final long serialVersionUID = 8543287823281977294L;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 默认值
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 列名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 列顺序
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 是否为主键
	 */
	@ApiField("primary_key")
	private Boolean primaryKey;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public Boolean getPrimaryKey() {
		return this.primaryKey;
	}
	public void setPrimaryKey(Boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

}
