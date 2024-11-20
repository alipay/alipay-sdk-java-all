package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.group.clear response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 15:17:04
 */
public class AlipayOpenIotvspGroupClearResponse extends AlipayResponse {

	private static final long serialVersionUID = 6331651456598139885L;

	/** 
	 * 支付宝侧生成的清库任务ID
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
