package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询加固后的产物下载链接
 *
 * @author auto create
 * @since 1.0, 2023-08-10 13:59:54
 */
public class AlipaySecurityProdAshieldHardeninglogGetModel extends AlipayObject {

	private static final long serialVersionUID = 2173369139964653966L;

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
