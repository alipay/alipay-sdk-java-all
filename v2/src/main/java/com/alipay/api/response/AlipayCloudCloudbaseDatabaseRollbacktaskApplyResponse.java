package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbacktask.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 16:56:58
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7471986665566748464L;

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
