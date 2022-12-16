package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.filetask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:21:38
 */
public class AlipayMerchantIndirectFiletaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3537632665348473134L;

	/** 
	 * 文件任务处理结果
	 */
	@ApiField("task_state")
	private String taskState;

	/** 
	 * 文件任务状态描述
	 */
	@ApiField("task_state_desc")
	private String taskStateDesc;

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	public String getTaskState( ) {
		return this.taskState;
	}

	public void setTaskStateDesc(String taskStateDesc) {
		this.taskStateDesc = taskStateDesc;
	}
	public String getTaskStateDesc( ) {
		return this.taskStateDesc;
	}

}
