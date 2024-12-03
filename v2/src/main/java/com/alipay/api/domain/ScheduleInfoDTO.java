package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管理调度信息
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:21
 */
public class ScheduleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4832541446246292625L;

	/**
	 * 时间段类型的调度的每天开始时间点
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 计划重复的方式信息
	 */
	@ApiField("calendar_info")
	private CalendarInfoDTO calendarInfo;

	/**
	 * 时间段类型的调度的每天结束时间点
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当需要设置相邻两次通知最小间隔时传入该字段，否则默认为60，最小值60，单位：分钟；当两次动账小于该时间时即使发生动账也不会发送通知
	 */
	@ApiField("interval")
	private String interval;

	/**
	 * 每天触发的时间点
	 */
	@ApiField("point_time")
	private String pointTime;

	/**
	 * 计划执行的时间，两种传参代表的含义如下：
INTERVAL_TIME为在一段时间内满足条件触发动作；
POINT_TIME为只在特定时间点触发动作
	 */
	@ApiField("schedule_type")
	private String scheduleType;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public CalendarInfoDTO getCalendarInfo() {
		return this.calendarInfo;
	}
	public void setCalendarInfo(CalendarInfoDTO calendarInfo) {
		this.calendarInfo = calendarInfo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInterval() {
		return this.interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getPointTime() {
		return this.pointTime;
	}
	public void setPointTime(String pointTime) {
		this.pointTime = pointTime;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

}
