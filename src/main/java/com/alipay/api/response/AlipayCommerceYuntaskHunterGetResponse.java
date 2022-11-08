package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskInstanceInfo;
import com.alipay.api.domain.TaskMarkerInfo;
import com.alipay.api.domain.TaskVoucherBasicInfo;
import com.alipay.api.domain.TaskPointRankInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.hunter.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 15:01:32
 */
public class AlipayCommerceYuntaskHunterGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7198321715935966957L;

	/** 
	 * 任务信息
	 */
	@ApiField("task_instance_info")
	private TaskInstanceInfo taskInstanceInfo;

	/** 
	 * 标的物信息
	 */
	@ApiListField("task_marker_info_list")
	@ApiField("task_marker_info")
	private List<TaskMarkerInfo> taskMarkerInfoList;

	/** 
	 * 任务券信息
	 */
	@ApiListField("task_voucher_list")
	@ApiField("task_voucher_basic_info")
	private List<TaskVoucherBasicInfo> taskVoucherList;

	/** 
	 * 排名信息
	 */
	@ApiListField("user_ranking_info_list")
	@ApiField("task_point_rank_info")
	private List<TaskPointRankInfo> userRankingInfoList;

	public void setTaskInstanceInfo(TaskInstanceInfo taskInstanceInfo) {
		this.taskInstanceInfo = taskInstanceInfo;
	}
	public TaskInstanceInfo getTaskInstanceInfo( ) {
		return this.taskInstanceInfo;
	}

	public void setTaskMarkerInfoList(List<TaskMarkerInfo> taskMarkerInfoList) {
		this.taskMarkerInfoList = taskMarkerInfoList;
	}
	public List<TaskMarkerInfo> getTaskMarkerInfoList( ) {
		return this.taskMarkerInfoList;
	}

	public void setTaskVoucherList(List<TaskVoucherBasicInfo> taskVoucherList) {
		this.taskVoucherList = taskVoucherList;
	}
	public List<TaskVoucherBasicInfo> getTaskVoucherList( ) {
		return this.taskVoucherList;
	}

	public void setUserRankingInfoList(List<TaskPointRankInfo> userRankingInfoList) {
		this.userRankingInfoList = userRankingInfoList;
	}
	public List<TaskPointRankInfo> getUserRankingInfoList( ) {
		return this.userRankingInfoList;
	}

}
