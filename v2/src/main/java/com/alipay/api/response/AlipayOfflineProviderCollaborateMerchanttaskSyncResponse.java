package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.merchanttask.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 10:37:40
 */
public class AlipayOfflineProviderCollaborateMerchanttaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3888978663149464684L;

	/** 
	 * 任务leadsId
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
