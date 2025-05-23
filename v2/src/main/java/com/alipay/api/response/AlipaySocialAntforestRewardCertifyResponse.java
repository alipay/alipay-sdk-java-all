package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.reward.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 15:47:25
 */
public class AlipaySocialAntforestRewardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7525427166363675436L;

	/** 
	 * true-有对应奖励的领取资格
false-无资格
	 */
	@ApiField("has_reward")
	private Boolean hasReward;

	public void setHasReward(Boolean hasReward) {
		this.hasReward = hasReward;
	}
	public Boolean getHasReward( ) {
		return this.hasReward;
	}

}
