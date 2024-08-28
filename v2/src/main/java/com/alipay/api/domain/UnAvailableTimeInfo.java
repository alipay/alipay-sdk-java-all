package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 不可用时间段
 *
 * @author auto create
 * @since 1.0, 2022-12-01 17:52:36
 */
public class UnAvailableTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 8422971441172988357L;

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
