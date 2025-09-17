package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群发消息周期消息定时配置
 *
 * @author auto create
 * @since 1.0, 2025-03-31 11:26:52
 */
public class GroupMsgScheduleConfigVO extends AlipayObject {

	private static final long serialVersionUID = 5318223956937894316L;

	/**
	 * 用于描述定时发送的具体时间,  格式化为 HH:mm:ss
	 */
	@ApiField("cron_time")
	private String cronTime;

	/**
	 * 用于描述周期消息定时发送的单位, 以周或者月为单位
	 */
	@ApiField("cron_unit")
	private String cronUnit;

	/**
	 * 用于描述周期消息发送的具体的日期
当cron_unit=week, cron_value= "1"时, 表示每周一发送
当cron_unit=week, cron_value= "1,2,3,4,5,6,7"时, 表示每周一到周日发送
当cron_unit=month, cron_value= "1"时, 表示每月1号发送
当cron_unit=month, cron_value= "1,2,3"时, 表示每月1号2号3号发送
	 */
	@ApiField("cron_value")
	private String cronValue;

	/**
	 * 用于描述群发消息周期发送的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于描述周期发送的开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCronTime() {
		return this.cronTime;
	}
	public void setCronTime(String cronTime) {
		this.cronTime = cronTime;
	}

	public String getCronUnit() {
		return this.cronUnit;
	}
	public void setCronUnit(String cronUnit) {
		this.cronUnit = cronUnit;
	}

	public String getCronValue() {
		return this.cronValue;
	}
	public void setCronValue(String cronValue) {
		this.cronValue = cronValue;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
