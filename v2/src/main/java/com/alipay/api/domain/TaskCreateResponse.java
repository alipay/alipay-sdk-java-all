package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:17:49
 */
public class TaskCreateResponse extends AlipayObject {

	private static final long serialVersionUID = 8691846918832311677L;

	/**
	 * 蚂蚁健康 Open ID
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
