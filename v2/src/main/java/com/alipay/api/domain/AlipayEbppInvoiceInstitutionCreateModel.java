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
 * @since 1.0, 2023-10-18 15:48:22
 */
public class AlipayEbppInvoiceInstitutionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8238222371418248969L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 制度适配范围
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 费控咨询模式，默认为0。
	 */
	@ApiField("consult_mode")
	private String consultMode;

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
	 * 发放规则列表
	 */
	@ApiListField("issue_rule_info_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> issueRuleInfoList;

	/**
	 * 外部唯一标识，可用于防止重复创建
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 适配id列表
	 */
	@ApiListField("owner_id_list")
	@ApiField("string")
	private List<String> ownerIdList;

	/**
	 * 适配开放id列表
	 */
	@ApiListField("owner_open_id_list")
	@ApiField("string")
	private List<String> ownerOpenIdList;

	/**
	 * 适配id类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 因公场景
	 */
	@ApiField("scene_type")
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

	public List<IssueRuleInfo> getIssueRuleInfoList() {
		return this.issueRuleInfoList;
	}
	public void setIssueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
		this.issueRuleInfoList = issueRuleInfoList;
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
