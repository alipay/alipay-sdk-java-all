package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.dsb.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:59:23
 */
public class AnttechAiCvDsbIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8228289541831369397L;

	/** 
	 * 本次inference任务id，后续通过该id查询对应结果
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
