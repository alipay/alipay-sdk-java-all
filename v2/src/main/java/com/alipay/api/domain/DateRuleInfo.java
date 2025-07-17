package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日期规则
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:18:32
 */
public class DateRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4471156351213892293L;

	/**
	 * 日期范围
	 */
	@ApiField("date_range_info")
	private DateRangeInfo dateRangeInfo;

	/**
	 * 时间段
	 */
	@ApiField("time_range_info")
	private TimeRangeInfo timeRangeInfo;

	public DateRangeInfo getDateRangeInfo() {
		return this.dateRangeInfo;
	}
	public void setDateRangeInfo(DateRangeInfo dateRangeInfo) {
		this.dateRangeInfo = dateRangeInfo;
	}

	public TimeRangeInfo getTimeRangeInfo() {
		return this.timeRangeInfo;
	}
	public void setTimeRangeInfo(TimeRangeInfo timeRangeInfo) {
		this.timeRangeInfo = timeRangeInfo;
	}

}
