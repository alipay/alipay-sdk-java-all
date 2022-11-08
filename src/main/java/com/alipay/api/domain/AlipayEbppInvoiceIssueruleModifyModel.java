package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑发放规则
 *
 * @author auto create
 * @since 1.0, 2022-08-18 09:48:02
 */
public class AlipayEbppInvoiceIssueruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8483713349461899841L;

	/**
	 * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 修改类型，枚举：
MODIFY_BASIC_INFO（修改发放规则基本信息）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 是否启用，"0"为停用，"1"为启用；
如果target_type指定INSTITUTION，则与制度一致
	 */
	@ApiField("effective")
	private String effective;

	/**
	 * 生效周期（不传则不修改），不限："{\"all\":true}"
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 企业ID - 适用于在企业码PC端创建的企业账号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 是否可累计（不传则不修改），枚举：0（不可累计）、1（可累计），默认为0，余额只允许可累计，按城市发放只允许不可累计，设置了生效周期只允许不可累计
	 */
	@ApiField("invalid_mode")
	private Long invalidMode;

	/**
	 * 累计值（预留字段）
	 */
	@ApiField("invalid_mode_value")
	private String invalidModeValue;

	/**
	 * 发放金额（不传则不修改）；
按城市不同发放标准示例值："[{\"cities\":[\"321000\",\"321100\"],\"amount\":\"50\"},{\"cities\":[\"321200\",\"321300\"],\"amount\":\"150\"}]"
统一标准发放示例值："200"
	 */
	@ApiField("issue_amount_value")
	private String issueAmountValue;

	/**
	 * 发放规则的截止时间
如果target_type指定INSTITUTION，则使用制度有效期结束时间，无需填写
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
如果target_type指定INSTITUTION，则使用制度有效期起始时间，不支持修改
	 */
	@ApiField("issue_start_date")
	private Date issueStartDate;

	/**
	 * 发放类型（不传则不修改），枚举：ISSUE_MONTH（按月发放）、ISSUE_DAY（按日发放）
	 */
	@ApiField("issue_type")
	private String issueType;

	/**
	 * 额度类型（不传则不修改），枚举：COUPON（点券）、CAP（余额）
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠（不传则不修改），枚举：0（不可转赠）、1（可转赠），默认为0，余额不支持可转赠，按城市发放不支持可转赠
	 */
	@ApiField("share_mode")
	private Long shareMode;

	/**
	 * 发放规则关联的目标值 target_type为制度时：制度id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 发放规则关联的目标类型，枚举值：INSTITUTION(制度)
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
