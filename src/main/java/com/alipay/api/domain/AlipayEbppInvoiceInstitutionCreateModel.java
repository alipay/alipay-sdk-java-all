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
 * @since 1.0, 2022-10-11 09:43:20
 */
public class AlipayEbppInvoiceInstitutionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4695686119914914118L;

	/**
	 * 企业共同账户id，和授权签约协议号共同使用。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 制度生效结束时间，最小粒度为天，结束时间不早于起始时间，时分秒必须为23:59:59，最晚不超过2222-01-01 23:59:59
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 制度生效起始时间，最小粒度为天，最早是当日，时分秒必须为00:00:00。
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业id（条件必填）
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费用类型 枚举值：MEAL（餐饮），DEFAULT（通用）
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 制度描述（可空）
	 */
	@ApiField("institution_desc")
	private String institutionDesc;

	/**
	 * 制度名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 发放规则列表（可空），一个制度下最多创建10条发放规则。
	 */
	@ApiListField("issue_rule_info_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> issueRuleInfoList;

	/**
	 * 因公场景。枚举值：OVERTIME（加班），SUBSIDY（补贴福利），TRAVEL（差旅），ENTERTAIN（招待），DEFAULT（通用）
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 使用规则列表，一个制度下最多创建10条使用规则。
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

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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
