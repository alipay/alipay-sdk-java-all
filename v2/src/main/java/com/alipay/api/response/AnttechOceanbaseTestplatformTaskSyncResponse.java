package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.testplatform.task.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:58:07
 */
public class AnttechOceanbaseTestplatformTaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2476581272312188436L;

	/** 
	 * 任务id
	 */
	@ApiField("task_id")
	private Long taskId;

	/** 
	 * 测试结果反馈
	 */
	@ApiField("task_info")
	private String taskInfo;

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

	public void setTaskInfo(String taskInfo) {
		this.taskInfo = taskInfo;
	}
	public String getTaskInfo( ) {
		return this.taskInfo;
	}

}
