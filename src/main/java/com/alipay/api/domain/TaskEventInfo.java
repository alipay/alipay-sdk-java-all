package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务事件信息
 *
 * @author auto create
 * @since 1.0, 2022-06-13 17:38:21
 */
public class TaskEventInfo extends AlipayObject {

	private static final long serialVersionUID = 7897538564315565221L;

	/**
	 * 任务事件id，任务事件类型是TRADE_SOURCE时，为支付宝交易号
	 */
	@ApiField("task_event_id")
	private String taskEventId;

	/**
	 * 任务事件类型（TRADE_SOURCE-交易事件）
	 */
	@ApiField("task_event_type")
	private String taskEventType;

	public String getTaskEventId() {
		return this.taskEventId;
	}
	public void setTaskEventId(String taskEventId) {
		this.taskEventId = taskEventId;
	}

	public String getTaskEventType() {
		return this.taskEventType;
	}
	public void setTaskEventType(String taskEventType) {
		this.taskEventType = taskEventType;
	}

}
