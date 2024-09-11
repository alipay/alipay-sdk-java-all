package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.anttask.task.pause response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 22:11:43
 */
public class AlipayBossBaseAnttaskTaskPauseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8647696837164761219L;

	/** 
	 * 失败才会返回信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 是否需要告警，当 istrue为false且needWarning为true才会告警， 当istrue为false且needWarning为false则为系统正常校验，不需要告警，只需要将errorMessage展示出来 needWarning默认为true
	 */
	@ApiField("need_warning")
	private Boolean needWarning;

	/** 
	 * 暂时无使用
	 */
	@ApiField("task_error_code")
	private String taskErrorCode;

	/** 
	 * 任务操作结果
	 */
	@ApiField("task_operate_result")
	private Boolean taskOperateResult;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setNeedWarning(Boolean needWarning) {
		this.needWarning = needWarning;
	}
	public Boolean getNeedWarning( ) {
		return this.needWarning;
	}

	public void setTaskErrorCode(String taskErrorCode) {
		this.taskErrorCode = taskErrorCode;
	}
	public String getTaskErrorCode( ) {
		return this.taskErrorCode;
	}

	public void setTaskOperateResult(Boolean taskOperateResult) {
		this.taskOperateResult = taskOperateResult;
	}
	public Boolean getTaskOperateResult( ) {
		return this.taskOperateResult;
	}

}
