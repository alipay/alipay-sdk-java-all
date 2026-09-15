package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class SalesForceCreateContractDTO extends AlipayObject {

	private static final long serialVersionUID = 1577857726675629747L;

	/**
	 * SF传入的幂等请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 业法合同任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
