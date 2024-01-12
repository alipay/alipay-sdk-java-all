package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签到发奖策略
 *
 * @author auto create
 * @since 1.0, 2023-10-09 15:47:32
 */
public class SignInBonusStrategy extends AlipayObject {

	private static final long serialVersionUID = 6448141293962837341L;

	/**
	 * 次数上限（发奖的最大签到次数）
	 */
	@ApiField("max_time")
	private Long maxTime;

	/**
	 * 次数下限（发奖的最少签到次数）
	 */
	@ApiField("min_time")
	private Long minTime;

	/**
	 * 奖品信息
	 */
	@ApiListField("prizes")
	@ApiField("sign_in_prize_config")
	private List<SignInPrizeConfig> prizes;

	/**
	 * 签到计数模式
	 */
	@ApiField("signin_acc_type")
	private String signinAccType;

	/**
	 * 发奖策略类型
	 */
	@ApiField("strategy_type")
	private String strategyType;

	public Long getMaxTime() {
		return this.maxTime;
	}
	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
	}

	public Long getMinTime() {
		return this.minTime;
	}
	public void setMinTime(Long minTime) {
		this.minTime = minTime;
	}

	public List<SignInPrizeConfig> getPrizes() {
		return this.prizes;
	}
	public void setPrizes(List<SignInPrizeConfig> prizes) {
		this.prizes = prizes;
	}

	public String getSigninAccType() {
		return this.signinAccType;
	}
	public void setSigninAccType(String signinAccType) {
		this.signinAccType = signinAccType;
	}

	public String getStrategyType() {
		return this.strategyType;
	}
	public void setStrategyType(String strategyType) {
		this.strategyType = strategyType;
	}

}
