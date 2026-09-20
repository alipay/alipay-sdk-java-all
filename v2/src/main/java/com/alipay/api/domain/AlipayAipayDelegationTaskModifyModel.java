package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托任务修改
 *
 * @author auto create
 * @since 1.0, 2026-09-07 14:27:52
 */
public class AlipayAipayDelegationTaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7655585751537582138L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 委托任务id
	 */
	@ApiField("delegation_id")
	private String delegationId;

	/**
	 * 之前授权的最大金额，单位元
	 */
	@ApiField("pre_max_total_amount")
	private String preMaxTotalAmount;

	/**
	 * 预期最大授权金额，单位元
	 */
	@ApiField("target_max_total_amount")
	private String targetMaxTotalAmount;

	/**
	 * 允许代扣处理3次
	 */
	@ApiField("times_limit")
	private String timesLimit;

	/**
	 * AI付代买委托结束时间，默认会处理成 2026-01-30 00:00:00
	 */
	@ApiField("valid_end_time")
	private String validEndTime;

	/**
	 * AI付代买委托结束时间，默认会处理成 2026-01-30 00:00:00
	 */
	@ApiField("valid_start_time")
	private String validStartTime;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDelegationId() {
		return this.delegationId;
	}
	public void setDelegationId(String delegationId) {
		this.delegationId = delegationId;
	}

	public String getPreMaxTotalAmount() {
		return this.preMaxTotalAmount;
	}
	public void setPreMaxTotalAmount(String preMaxTotalAmount) {
		this.preMaxTotalAmount = preMaxTotalAmount;
	}

	public String getTargetMaxTotalAmount() {
		return this.targetMaxTotalAmount;
	}
	public void setTargetMaxTotalAmount(String targetMaxTotalAmount) {
		this.targetMaxTotalAmount = targetMaxTotalAmount;
	}

	public String getTimesLimit() {
		return this.timesLimit;
	}
	public void setTimesLimit(String timesLimit) {
		this.timesLimit = timesLimit;
	}

	public String getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(String validEndTime) {
		this.validEndTime = validEndTime;
	}

	public String getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(String validStartTime) {
		this.validStartTime = validStartTime;
	}

}
