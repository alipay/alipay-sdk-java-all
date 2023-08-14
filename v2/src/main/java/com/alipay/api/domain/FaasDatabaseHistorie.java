package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务执行历史
 *
 * @author auto create
 * @since 1.0, 2023-08-08 23:05:49
 */
public class FaasDatabaseHistorie extends AlipayObject {

	private static final long serialVersionUID = 6563771848215786555L;

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
	 * 执行命令的序号
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
