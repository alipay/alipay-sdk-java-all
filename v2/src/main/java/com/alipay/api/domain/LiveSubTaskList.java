package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子任务列表对象
 *
 * @author auto create
 * @since 1.0, 2024-08-22 15:42:33
 */
public class LiveSubTaskList extends AlipayObject {

	private static final long serialVersionUID = 1811767287482571999L;

	/**
	 * 子任务状态，状态: COMPLETED（已完成）、UNCOMPLETED（未完成）、IN_PROGRESS（进行中）
	 */
	@ApiField("sub_task_status")
	private String subTaskStatus;

	/**
	 * VALID_LIVE_QUANTITY（30分钟及以上的挂品直播），REAL_RECEIPT_GMV（月度直播带货结算GMV）
	 */
	@ApiField("sub_task_type")
	private String subTaskType;

	public String getSubTaskStatus() {
		return this.subTaskStatus;
	}
	public void setSubTaskStatus(String subTaskStatus) {
		this.subTaskStatus = subTaskStatus;
	}

	public String getSubTaskType() {
		return this.subTaskType;
	}
	public void setSubTaskType(String subTaskType) {
		this.subTaskType = subTaskType;
	}

}
