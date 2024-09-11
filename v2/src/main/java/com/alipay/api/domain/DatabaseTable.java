package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 库表信息
 *
 * @author auto create
 * @since 1.0, 2024-08-28 16:16:38
 */
public class DatabaseTable extends AlipayObject {

	private static final long serialVersionUID = 3869879694227943752L;

	/**
	 * 数据库名称
	 */
	@ApiField("database_name")
	private String databaseName;

	/**
	 * 表名称列表
	 */
	@ApiListField("table_name_list")
	@ApiField("string")
	private List<String> tableNameList;

	public String getDatabaseName() {
		return this.databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public List<String> getTableNameList() {
		return this.tableNameList;
	}
	public void setTableNameList(List<String> tableNameList) {
		this.tableNameList = tableNameList;
	}

}
