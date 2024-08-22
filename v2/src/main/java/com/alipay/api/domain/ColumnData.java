package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 代表一整行数据，值为 String 类型的列表，如：
["艾尼","男","24","86-15888889999","-"]
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:09:12
 */
public class ColumnData extends AlipayObject {

	private static final long serialVersionUID = 8738276127245844981L;

	/**
	 * 该类型表示一整行数据，为字符串列表。
columns 在修改数据时使用，表示该类型表示一整行数据，具体值为字符串列表，用户传入参数时自定义具体的内容，表示删除的数据时要和已有的数据保持一致。
	 */
	@ApiListField("columns")
	@ApiField("string")
	private List<String> columns;

	public List<String> getColumns() {
		return this.columns;
	}
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

}
