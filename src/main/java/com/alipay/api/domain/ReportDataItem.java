package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表数据信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ReportDataItem extends AlipayObject {

	private static final long serialVersionUID = 7172734285457861929L;

	/**
	 * 表示一行数据，每个对象是一列的数据
	 */
	@ApiField("row_data")
	private String rowData;

	public String getRowData() {
		return this.rowData;
	}
	public void setRowData(String rowData) {
		this.rowData = rowData;
	}

}
