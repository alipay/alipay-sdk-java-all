package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ODPS的列信息，包含字段名称和字段类型
 *
 * @author auto create
 * @since 1.0, 2019-04-30 13:58:57
 */
public class AntdataassetsOdpsColumn extends AlipayObject {

	private static final long serialVersionUID = 8769195763963674593L;

	/**
	 * 表的字段名称
	 */
	@ApiField("column_name")
	private String columnName;

	/**
	 * 表的字段类型
	 */
	@ApiField("column_type")
	private String columnType;

	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return this.columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

}
