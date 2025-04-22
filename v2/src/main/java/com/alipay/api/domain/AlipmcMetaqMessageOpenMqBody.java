package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpms平台消息体内容
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class AlipmcMetaqMessageOpenMqBody extends AlipayObject {

	private static final long serialVersionUID = 3132333692521642849L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动实例id
	 */
	@ApiField("activity_instance_id")
	private String activityInstanceId;

	/**
	 * 消息id
	 */
	@ApiField("alipmc_message_id")
	private String alipmcMessageId;

	/**
	 * 是否历史
	 */
	@ApiField("before")
	private Boolean before;

	/**
	 * 类型别名
	 */
	@ApiField("class_alias")
	private String classAlias;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 异常信息
	 */
	@ApiField("exception_info")
	private String exceptionInfo;

	/**
	 * 通知消息类型
	 */
	@ApiField("notify_message_type")
	private String notifyMessageType;

	/**
	 * 消息topic
	 */
	@ApiField("notify_topic")
	private String notifyTopic;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 处理结果
	 */
	@ApiField("out_result")
	private String outResult;

	/**
	 * 流程code
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 流程id
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 流程实例id
	 */
	@ApiField("process_instance_id")
	private String processInstanceId;

	/**
	 * 恢复流程id
	 */
	@ApiField("resumption_id")
	private String resumptionId;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityInstanceId() {
		return this.activityInstanceId;
	}
	public void setActivityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
	}

	public String getAlipmcMessageId() {
		return this.alipmcMessageId;
	}
	public void setAlipmcMessageId(String alipmcMessageId) {
		this.alipmcMessageId = alipmcMessageId;
	}

	public Boolean getBefore() {
		return this.before;
	}
	public void setBefore(Boolean before) {
		this.before = before;
	}

	public String getClassAlias() {
		return this.classAlias;
	}
	public void setClassAlias(String classAlias) {
		this.classAlias = classAlias;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getExceptionInfo() {
		return this.exceptionInfo;
	}
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

	public String getNotifyMessageType() {
		return this.notifyMessageType;
	}
	public void setNotifyMessageType(String notifyMessageType) {
		this.notifyMessageType = notifyMessageType;
	}

	public String getNotifyTopic() {
		return this.notifyTopic;
	}
	public void setNotifyTopic(String notifyTopic) {
		this.notifyTopic = notifyTopic;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutResult() {
		return this.outResult;
	}
	public void setOutResult(String outResult) {
		this.outResult = outResult;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getResumptionId() {
		return this.resumptionId;
	}
	public void setResumptionId(String resumptionId) {
		this.resumptionId = resumptionId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
