package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskPrizeSendInfo;
import com.alipay.api.domain.TaskStatusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.task.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:52:03
 */
public class AlipayMarketingCampaignTaskStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8455591714258185686L;

	/** 
	 * 任务奖品流水集合
	 */
	@ApiListField("task_prize_send_info_list")
	@ApiField("task_prize_send_info")
	private List<TaskPrizeSendInfo> taskPrizeSendInfoList;

	/** 
	 * 任务状态信息集合
	 */
	@ApiListField("task_status_list")
	@ApiField("task_status_info")
	private List<TaskStatusInfo> taskStatusList;

	public void setTaskPrizeSendInfoList(List<TaskPrizeSendInfo> taskPrizeSendInfoList) {
		this.taskPrizeSendInfoList = taskPrizeSendInfoList;
	}
	public List<TaskPrizeSendInfo> getTaskPrizeSendInfoList( ) {
		return this.taskPrizeSendInfoList;
	}

	public void setTaskStatusList(List<TaskStatusInfo> taskStatusList) {
		this.taskStatusList = taskStatusList;
	}
	public List<TaskStatusInfo> getTaskStatusList( ) {
		return this.taskStatusList;
	}

}
