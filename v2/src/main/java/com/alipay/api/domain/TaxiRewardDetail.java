package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-04 13:52:49
 */
public class TaxiRewardDetail extends AlipayObject {

	private static final long serialVersionUID = 2169313823584122685L;

	/**
	 * 发奖金额 单位：元
	 */
	@ApiField("reward_amount")
	private String rewardAmount;

	/**
	 * 发奖时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("reward_time")
	private String rewardTime;

	public String getRewardAmount() {
		return this.rewardAmount;
	}
	public void setRewardAmount(String rewardAmount) {
		this.rewardAmount = rewardAmount;
	}

	public String getRewardTime() {
		return this.rewardTime;
	}
	public void setRewardTime(String rewardTime) {
		this.rewardTime = rewardTime;
	}

}
