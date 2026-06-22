package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.edas.memory.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-05 15:02:43
 */
public class AlipayCommerceEdasMemorySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7195883172162464926L;

	/** 
	 * 任务ID,来自请求参数
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
