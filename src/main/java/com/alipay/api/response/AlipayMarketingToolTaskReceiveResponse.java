package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:57:24
 */
public class AlipayMarketingToolTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4438528742979525148L;

	/** 
	 * 阶段码。applet_signup任务报名。
	 */
	@ApiField("stage_code")
	private String stageCode;

	/** 
	 * 任务ID。
	 */
	@ApiField("task_id")
	private String taskId;

	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}
	public String getStageCode( ) {
		return this.stageCode;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
