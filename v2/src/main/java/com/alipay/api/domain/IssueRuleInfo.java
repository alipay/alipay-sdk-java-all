package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则信息
 *
 * @author auto create
 * @since 1.0, 2024-11-20 11:38:56
 */
public class IssueRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1764983451867371833L;

	/**
	 * 生效时间段
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 累计类型，默认为0
可选值：0（不可累计）、1（可累计）、2（累计天数）、3（累计到指定日期）
	 */
	@ApiField("invalid_mode")
	private Long invalidMode;

	/**
	 * 累计类型值
	 */
	@ApiField("invalid_mode_value")
	private String invalidModeValue;

	/**
	 * 发放金额，单位元
	 */
	@ApiField("issue_amount_value")
	private String issueAmountValue;

	/**
	 * 发放规则有效结束时间
	 */
	@ApiField("issue_end_date")
	private Date issueEndDate;

	/**
	 * 发放规则id
	 */
	@ApiField("issue_rule_id")
	private String issueRuleId;

	/**
	 * 发放规则名称
	 */
	@ApiField("issue_rule_name")
	private String issueRuleName;

	/**
	 * 发放规则有效起始时间
	 */
	@ApiField("issue_start_date")
	private Date issueStartDate;

	/**
	 * 发放类型
	 */
	@ApiField("issue_type")
	private String issueType;

	/**
	 * 外部发放规则id
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠
	 */
	@ApiField("share_mode")
	private Long shareMode;

	/**
	 * 目标id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 发放规则归属的目标类型
	 */
	@ApiField("target_type")
	private String targetType;

	public String getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public Long getInvalidMode() {
		return this.invalidMode;
	}
	public void setInvalidMode(Long invalidMode) {
		this.invalidMode = invalidMode;
	}

	public String getInvalidModeValue() {
		return this.invalidModeValue;
	}
	public void setInvalidModeValue(String invalidModeValue) {
		this.invalidModeValue = invalidModeValue;
	}

	public String getIssueAmountValue() {
		return this.issueAmountValue;
	}
	public void setIssueAmountValue(String issueAmountValue) {
		this.issueAmountValue = issueAmountValue;
	}

	public Date getIssueEndDate() {
		return this.issueEndDate;
	}
	public void setIssueEndDate(Date issueEndDate) {
		this.issueEndDate = issueEndDate;
	}

	public String getIssueRuleId() {
		return this.issueRuleId;
	}
	public void setIssueRuleId(String issueRuleId) {
		this.issueRuleId = issueRuleId;
	}

	public String getIssueRuleName() {
		return this.issueRuleName;
	}
	public void setIssueRuleName(String issueRuleName) {
		this.issueRuleName = issueRuleName;
	}

	public Date getIssueStartDate() {
		return this.issueStartDate;
	}
	public void setIssueStartDate(Date issueStartDate) {
		this.issueStartDate = issueStartDate;
	}

	public String getIssueType() {
		return this.issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public Long getShareMode() {
		return this.shareMode;
	}
	public void setShareMode(Long shareMode) {
		this.shareMode = shareMode;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
