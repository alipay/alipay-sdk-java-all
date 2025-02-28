package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑发放规则
 *
 * @author auto create
 * @since 1.0, 2024-06-24 10:34:50
 */
public class AlipayEbppInvoiceIssueruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1577393689419846865L;

	/**
	 * 共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 修改类型，枚举：
MODIFY_BASIC_INFO（修改发放规则基本信息）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 是否启用，"0"为停用，"1"为启用；
	 */
	@ApiField("effective")
	private String effective;

	/**
	 * 生效周期（不传则不修改），不限："{\"all\":true}"
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 是否可累计（不传则不修改）可选值：0（不可累计）、1（可累计），2（累计天数），3（累计到固定时间）
	 */
	@ApiField("invalid_mode")
	private Long invalidMode;

	/**
	 * 累计值
	 */
	@ApiField("invalid_mode_value")
	private String invalidModeValue;

	/**
	 * 发放金额（不传则不修改），单位（元）
	 */
	@ApiField("issue_amount_value")
	private String issueAmountValue;

	/**
	 * 发放规则的截止时间
	 */
	@ApiField("issue_end_date")
	private Date issueEndDate;

	/**
	 * 发放规则id
	 */
	@ApiField("issue_rule_id")
	private String issueRuleId;

	/**
	 * 发放规则名称（不传则不修改）
	 */
	@ApiField("issue_rule_name")
	private String issueRuleName;

	/**
	 * 发放规则的开始时间
	 */
	@ApiField("issue_start_date")
	private Date issueStartDate;

	/**
	 * 发放类型
	 */
	@ApiField("issue_type")
	private String issueType;

	/**
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠（不传则不修改），可选值：0（不可转赠）、1（可转赠），默认为0，按城市发放不支持可转赠
	 */
	@ApiField("share_mode")
	private Long shareMode;

	/**
	 * 发放规则关联的目标值 target_type为制度时：制度id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 发放规则关联的目标类型
	 */
	@ApiField("target_type")
	private String targetType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEffective() {
		return this.effective;
	}
	public void setEffective(String effective) {
		this.effective = effective;
	}

	public String getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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
