package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.refuse response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 15:43:20
 */
public class AlipayOfflineProviderCollaborateTaskRefuseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8692569472582568169L;

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
