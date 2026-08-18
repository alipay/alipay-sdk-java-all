package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-13 17:17:53
 */
public class YpzSdkTimeLagDTOOne extends AlipayObject {

	private static final long serialVersionUID = 1524161557246822675L;

	/**
	 * 事件标识
	 */
	@ApiField("event_identifier")
	private String eventIdentifier;

	/**
	 * 事件名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 事件发生时间
	 */
	@ApiField("event_occur_time")
	private String eventOccurTime;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 推送落库时间
	 */
	@ApiField("origin_gmt_create")
	private String originGmtCreate;

	/**
	 * 挂号流水号
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 提醒内容
	 */
	@ApiField("remind_content")
	private String remindContent;

	/**
	 * 时间差，单位是秒
	 */
	@ApiField("time_difference")
	private String timeDifference;

	public String getEventIdentifier() {
		return this.eventIdentifier;
	}
	public void setEventIdentifier(String eventIdentifier) {
		this.eventIdentifier = eventIdentifier;
	}

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOccurTime() {
		return this.eventOccurTime;
	}
	public void setEventOccurTime(String eventOccurTime) {
		this.eventOccurTime = eventOccurTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOriginGmtCreate() {
		return this.originGmtCreate;
	}
	public void setOriginGmtCreate(String originGmtCreate) {
		this.originGmtCreate = originGmtCreate;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRemindContent() {
		return this.remindContent;
	}
	public void setRemindContent(String remindContent) {
		this.remindContent = remindContent;
	}

	public String getTimeDifference() {
		return this.timeDifference;
	}
	public void setTimeDifference(String timeDifference) {
		this.timeDifference = timeDifference;
	}

}
