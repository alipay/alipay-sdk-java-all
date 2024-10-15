package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.incomplete response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 15:43:19
 */
public class AlipayOfflineProviderCollaborateTaskIncompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4187998449165997664L;

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
