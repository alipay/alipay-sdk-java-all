package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务操作返回结果
 *
 * @author auto create
 * @since 1.0, 2023-09-15 10:00:19
 */
public class TaskOperateResult extends AlipayObject {

	private static final long serialVersionUID = 6727847738948872895L;

	/**
	 * 创建任务失败，异常信息为xx
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 是否需要告警，当 istrue为false且needWarning为true才会告警， 当istrue为false且needWarning为false则为系统正常校验，不需要告警，只需要将errorMessage展示出来 needWarning默认为true
	 */
	@ApiField("need_warning")
	private Boolean needWarning;

	/**
	 * 返回结果，成功/失败
	 */
	@ApiField("task_operate_result")
	private Boolean taskOperateResult;

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getNeedWarning() {
		return this.needWarning;
	}
	public void setNeedWarning(Boolean needWarning) {
		this.needWarning = needWarning;
	}

	public Boolean getTaskOperateResult() {
		return this.taskOperateResult;
	}
	public void setTaskOperateResult(Boolean taskOperateResult) {
		this.taskOperateResult = taskOperateResult;
	}

}
