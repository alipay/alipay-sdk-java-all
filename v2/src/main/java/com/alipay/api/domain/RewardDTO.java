package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公益林浇水奖励信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 11:36:49
 */
public class RewardDTO extends AlipayObject {

	private static final long serialVersionUID = 6468283515792896967L;

	/**
	 * 奖励详情展示信息
	 */
	@ApiField("reward_display_info")
	private String rewardDisplayInfo;

	/**
	 * 奖励编码，局部唯一，例如公益林详情接口下，每个公益林中的奖励code是唯一的
	 */
	@ApiField("reward_id")
	private String rewardId;

	public String getRewardDisplayInfo() {
		return this.rewardDisplayInfo;
	}
	public void setRewardDisplayInfo(String rewardDisplayInfo) {
		this.rewardDisplayInfo = rewardDisplayInfo;
	}

	public String getRewardId() {
		return this.rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}

}
