package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.complete response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 22:17:25
 */
public class AlipayOfflineProviderCollaborateTaskCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6294478389372849788L;

	/** 
	 * 任务号
	 */
	@ApiField("task_no")
	private String taskNo;

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskNo( ) {
		return this.taskNo;
	}

}
