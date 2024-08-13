package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询加固任务进度
 *
 * @author auto create
 * @since 1.0, 2023-08-10 13:59:51
 */
public class AlipaySecurityProdAshieldHardeningtaskprocessGetModel extends AlipayObject {

	private static final long serialVersionUID = 7136438313379216181L;

	/**
	 * 加固任务id
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
