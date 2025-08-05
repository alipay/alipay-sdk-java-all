package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.dataservice.insighttask.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 14:30:47
 */
public class AnttechMorseDataserviceInsighttaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2789455478673649838L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 洞察任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
