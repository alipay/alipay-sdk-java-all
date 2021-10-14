package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作失败任务明细
 *
 * @author auto create
 * @since 1.0, 2020-09-11 10:45:42
 */
public class FailTaskDetail extends AlipayObject {

	private static final long serialVersionUID = 1154671396274322484L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 失败任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
