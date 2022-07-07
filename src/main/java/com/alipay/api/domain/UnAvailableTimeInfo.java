package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 不可用时间段
 *
 * @author auto create
 * @since 1.0, 2018-09-03 14:58:58
 */
public class UnAvailableTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 4492486569659778675L;

	/**
	 * 起始时间
	 */
	@ApiField("from_date")
	private String fromDate;

	/**
	 * 结束时间
	 */
	@ApiField("to_date")
	private String toDate;

	public String getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return this.toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
