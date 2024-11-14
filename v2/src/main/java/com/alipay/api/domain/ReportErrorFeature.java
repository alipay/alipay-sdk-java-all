package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误上报的特征字段
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:37
 */
public class ReportErrorFeature extends AlipayObject {

	private static final long serialVersionUID = 2674893724625811357L;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
