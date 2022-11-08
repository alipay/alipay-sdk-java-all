package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 22:27:02
 */
public class IssueRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 2833946175958352313L;

	/**
	 * 生效周期，不限："{\"all\":true}"，默认为不限
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 是否可累计，枚举：0（不可累计）、1（可累计），默认为0
	 */
	@ApiField("invalid_mode")
	private Long invalidMode;

	/**
	 * 失效模式值
	 */
	@ApiField("invalid_mode_value")
	private String invalidModeValue;

	/**
	 * 发放金额，按城市不同发放标准示例值："[{/"cities/":[/"321000/",/"321100/"],amount:/"50/"},
{/"cities/":[/"321200/",/"321300/"],amount:/"150/"}]"
统一标准发放示例值：200
	 */
	@ApiField("issue_amount_value")
	private String issueAmountValue;

	/**
	 * 如果target_type指定INSTITUTION，则使用制度有效期结束时间，无需填写
	 */
	@ApiField("issue_end_date")
	private Date issueEndDate;

	/**
	 * 发放规则id，创建时无需填写
	 */
	@ApiField("issue_rule_id")
	private String issueRuleId;

	/**
	 * 发放规则名称
	 */
	@ApiField("issue_rule_name")
	private String issueRuleName;

	/**
	 * 如果target_type指定INSTITUTION，则使用制度有效期起始时间，无需填写
	 */
	@ApiField("issue_start_date")
	private Date issueStartDate;

	/**
	 * 发放类型，枚举：ISSUE_MONTH（按月发放）、ISSUE_DAY（按日发放）
	 */
	@ApiField("issue_type")
	private String issueType;

	/**
	 * 外部发放规则id，制度内发放规则该字段不允许重复
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度类型，枚举：COUPON（点券）、CAP（余额）
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠，枚举：0（不可转赠）、1（可转赠），默认为0
	 */
	@ApiField("share_mode")
	private Long shareMode;

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

}
