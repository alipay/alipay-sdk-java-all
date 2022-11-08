package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.task.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 10:11:47
 */
public class AlipayMarketingCampaignTaskSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6866233768135157717L;

	/** 
	 * 任务基本属性信息
	 */
	@ApiField("task_base_info")
	private TaskBaseInfo taskBaseInfo;

	/** 
	 * 任务唯一id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 任务完成标志
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
