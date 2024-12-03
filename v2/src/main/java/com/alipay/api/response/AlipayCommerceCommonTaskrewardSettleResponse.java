package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taskreward.settle response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:04:03
 */
public class AlipayCommerceCommonTaskrewardSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 8529576126114218418L;

	/** 
	 * 已发放的激励金额，单位元
	 */
	@ApiField("published_amount")
	private String publishedAmount;

	/** 
	 * 激励金额，单位元
	 */
	@ApiField("reward_amount")
	private String rewardAmount;

	/** 
	 * 激励类型
	 */
	@ApiField("reward_type")
	private String rewardType;

	/** 
	 * 淘客领取任务在支付宝的任务id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/** 
	 * 最大激励金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setPublishedAmount(String publishedAmount) {
		this.publishedAmount = publishedAmount;
	}
	public String getPublishedAmount( ) {
		return this.publishedAmount;
	}

	public void setRewardAmount(String rewardAmount) {
		this.rewardAmount = rewardAmount;
	}
	public String getRewardAmount( ) {
		return this.rewardAmount;
	}

	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}
	public String getRewardType( ) {
		return this.rewardType;
	}

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getTaskInstanceId( ) {
		return this.taskInstanceId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
