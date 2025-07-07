package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务工单更新模型
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:41:41
 */
public class ServiceTicketUpdateDTO extends AlipayObject {

	private static final long serialVersionUID = 3365298748565124134L;

	/**
	 * 事件时间 当前字段已废弃(该字段已经被废弃，不再需要)
	 */
	@ApiField("action_time")
	@Deprecated
	private String actionTime;

	/**
	 * 订单状态
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * 收单关联更新事件内容
	 */
	@ApiField("event_content")
	private String eventContent;

	/**
	 * 事件时间
	 */
	@ApiField("event_time")
	private String eventTime;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getEventContent() {
		return this.eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

}
