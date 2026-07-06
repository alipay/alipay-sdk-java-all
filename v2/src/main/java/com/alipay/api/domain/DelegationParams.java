package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI付代买委托信息
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:13
 */
public class DelegationParams extends AlipayObject {

	private static final long serialVersionUID = 7196739754379224926L;

	/**
	 * 对AI付代买委托意图做描述
	 */
	@ApiField("delegation_desc")
	private String delegationDesc;

	/**
	 * 描述代买委托
	 */
	@ApiField("delegation_tag")
	private String delegationTag;

	/**
	 * 外部商户AI付代买委托id，用于委托申请成功后区分不同的委托任务
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	/**
	 * AI付代买委托总限额，币种为人民币，单位为元
	 */
	@ApiField("max_total_amount")
	private String maxTotalAmount;

	/**
	 * AI付代买委托总次数
	 */
	@ApiField("times_limit")
	private String timesLimit;

	/**
	 * AI付代买委托总次数 当前字段已废弃(拼写错误，迁移至times_limit字段)
	 */
	@ApiField("times_timit")
	@Deprecated
	private String timesTimit;

	/**
	 * AI付代买委托结束时间
	 */
	@ApiField("validity_end_time")
	private String validityEndTime;

	/**
	 * AI付代买委托任务起始时间
	 */
	@ApiField("validity_start_time")
	private String validityStartTime;

	public String getDelegationDesc() {
		return this.delegationDesc;
	}
	public void setDelegationDesc(String delegationDesc) {
		this.delegationDesc = delegationDesc;
	}

	public String getDelegationTag() {
		return this.delegationTag;
	}
	public void setDelegationTag(String delegationTag) {
		this.delegationTag = delegationTag;
	}

	public String getExternalDelegationId() {
		return this.externalDelegationId;
	}
	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}

	public String getMaxTotalAmount() {
		return this.maxTotalAmount;
	}
	public void setMaxTotalAmount(String maxTotalAmount) {
		this.maxTotalAmount = maxTotalAmount;
	}

	public String getTimesLimit() {
		return this.timesLimit;
	}
	public void setTimesLimit(String timesLimit) {
		this.timesLimit = timesLimit;
	}

	public String getTimesTimit() {
		return this.timesTimit;
	}
	public void setTimesTimit(String timesTimit) {
		this.timesTimit = timesTimit;
	}

	public String getValidityEndTime() {
		return this.validityEndTime;
	}
	public void setValidityEndTime(String validityEndTime) {
		this.validityEndTime = validityEndTime;
	}

	public String getValidityStartTime() {
		return this.validityStartTime;
	}
	public void setValidityStartTime(String validityStartTime) {
		this.validityStartTime = validityStartTime;
	}

}
