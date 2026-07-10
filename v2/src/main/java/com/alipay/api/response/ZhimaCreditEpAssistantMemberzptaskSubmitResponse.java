package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.memberzptask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 10:42:50
 */
public class ZhimaCreditEpAssistantMemberzptaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4834733441135863331L;

	/** 
	 * 任务的跳转url
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/** 
	 * 针对提交的任务返回的唯一任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
