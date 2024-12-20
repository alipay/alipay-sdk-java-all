package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.dsb.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:07
 */
public class AnttechAiCvDsbIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3836461995717715464L;

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
