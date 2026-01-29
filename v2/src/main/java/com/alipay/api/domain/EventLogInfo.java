package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:33:18
 */
public class EventLogInfo extends AlipayObject {

	private static final long serialVersionUID = 2628397227375595485L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 事件时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

}
