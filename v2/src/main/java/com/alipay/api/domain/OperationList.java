package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缓存任务列表
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:16:16
 */
public class OperationList extends AlipayObject {

	private static final long serialVersionUID = 1449989424874544143L;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务执行进度
	 */
	@ApiField("task_progress")
	private String taskProgress;

	/**
	 * 任务起始时间
	 */
	@ApiField("task_start_time")
	private String taskStartTime;

	/**
	 * 任务执行状态:0:为成功，1:为执行中，2:为失败
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskProgress() {
		return this.taskProgress;
	}
	public void setTaskProgress(String taskProgress) {
		this.taskProgress = taskProgress;
	}

	public String getTaskStartTime() {
		return this.taskStartTime;
	}
	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime;
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
