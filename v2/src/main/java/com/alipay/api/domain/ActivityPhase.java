package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动阶段
 *
 * @author auto create
 * @since 1.0, 2025-10-11 16:07:13
 */
public class ActivityPhase extends AlipayObject {

	private static final long serialVersionUID = 7291197994466585471L;

	/**
	 * 0:未发放；
1:发放中；
2:已发放。
	 */
	@ApiField("award_status")
	private Long awardStatus;

	/**
	 * 阶段序号
	 */
	@ApiField("index")
	private Long index;

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

	/**
	 * 目标计数
	 */
	@ApiField("target_count")
	private Long targetCount;

	public Long getAwardStatus() {
		return this.awardStatus;
	}
	public void setAwardStatus(Long awardStatus) {
		this.awardStatus = awardStatus;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

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

	public Long getTargetCount() {
		return this.targetCount;
	}
	public void setTargetCount(Long targetCount) {
		this.targetCount = targetCount;
	}

}
