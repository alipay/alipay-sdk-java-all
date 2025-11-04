package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 表结构配置
 *
 * @author auto create
 * @since 1.0, 2025-08-25 10:42:36
 */
public class TableSchema extends AlipayObject {

	private static final long serialVersionUID = 1679451734684221371L;

	/**
	 * null
	 */
	@ApiListField("columns")
	@ApiField("column_definition")
	private List<ColumnDefinition> columns;

	/**
	 * 表注释
	 */
	@ApiField("description")
	private String description;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public List<ColumnDefinition> getColumns() {
		return this.columns;
	}
	public void setColumns(List<ColumnDefinition> columns) {
		this.columns = columns;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
