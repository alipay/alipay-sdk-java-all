package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.task.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:01:44
 */
public class AlipayOpenMiniAutocheckTaskTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 6662429192629145865L;

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
