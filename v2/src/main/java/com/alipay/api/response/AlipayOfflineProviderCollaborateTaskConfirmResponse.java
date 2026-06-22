package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CollaborateTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-12 16:27:43
 */
public class AlipayOfflineProviderCollaborateTaskConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3336487113227827444L;

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
