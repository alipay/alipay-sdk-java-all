package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.progov.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:26:59
 */
public class AlipayFincoreProgovQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8169692567735127867L;

	/** 
	 * 工单当前状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
