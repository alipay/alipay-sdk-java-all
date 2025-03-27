package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbacktask.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:29:18
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3522714863744391794L;

	/** 
	 * 回档任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
