package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游戏副本奖励信息
 *
 * @author auto create
 * @since 1.0, 2023-12-13 18:03:19
 */
public class GameChallengePrizeVO extends AlipayObject {

	private static final long serialVersionUID = 7446895489625232366L;

	/**
	 * 副本活动对应的奖励数量
	 */
	@ApiField("challenge_prize_amount")
	private Long challengePrizeAmount;

	/**
	 * 副本活动奖品id，用于奖励结算时以及和支付宝系统交互使用的标识
	 */
	@ApiField("challenge_prize_id")
	private String challengePrizeId;

	/**
	 * 副本活动对应奖励的等级，值越小，等级越高
	 */
	@ApiField("challenge_prize_level")
	private Long challengePrizeLevel;

	/**
	 * 副本活动对应的奖励名称
	 */
	@ApiField("challenge_prize_name")
	private String challengePrizeName;

	/**
	 * 副本活动的奖励单位
	 */
	@ApiField("challenge_prize_unit")
	private String challengePrizeUnit;

	public Long getChallengePrizeAmount() {
		return this.challengePrizeAmount;
	}
	public void setChallengePrizeAmount(Long challengePrizeAmount) {
		this.challengePrizeAmount = challengePrizeAmount;
	}

	public String getChallengePrizeId() {
		return this.challengePrizeId;
	}
	public void setChallengePrizeId(String challengePrizeId) {
		this.challengePrizeId = challengePrizeId;
	}

	public Long getChallengePrizeLevel() {
		return this.challengePrizeLevel;
	}
	public void setChallengePrizeLevel(Long challengePrizeLevel) {
		this.challengePrizeLevel = challengePrizeLevel;
	}

	public String getChallengePrizeName() {
		return this.challengePrizeName;
	}
	public void setChallengePrizeName(String challengePrizeName) {
		this.challengePrizeName = challengePrizeName;
	}

	public String getChallengePrizeUnit() {
		return this.challengePrizeUnit;
	}
	public void setChallengePrizeUnit(String challengePrizeUnit) {
		this.challengePrizeUnit = challengePrizeUnit;
	}

}
