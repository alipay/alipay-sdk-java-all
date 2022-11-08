package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.task.signup response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 10:11:46
 */
public class AlipayMarketingCampaignTaskSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 2161136711371967833L;

	/** 
	 * 任务基本信息
	 */
	@ApiField("task_base_info")
	private TaskBaseInfo taskBaseInfo;

	/** 
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 是否报名成功
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setTaskBaseInfo(TaskBaseInfo taskBaseInfo) {
		this.taskBaseInfo = taskBaseInfo;
	}
	public TaskBaseInfo getTaskBaseInfo( ) {
		return this.taskBaseInfo;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
