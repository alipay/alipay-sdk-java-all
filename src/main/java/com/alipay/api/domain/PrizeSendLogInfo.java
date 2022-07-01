package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务id和对应的流水详情
 *
 * @author auto create
 * @since 1.0, 2022-06-24 14:35:17
 */
public class PrizeSendLogInfo extends AlipayObject {

	private static final long serialVersionUID = 6534236798271462722L;

	/**
	 * 任务对应的发奖流水详情
	 */
	@ApiListField("prize_send_log_detail_list")
	@ApiField("prize_send_log_detail_info")
	private List<PrizeSendLogDetailInfo> prizeSendLogDetailList;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public List<PrizeSendLogDetailInfo> getPrizeSendLogDetailList() {
		return this.prizeSendLogDetailList;
	}
	public void setPrizeSendLogDetailList(List<PrizeSendLogDetailInfo> prizeSendLogDetailList) {
		this.prizeSendLogDetailList = prizeSendLogDetailList;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
