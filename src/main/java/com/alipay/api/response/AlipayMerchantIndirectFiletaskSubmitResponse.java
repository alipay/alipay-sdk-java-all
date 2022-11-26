package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.filetask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-24 14:21:35
 */
public class AlipayMerchantIndirectFiletaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3496451114416946153L;

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
