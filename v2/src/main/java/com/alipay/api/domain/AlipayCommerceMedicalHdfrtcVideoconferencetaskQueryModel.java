package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过录制任务ID查询视频会议信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:47:41
 */
public class AlipayCommerceMedicalHdfrtcVideoconferencetaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7474992299568432548L;

	/**
	 * 任务ID
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
