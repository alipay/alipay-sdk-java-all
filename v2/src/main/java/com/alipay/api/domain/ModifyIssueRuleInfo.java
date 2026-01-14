package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改发放规则信息
 *
 * @author auto create
 * @since 1.0, 2025-11-17 19:34:05
 */
public class ModifyIssueRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 6753529144125167227L;

	/**
	 * 发放资产的有效时间段，该字段为空时，默认为不限制。当发放资产为余额时，仅支持设置为不限，当发放资产为点券时，可支持设置多种值。具体传值格式请参考文档 <a href="https://opendocs.alipay.com/pre-open/07nwcs">接入文档</a>
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 累计类型，默认为0 可选值：0（不可累计）、1（可累计）、2（累计天数）、3（累计到指定日期）
	 */
	@ApiField("invalid_mode")
	private Long invalidMode;

	/**
	 * 累计类型值
	 */
	@ApiField("invalid_mode_value")
	private String invalidModeValue;

	/**
	 * 发放金额（不传则不修改），单位（元）
	 */
	@ApiField("issue_amount_value")
	private String issueAmountValue;

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
	 * 额度发放周期
	 */
	@ApiField("issue_type")
	private String issueType;

	/**
	 * 发放规则发放的额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠（不传则不修改），可选值：0（不可转赠）、1（可转赠），默认为0。该字段决定发放规则发放的资产是否可转赠给同制度下的其他人员
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

	public String getIssueType() {
		return this.issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
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
