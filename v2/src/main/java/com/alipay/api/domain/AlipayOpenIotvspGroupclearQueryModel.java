package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员库清理任务查询
 *
 * @author auto create
 * @since 1.0, 2025-08-08 14:33:02
 */
public class AlipayOpenIotvspGroupclearQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6576151629111594732L;

	/**
	 * 清库任务id
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
