package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.task.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:20
 */
public class AnttechBlockchainFinanceFsupvTaskCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1137519324695483798L;

	/** 
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/** 
	 * 任务失效
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}
	public String getFundSupvTaskId( ) {
		return this.fundSupvTaskId;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
