package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskPrizeSendInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.task.prize.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:19:26
 */
public class AlipayMarketingCampaignTaskPrizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6716941199175549951L;

	/** 
	 * 发奖流水任务-详情关系列表
	 */
	@ApiListField("task_prize_send_info_list")
	@ApiField("task_prize_send_info")
	private List<TaskPrizeSendInfo> taskPrizeSendInfoList;

	public void setTaskPrizeSendInfoList(List<TaskPrizeSendInfo> taskPrizeSendInfoList) {
		this.taskPrizeSendInfoList = taskPrizeSendInfoList;
	}
	public List<TaskPrizeSendInfo> getTaskPrizeSendInfoList( ) {
		return this.taskPrizeSendInfoList;
	}

}
