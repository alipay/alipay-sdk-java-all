package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-19 16:47:17
 */
public class AlipayOfflineProviderCollaborateTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7798695182844638731L;

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
