package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户意图识别指定的出诊时间
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class RegisterDate extends AlipayObject {

	private static final long serialVersionUID = 6553932683482961793L;

	/**
	 * 截止日期
格式：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 开始日期，
格式：yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
