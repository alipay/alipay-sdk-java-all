package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日期范围
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:18:32
 */
public class DateRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 3693643234966631979L;

	/**
	 * 开始日期  格式：yyyy-MM-dd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束日期  格式：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
