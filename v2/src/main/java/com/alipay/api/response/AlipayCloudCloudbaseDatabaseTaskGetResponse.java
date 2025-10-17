package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:30
 */
public class AlipayCloudCloudbaseDatabaseTaskGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7454614939383654359L;

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
	 * 任务类型
 - IMPORT
 - EXPORT
	 */
	@ApiField("task_type")
	private String taskType;

	public void setProcess(String process) {
		this.process = process;
	}
	public String getProcess( ) {
		return this.process;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType( ) {
		return this.taskType;
	}

}
