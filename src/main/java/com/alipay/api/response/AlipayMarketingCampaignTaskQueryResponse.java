package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskBaseInfo;
import com.alipay.api.domain.TaskFullInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 10:11:47
 */
public class AlipayMarketingCampaignTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1838491255164426218L;

	/** 
	 * 任务中心（方案）基本信息
	 */
	@ApiField("task_base_info")
	private TaskBaseInfo taskBaseInfo;

	/** 
	 * 任务中心唯一id
	 */
	@ApiField("task_cen_id")
	private String taskCenId;

	/** 
	 * 任务中心下每个任务详情
	 */
	@ApiListField("task_full_list")
	@ApiField("task_full_info")
	private List<TaskFullInfo> taskFullList;

	public void setTaskBaseInfo(TaskBaseInfo taskBaseInfo) {
		this.taskBaseInfo = taskBaseInfo;
	}
	public TaskBaseInfo getTaskBaseInfo( ) {
		return this.taskBaseInfo;
	}

	public void setTaskCenId(String taskCenId) {
		this.taskCenId = taskCenId;
	}
	public String getTaskCenId( ) {
		return this.taskCenId;
	}

	public void setTaskFullList(List<TaskFullInfo> taskFullList) {
		this.taskFullList = taskFullList;
	}
	public List<TaskFullInfo> getTaskFullList( ) {
		return this.taskFullList;
	}

}
