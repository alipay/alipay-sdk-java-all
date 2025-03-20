package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:04:02
 */
public class AlipayCommerceCommonTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4295529198594352273L;

	/** 
	 * 任务领取实例id
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
