package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间范围
 *
 * @author auto create
 * @since 1.0, 2024-09-02 17:16:57
 */
public class TimeRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 8475779968219649537L;

	/**
	 * 开始时间  格式：HH:mm:ss
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 结束时间，可设置当日或次日结束，例如：22:00~次日07:00
	 */
	@ApiField("end_time_info")
	private EndTimeInfo endTimeInfo;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public EndTimeInfo getEndTimeInfo() {
		return this.endTimeInfo;
	}
	public void setEndTimeInfo(EndTimeInfo endTimeInfo) {
		this.endTimeInfo = endTimeInfo;
	}

}
