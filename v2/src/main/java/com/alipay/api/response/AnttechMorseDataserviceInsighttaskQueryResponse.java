package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.dataservice.insighttask.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-03 11:02:03
 */
public class AnttechMorseDataserviceInsighttaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5558878934483376155L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 任务状态:0-新建(等待中),1-已完成,2-进行中,3-运行 失败
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
