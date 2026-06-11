package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.delegation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 21:17:45
 */
public class AlipayUserAgreementDelegationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3818966498187572736L;

	/** 
	 * AI支付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 委托号
	 */
	@ApiField("delegation_id")
	private String delegationId;

	/** 
	 * 代买委托场景，与传入值相同
	 */
	@ApiField("delegation_tag")
	private String delegationTag;

	/** 
	 * 外部委托号
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	/** 
	 * 总金额上限，单位元，币种人民币
	 */
	@ApiField("max_total_amount")
	private String maxTotalAmount;

	/** 
	 * 剩余可用金额，单位元，币种人民币
	 */
	@ApiField("remaining_amount")
	private String remainingAmount;

	/** 
	 * 剩余次数
	 */
	@ApiField("remaining_times")
	private String remainingTimes;

	/** 
	 * 代买委托任务当前状态，不可枚举
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总次数上限
	 */
	@ApiField("times_limit")
	private String timesLimit;

	/** 
	 * 有效期结束时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("validity_end_time")
	private String validityEndTime;

	/** 
	 * 有效期开始时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("validity_start_time")
	private String validityStartTime;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setDelegationId(String delegationId) {
		this.delegationId = delegationId;
	}
	public String getDelegationId( ) {
		return this.delegationId;
	}

	public void setDelegationTag(String delegationTag) {
		this.delegationTag = delegationTag;
	}
	public String getDelegationTag( ) {
		return this.delegationTag;
	}

	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}
	public String getExternalDelegationId( ) {
		return this.externalDelegationId;
	}

	public void setMaxTotalAmount(String maxTotalAmount) {
		this.maxTotalAmount = maxTotalAmount;
	}
	public String getMaxTotalAmount( ) {
		return this.maxTotalAmount;
	}

	public void setRemainingAmount(String remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getRemainingAmount( ) {
		return this.remainingAmount;
	}

	public void setRemainingTimes(String remainingTimes) {
		this.remainingTimes = remainingTimes;
	}
	public String getRemainingTimes( ) {
		return this.remainingTimes;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTimesLimit(String timesLimit) {
		this.timesLimit = timesLimit;
	}
	public String getTimesLimit( ) {
		return this.timesLimit;
	}

	public void setValidityEndTime(String validityEndTime) {
		this.validityEndTime = validityEndTime;
	}
	public String getValidityEndTime( ) {
		return this.validityEndTime;
	}

	public void setValidityStartTime(String validityStartTime) {
		this.validityStartTime = validityStartTime;
	}
	public String getValidityStartTime( ) {
		return this.validityStartTime;
	}

}
