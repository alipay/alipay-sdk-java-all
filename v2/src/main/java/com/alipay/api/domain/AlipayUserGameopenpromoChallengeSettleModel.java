package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 副本活动结算
 *
 * @author auto create
 * @since 1.0, 2024-01-02 09:38:42
 */
public class AlipayUserGameopenpromoChallengeSettleModel extends AlipayObject {

	private static final long serialVersionUID = 6226372557913983518L;

	/**
	 * 用户副本挑战实际的开始时间
	 */
	@ApiField("challenge_begin_time")
	private String challengeBeginTime;

	/**
	 * 用户维度的参与挑战业务号，发奖会以此业务号做幂等
	 */
	@ApiField("challenge_biz_no")
	private String challengeBizNo;

	/**
	 * 副本活动对应的奖励id, 从副本活动查询接口中获取
	 */
	@ApiField("challenge_prize_id")
	private String challengePrizeId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 结算时是否给用户发奖
	 */
	@ApiField("reward_prize")
	private Boolean rewardPrize;

	/**
	 * 支付宝唯一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChallengeBeginTime() {
		return this.challengeBeginTime;
	}
	public void setChallengeBeginTime(String challengeBeginTime) {
		this.challengeBeginTime = challengeBeginTime;
	}

	public String getChallengeBizNo() {
		return this.challengeBizNo;
	}
	public void setChallengeBizNo(String challengeBizNo) {
		this.challengeBizNo = challengeBizNo;
	}

	public String getChallengePrizeId() {
		return this.challengePrizeId;
	}
	public void setChallengePrizeId(String challengePrizeId) {
		this.challengePrizeId = challengePrizeId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getRewardPrize() {
		return this.rewardPrize;
	}
	public void setRewardPrize(Boolean rewardPrize) {
		this.rewardPrize = rewardPrize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
