package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.complete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-30 15:57:21
 */
public class AlipayOfflineProviderCollaborateTaskCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3269614221578571797L;

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
