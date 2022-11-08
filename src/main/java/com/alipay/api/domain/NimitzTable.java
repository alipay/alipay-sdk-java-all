package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Nimitz 表模型
 *
 * @author auto create
 * @since 1.0, 2022-06-13 16:48:26
 */
public class NimitzTable extends AlipayObject {

	private static final long serialVersionUID = 3819986294165252845L;

	/**
	 * Nimitz 数据列
	 */
	@ApiListField("columns")
	@ApiField("nimitz_column")
	private List<NimitzColumn> columns;

	public List<NimitzColumn> getColumns() {
		return this.columns;
	}
	public void setColumns(List<NimitzColumn> columns) {
		this.columns = columns;
	}

}
