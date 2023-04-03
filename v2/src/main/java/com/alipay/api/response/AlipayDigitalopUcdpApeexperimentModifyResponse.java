package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeexperiment.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:04:08
 */
public class AlipayDigitalopUcdpApeexperimentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3569871819371983962L;

	/** 
	 * 操作任务Id
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
