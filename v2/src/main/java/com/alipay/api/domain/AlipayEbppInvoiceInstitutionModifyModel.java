package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度编辑
 *
 * @author auto create
 * @since 1.0, 2025-11-17 19:34:05
 */
public class AlipayEbppInvoiceInstitutionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5595424825175825159L;

	/**
	 * 企业共同账户id
（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(推荐使用enterprise_id)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号
（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(推荐使用enterprise_id)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 费控咨询模式：
0-支付宝内部计算规则可用金额
1-咨询外部服务商规则可用金额
	 */
	@ApiField("consult_mode")
	private String consultMode;

	/**
	 * 制度是否启用
	 */
	@ApiField("effective")
	private String effective;

	/**
	 * 制度生效结束时间（可空），最小粒度为天，最早是当日
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 制度生效起始时间
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度描述
	 */
	@ApiField("institution_desc")
	private String institutionDesc;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 制度名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 修改的发放规则详情
	 */
	@ApiField("modify_issue_rule_detail_info")
	private ModifyIssueRuleDetailInfo modifyIssueRuleDetailInfo;

	/**
	 * 制度下适用范围修改信息
	 */
	@ApiField("modify_scope_info")
	private ModifyScopeInfo modifyScopeInfo;

	/**
	 * 修改的使用规则详情
	 */
	@ApiField("modify_standard_detail_info")
	private ModifyStandardDetailInfo modifyStandardDetailInfo;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getConsultMode() {
		return this.consultMode;
	}
	public void setConsultMode(String consultMode) {
		this.consultMode = consultMode;
	}

	public String getEffective() {
		return this.effective;
	}
	public void setEffective(String effective) {
		this.effective = effective;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionDesc() {
		return this.institutionDesc;
	}
	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public ModifyIssueRuleDetailInfo getModifyIssueRuleDetailInfo() {
		return this.modifyIssueRuleDetailInfo;
	}
	public void setModifyIssueRuleDetailInfo(ModifyIssueRuleDetailInfo modifyIssueRuleDetailInfo) {
		this.modifyIssueRuleDetailInfo = modifyIssueRuleDetailInfo;
	}

	public ModifyScopeInfo getModifyScopeInfo() {
		return this.modifyScopeInfo;
	}
	public void setModifyScopeInfo(ModifyScopeInfo modifyScopeInfo) {
		this.modifyScopeInfo = modifyScopeInfo;
	}

	public ModifyStandardDetailInfo getModifyStandardDetailInfo() {
		return this.modifyStandardDetailInfo;
	}
	public void setModifyStandardDetailInfo(ModifyStandardDetailInfo modifyStandardDetailInfo) {
		this.modifyStandardDetailInfo = modifyStandardDetailInfo;
	}

}
