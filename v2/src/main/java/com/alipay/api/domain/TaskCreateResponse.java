package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-14 11:42:49
 */
public class TaskCreateResponse extends AlipayObject {

	private static final long serialVersionUID = 1877384958373762478L;

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
