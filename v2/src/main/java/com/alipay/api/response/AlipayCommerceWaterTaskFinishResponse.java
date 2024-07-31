package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.finish response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 09:52:36
 */
public class AlipayCommerceWaterTaskFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5212326711568132524L;

	/** 
	 * 结束任务结果
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
