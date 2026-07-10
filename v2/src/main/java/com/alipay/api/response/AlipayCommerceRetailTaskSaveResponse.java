package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.task.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 15:27:45
 */
public class AlipayCommerceRetailTaskSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5815645817925967142L;

	/** 
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 返参列表
	 */
	@ApiField("response_list")
	private String responseList;

	/** 
	 * 任务行动类型
	 */
	@ApiField("task_action")
	private String taskAction;

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
	}

	public void setResponseList(String responseList) {
		this.responseList = responseList;
	}
	public String getResponseList( ) {
		return this.responseList;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
	}
	public String getTaskAction( ) {
		return this.taskAction;
	}

}
