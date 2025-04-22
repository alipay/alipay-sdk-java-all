package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员库清理任务查询
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:14:19
 */
public class AlipayOpenIotvspGroupclearQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6668411723353474698L;

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
