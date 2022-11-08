package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发奖任务流水详情
 *
 * @author auto create
 * @since 1.0, 2022-07-05 10:20:12
 */
public class TaskPrizeSendInfo extends AlipayObject {

	private static final long serialVersionUID = 8121937118131615164L;

	/**
	 * 任务对应的发奖流水详情
	 */
	@ApiListField("prize_send_list")
	@ApiField("prize_send_info")
	private List<PrizeSendInfo> prizeSendList;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public List<PrizeSendInfo> getPrizeSendList() {
		return this.prizeSendList;
	}
	public void setPrizeSendList(List<PrizeSendInfo> prizeSendList) {
		this.prizeSendList = prizeSendList;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
