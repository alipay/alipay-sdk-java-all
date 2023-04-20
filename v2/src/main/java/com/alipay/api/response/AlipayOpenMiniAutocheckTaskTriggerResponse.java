package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.task.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:02:01
 */
public class AlipayOpenMiniAutocheckTaskTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432677254343156726L;

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
