package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 厂商触发事件信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:47:45
 */
public class SmartphoneVendorsEventInfo extends AlipayObject {

	private static final long serialVersionUID = 5495892833598496538L;

	/**
	 * 事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 触发事件相关信息
	 */
	@ApiField("trigger_condition")
	private String triggerCondition;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getTriggerCondition() {
		return this.triggerCondition;
	}
	public void setTriggerCondition(String triggerCondition) {
		this.triggerCondition = triggerCondition;
	}

}
