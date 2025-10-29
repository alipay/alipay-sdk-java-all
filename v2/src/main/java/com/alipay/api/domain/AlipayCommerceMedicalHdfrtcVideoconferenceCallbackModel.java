package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云rtc回调
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:10
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 8474186722274539742L;

	/**
	 * 回调消息具体内容
	 */
	@ApiField("event_data")
	private String eventData;

	/**
	 * 事件ID
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 通知时间戳，单位：毫秒
	 */
	@ApiField("notify_time")
	private Long notifyTime;

	public String getEventData() {
		return this.eventData;
	}
	public void setEventData(String eventData) {
		this.eventData = eventData;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Long getNotifyTime() {
		return this.notifyTime;
	}
	public void setNotifyTime(Long notifyTime) {
		this.notifyTime = notifyTime;
	}

}
