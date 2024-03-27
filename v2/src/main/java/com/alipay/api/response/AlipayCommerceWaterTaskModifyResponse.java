package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 09:52:18
 */
public class AlipayCommerceWaterTaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4237426864164819554L;

	/** 
	 * 任务更新结果
	 */
	@ApiField("task_result")
	private Boolean taskResult;

	public void setTaskResult(Boolean taskResult) {
		this.taskResult = taskResult;
	}
	public Boolean getTaskResult( ) {
		return this.taskResult;
	}

}
