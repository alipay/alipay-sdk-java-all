package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大模型处理结果
 *
 * @author auto create
 * @since 1.0, 2023-09-05 20:40:45
 */
public class NLResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6634241725618824162L;

	/**
	 * 用户app token
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 处理结果值
	 */
	@ApiField("data")
	private String data;

	/**
	 * 任务使用次数
	 */
	@ApiField("service_time_cost")
	private String serviceTimeCost;

	/**
	 * 服务信息
	 */
	@ApiField("service_token_cost")
	private String serviceTokenCost;

	/**
	 * 约定的任务ID值
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务状态信息详细说明
	 */
	@ApiField("task_msg")
	private String taskMsg;

	/**
	 * 任务状态信息
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getServiceTimeCost() {
		return this.serviceTimeCost;
	}
	public void setServiceTimeCost(String serviceTimeCost) {
		this.serviceTimeCost = serviceTimeCost;
	}

	public String getServiceTokenCost() {
		return this.serviceTokenCost;
	}
	public void setServiceTokenCost(String serviceTokenCost) {
		this.serviceTokenCost = serviceTokenCost;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskMsg() {
		return this.taskMsg;
	}
	public void setTaskMsg(String taskMsg) {
		this.taskMsg = taskMsg;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
