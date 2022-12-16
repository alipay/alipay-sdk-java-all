package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.hunter.receive response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:11:39
 */
public class AlipayCommerceYuntaskHunterReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3144415433721824352L;

	/** 
	 * 任务id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getTaskInstanceId( ) {
		return this.taskInstanceId;
	}

}
