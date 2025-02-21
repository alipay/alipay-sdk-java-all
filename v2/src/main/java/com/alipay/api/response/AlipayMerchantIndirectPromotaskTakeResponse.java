package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.take response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 15:55:07
 */
public class AlipayMerchantIndirectPromotaskTakeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2615838237657466443L;

	/** 
	 * 支付宝侧生产的商家任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 任务状态，枚举值： - START，任务开始 - CANCEL，任务取消 - FINISH，任务完成
	 */
	@ApiField("task_state")
	private String taskState;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	public String getTaskState( ) {
		return this.taskState;
	}

}
