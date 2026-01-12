package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开卡权益信息
 *
 * @author auto create
 * @since 1.0, 2025-11-17 10:54:01
 */
public class CardOpenRewardInfo extends AlipayObject {

	private static final long serialVersionUID = 8612115456776589994L;

	/**
	 * LDP编码
	 */
	@ApiField("ldp_code")
	private String ldpCode;

	/**
	 * 权限奖品列表
	 */
	@ApiListField("rewards")
	@ApiField("activity_reward")
	private List<ActivityReward> rewards;

	public String getLdpCode() {
		return this.ldpCode;
	}
	public void setLdpCode(String ldpCode) {
		this.ldpCode = ldpCode;
	}

	public List<ActivityReward> getRewards() {
		return this.rewards;
	}
	public void setRewards(List<ActivityReward> rewards) {
		this.rewards = rewards;
	}

}
