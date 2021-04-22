package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 返回给isv结果，成员为列表类型
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:12
 */
public class TableInfoResult extends AlipayObject {

	private static final long serialVersionUID = 6313694749867642195L;

	/**
	 * 返回TableListResult集合
	 */
	@ApiListField("table_info_list")
	@ApiField("table_list_result")
	private List<TableListResult> tableInfoList;

	public List<TableListResult> getTableInfoList() {
		return this.tableInfoList;
	}
	public void setTableInfoList(List<TableListResult> tableInfoList) {
		this.tableInfoList = tableInfoList;
	}

}
