package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据资产平台 Get Customer Tags 对云数据实验室提供的结果
 *
 * @author auto create
 * @since 1.0, 2015-10-14 16:38:58
 */
public class CustomerTag extends AlipayObject {

	private static final long serialVersionUID = 5796611438271695319L;

	/**
	 * 字段名称
	 */
	@ApiField("col_name")
	private String colName;

	/**
	 * column_type字段类型
	 */
	@ApiField("column_type")
	private String columnType;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名
	 */
	@ApiField("name")
	private String name;

	public String getColName() {
		return this.colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getColumnType() {
		return this.columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
