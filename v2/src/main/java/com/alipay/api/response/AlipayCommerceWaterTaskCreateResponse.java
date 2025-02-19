package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:51:59
 */
public class AlipayCommerceWaterTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7255468914591379396L;

	/** 
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 任务创建结果
	 */
	@ApiField("task_result")
	private Boolean taskResult;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTaskResult(Boolean taskResult) {
		this.taskResult = taskResult;
	}
	public Boolean getTaskResult( ) {
		return this.taskResult;
	}

}
