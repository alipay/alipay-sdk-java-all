package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期明细
 *
 * @author auto create
 * @since 1.0, 2021-07-02 10:13:15
 */
public class InstallmentDetail extends AlipayObject {

	private static final long serialVersionUID = 6844189694962667215L;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 结清状态，SETTLED - 结清；NOT_SETTLE - 未结清
	 */
	@ApiField("is_settle")
	private String isSettle;

	/**
	 * 分期期次
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 减免利息
	 */
	@ApiField("reduce_interest")
	private Long reduceInterest;

	/**
	 * 减免复利
	 */
	@ApiField("reduce_interest_penalty")
	private Long reduceInterestPenalty;

	/**
	 * 减免罚息
	 */
	@ApiField("reduce_penalty")
	private Long reducePenalty;

	/**
	 * 已还利息 - 该期累计实还利息
	 */
	@ApiField("repaid_interest_amount")
	private Long repaidInterestAmount;

	/**
	 * 已还复利 - 该期累计实还复利
	 */
	@ApiField("repaid_interest_penalty_amount")
	private Long repaidInterestPenaltyAmount;

	/**
	 * 已还罚息 - 该期累计实还罚息
	 */
	@ApiField("repaid_penalty_amount")
	private Long repaidPenaltyAmount;

	/**
	 * 已还本金 - 该期累计实还本金
	 */
	@ApiField("repaid_principal_amount")
	private Long repaidPrincipalAmount;

	/**
	 * 剩余利息 - 该期剩余应还利息
	 */
	@ApiField("rest_interest")
	private Long restInterest;

	/**
	 * 剩余复利 - 该期剩余应还复利
	 */
	@ApiField("rest_interest_penalty")
	private Long restInterestPenalty;

	/**
	 * 剩余罚息 - 该期剩余应还罚息
	 */
	@ApiField("rest_penalty")
	private Long restPenalty;

	/**
	 * 剩余本金 - 该期剩余应还本金
	 */
	@ApiField("rest_principal")
	private Long restPrincipal;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsSettle() {
		return this.isSettle;
	}
	public void setIsSettle(String isSettle) {
		this.isSettle = isSettle;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public Long getReduceInterest() {
		return this.reduceInterest;
	}
	public void setReduceInterest(Long reduceInterest) {
		this.reduceInterest = reduceInterest;
	}

	public Long getReduceInterestPenalty() {
		return this.reduceInterestPenalty;
	}
	public void setReduceInterestPenalty(Long reduceInterestPenalty) {
		this.reduceInterestPenalty = reduceInterestPenalty;
	}

	public Long getReducePenalty() {
		return this.reducePenalty;
	}
	public void setReducePenalty(Long reducePenalty) {
		this.reducePenalty = reducePenalty;
	}

	public Long getRepaidInterestAmount() {
		return this.repaidInterestAmount;
	}
	public void setRepaidInterestAmount(Long repaidInterestAmount) {
		this.repaidInterestAmount = repaidInterestAmount;
	}

	public Long getRepaidInterestPenaltyAmount() {
		return this.repaidInterestPenaltyAmount;
	}
	public void setRepaidInterestPenaltyAmount(Long repaidInterestPenaltyAmount) {
		this.repaidInterestPenaltyAmount = repaidInterestPenaltyAmount;
	}

	public Long getRepaidPenaltyAmount() {
		return this.repaidPenaltyAmount;
	}
	public void setRepaidPenaltyAmount(Long repaidPenaltyAmount) {
		this.repaidPenaltyAmount = repaidPenaltyAmount;
	}

	public Long getRepaidPrincipalAmount() {
		return this.repaidPrincipalAmount;
	}
	public void setRepaidPrincipalAmount(Long repaidPrincipalAmount) {
		this.repaidPrincipalAmount = repaidPrincipalAmount;
	}

	public Long getRestInterest() {
		return this.restInterest;
	}
	public void setRestInterest(Long restInterest) {
		this.restInterest = restInterest;
	}

	public Long getRestInterestPenalty() {
		return this.restInterestPenalty;
	}
	public void setRestInterestPenalty(Long restInterestPenalty) {
		this.restInterestPenalty = restInterestPenalty;
	}

	public Long getRestPenalty() {
		return this.restPenalty;
	}
	public void setRestPenalty(Long restPenalty) {
		this.restPenalty = restPenalty;
	}

	public Long getRestPrincipal() {
		return this.restPrincipal;
	}
	public void setRestPrincipal(Long restPrincipal) {
		this.restPrincipal = restPrincipal;
	}

}
