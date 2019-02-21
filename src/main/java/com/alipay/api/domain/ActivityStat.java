package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动统计信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 11:01:30
 */
public class ActivityStat extends AlipayObject {

	private static final long serialVersionUID = 4346418741752381646L;

	/**
	 * 活动总参与人次, 即活动总共签署合约数
	 */
	@ApiField("contract_count")
	private Long contractCount;

	/**
	 * 已完成的合约数(人次)
	 */
	@ApiField("finished_count")
	private Long finishedCount;

	/**
	 * 已失效的合约数(人次)
	 */
	@ApiField("lose_efficacy_count")
	private Long loseEfficacyCount;

	/**
	 * 活动总参与人数
	 */
	@ApiField("participator_count")
	private Long participatorCount;

	/**
	 * 待守约的合约数(人次)
	 */
	@ApiField("promising_count")
	private Long promisingCount;

	/**
	 * 活动总履约数, 即总核销次数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	/**
	 * 已逾期的合约数(人次)
	 */
	@ApiField("violated_count")
	private Long violatedCount;

	public Long getContractCount() {
		return this.contractCount;
	}
	public void setContractCount(Long contractCount) {
		this.contractCount = contractCount;
	}

	public Long getFinishedCount() {
		return this.finishedCount;
	}
	public void setFinishedCount(Long finishedCount) {
		this.finishedCount = finishedCount;
	}

	public Long getLoseEfficacyCount() {
		return this.loseEfficacyCount;
	}
	public void setLoseEfficacyCount(Long loseEfficacyCount) {
		this.loseEfficacyCount = loseEfficacyCount;
	}

	public Long getParticipatorCount() {
		return this.participatorCount;
	}
	public void setParticipatorCount(Long participatorCount) {
		this.participatorCount = participatorCount;
	}

	public Long getPromisingCount() {
		return this.promisingCount;
	}
	public void setPromisingCount(Long promisingCount) {
		this.promisingCount = promisingCount;
	}

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

	public Long getViolatedCount() {
		return this.violatedCount;
	}
	public void setViolatedCount(Long violatedCount) {
		this.violatedCount = violatedCount;
	}

}
