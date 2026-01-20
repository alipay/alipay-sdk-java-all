package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 节假日规则
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:18:32
 */
public class HolidayRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 5762669814144839959L;

	/**
	 * 时间段
	 */
	@ApiField("time_range_info")
	private TimeRangeInfo timeRangeInfo;

	public TimeRangeInfo getTimeRangeInfo() {
		return this.timeRangeInfo;
	}
	public void setTimeRangeInfo(TimeRangeInfo timeRangeInfo) {
		this.timeRangeInfo = timeRangeInfo;
	}

}
