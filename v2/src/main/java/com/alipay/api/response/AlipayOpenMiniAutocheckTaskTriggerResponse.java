package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.task.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:21:44
 */
public class AlipayOpenMiniAutocheckTaskTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 4349598714159943346L;

	/** 
	 * 任务ID
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
