package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动奖品信息
 *
 * @author auto create
 * @since 1.0, 2025-10-11 16:07:13
 */
public class ActivityReward extends AlipayObject {

	private static final long serialVersionUID = 3644394215566567682L;

	/**
	 * 权益奖品配置信息
	 */
	@ApiField("reward_config")
	private ActivityRewardConfig rewardConfig;

	/**
	 * 券不可用原因，仅当 useStatus = disabled 才返回
	 */
	@ApiField("unavailable_status")
	private String unavailableStatus;

	/**
	 * 使用状态，仅当award_status== 2时才返回
	 */
	@ApiField("use_status")
	private String useStatus;

	public ActivityRewardConfig getRewardConfig() {
		return this.rewardConfig;
	}
	public void setRewardConfig(ActivityRewardConfig rewardConfig) {
		this.rewardConfig = rewardConfig;
	}

	public String getUnavailableStatus() {
		return this.unavailableStatus;
	}
	public void setUnavailableStatus(String unavailableStatus) {
		this.unavailableStatus = unavailableStatus;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

}
