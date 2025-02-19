package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CollaborateTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-18 11:27:25
 */
public class AlipayOfflineProviderCollaborateTaskConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5693215382571667335L;

	/** 
	 * 详细的任务信息
	 */
	@ApiField("task")
	private CollaborateTask task;

	/** 
	 * 任务号
	 */
	@ApiField("task_no")
	private String taskNo;

	public void setTask(CollaborateTask task) {
		this.task = task;
	}
	public CollaborateTask getTask( ) {
		return this.task;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskNo( ) {
		return this.taskNo;
	}

}
