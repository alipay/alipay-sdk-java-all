package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 制度新增
 *
 * @author auto create
 * @since 1.0, 2025-06-19 14:12:55
 */
public class AlipayEbppInvoiceInstitutionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8148334843952819577L;

	/**
	 * 企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 制度适配范围 当前字段已废弃(请使用institution_scope_info中adapter_type)
	 */
	@ApiField("adapter_type")
	@Deprecated
	private String adapterType;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 费控咨询模式，默认为0。
	 */
	@ApiField("consult_mode")
	private String consultMode;

	/**
	 * 该字段用于管控制度下发放的资产币种，不填写默认为人民币，设置该字段后，制度下手工发放的资产币种均为设置值。
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 制度生效结束时间
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
	 * 费用类型
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 制度描述
	 */
	@ApiField("institution_desc")
	private String institutionDesc;

	/**
	 * 制度名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 制度适用范围信息
	 */
	@ApiField("institution_scope_info")
	private InstitutionScopeInfo institutionScopeInfo;

	/**
	 * 发放规则列表
	 */
	@ApiListField("issue_rule_info_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> issueRuleInfoList;

	/**
	 * 制度下额度是否支持多人共享。如果支持，则制度下资产所有人共享；如果不支持，则制度下的资产为个人资产，成员之间不共享。
	 */
	@ApiField("multi_employee_share_mode")
	private String multiEmployeeShareMode;

	/**
	 * 外部唯一标识，可用于防止重复创建
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 适配id列表 当前字段已废弃(请使用institution_scope_info中owner_id_list)
	 */
	@ApiListField("owner_id_list")
	@ApiField("string")
	@Deprecated
	private List<String> ownerIdList;

	/**
	 * 适配开放id列表 当前字段已废弃(仅存量使用员工支付宝id配置适配范围的场景需要该字段，新对接方案不推荐使用员工支付宝id)
	 */
	@ApiListField("owner_open_id_list")
	@ApiField("string")
	@Deprecated
	private List<String> ownerOpenIdList;

	/**
	 * 适配id类型 当前字段已废弃(请使用institution_scope_info中owner_type)
	 */
	@ApiField("owner_type")
	@Deprecated
	private String ownerType;

	/**
	 * 因公场景 当前字段已废弃(该字段将废弃，不建议使用)
	 */
	@ApiField("scene_type")
	@Deprecated
	private String sceneType;

	/**
	 * 使用规则列表
	 */
	@ApiListField("standard_info_list")
	@ApiField("standard_info")
	private List<StandardInfo> standardInfoList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAdapterType() {
		return this.adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
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

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getInstitutionDesc() {
		return this.institutionDesc;
	}
	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public InstitutionScopeInfo getInstitutionScopeInfo() {
		return this.institutionScopeInfo;
	}
	public void setInstitutionScopeInfo(InstitutionScopeInfo institutionScopeInfo) {
		this.institutionScopeInfo = institutionScopeInfo;
	}

	public List<IssueRuleInfo> getIssueRuleInfoList() {
		return this.issueRuleInfoList;
	}
	public void setIssueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
		this.issueRuleInfoList = issueRuleInfoList;
	}

	public String getMultiEmployeeShareMode() {
		return this.multiEmployeeShareMode;
	}
	public void setMultiEmployeeShareMode(String multiEmployeeShareMode) {
		this.multiEmployeeShareMode = multiEmployeeShareMode;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public List<String> getOwnerIdList() {
		return this.ownerIdList;
	}
	public void setOwnerIdList(List<String> ownerIdList) {
		this.ownerIdList = ownerIdList;
	}

	public List<String> getOwnerOpenIdList() {
		return this.ownerOpenIdList;
	}
	public void setOwnerOpenIdList(List<String> ownerOpenIdList) {
		this.ownerOpenIdList = ownerOpenIdList;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public List<StandardInfo> getStandardInfoList() {
		return this.standardInfoList;
	}
	public void setStandardInfoList(List<StandardInfo> standardInfoList) {
		this.standardInfoList = standardInfoList;
	}

}
