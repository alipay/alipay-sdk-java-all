package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询生成任务详情查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 17:57:52
 */
public class AlipayOpenMiniTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8441832515117342166L;

	/**
	 * 生图任务的任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
