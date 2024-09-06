package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务执行历史
 *
 * @author auto create
 * @since 1.0, 2023-08-22 21:20:28
 */
public class MongoTaskHistory extends AlipayObject {

	private static final long serialVersionUID = 3593894332314563889L;

	/**
	 * 任务执行进度
	 */
	@ApiField("process")
	private String process;

	/**
	 * 任务开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 任务执行状态
 - SUBMIT
 - SUCCESS
 - FAILED
 - CANCEL
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务类型
 - IMPORT
 - EXPORT
	 */
	@ApiField("task_type")
	private String taskType;

	public String getProcess() {
		return this.process;
	}
	public void setProcess(String process) {
		this.process = process;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
