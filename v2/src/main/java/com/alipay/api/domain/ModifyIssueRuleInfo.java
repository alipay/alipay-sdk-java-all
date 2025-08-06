package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改发放规则信息
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:10:18
 */
public class ModifyIssueRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1794197575769398722L;

	/**
	 * 发放资产的有效时间段，该字段为空时，默认为不限制。当发放资产为余额时，仅支持设置为不限，当发放资产为点券时，可支持设置多种值。具体传值格式请参考文档 <a href="https://opendocs.alipay.com/pre-open/07nwcs">接入文档</a>
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

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

	public String getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
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

}
