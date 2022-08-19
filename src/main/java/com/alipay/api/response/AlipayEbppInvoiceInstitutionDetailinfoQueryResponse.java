package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IssueRuleInfo;
import com.alipay.api.domain.StandardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.detailinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:41:50
 */
public class AlipayEbppInvoiceInstitutionDetailinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7321189586294127717L;

	/** 
	 * 制度生效结束时间，最小粒度为天，最早是当日，结束时间以23:59:59结尾，结束时间最大值不超过2100-01-01 00:00:00
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/** 
	 * 制度生效起始时间，最小粒度为天，最早是当日，起始时间以00:00:00结束
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/** 
	 * 费用类型 枚举值：MEAL（餐饮），METRO（地铁），DEFAULT（通用
	 */
	@ApiField("expense_type")
	private String expenseType;

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
	 * 发放规则列表
	 */
	@ApiListField("issue_rule_info_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> issueRuleInfoList;

	/** 
	 * 因公场景 枚举值：OVERTIME（加班），SUBSIDY（补贴福利），TRAVEL（差旅），ENTERTAIN（招待），CITYTRAFFIC（市内交通），NIGHT（夜间）
	 */
	@ApiField("scene_type")
	private String sceneType;

	/** 
	 * 使用规则列表
	 */
	@ApiField("standard_info_list")
	private StandardInfo standardInfoList;

	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}
	public Date getEffectiveEndDate( ) {
		return this.effectiveEndDate;
	}

	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}
	public Date getEffectiveStartDate( ) {
		return this.effectiveStartDate;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public String getExpenseType( ) {
		return this.expenseType;
	}

	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}
	public String getInstitutionDesc( ) {
		return this.institutionDesc;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionId( ) {
		return this.institutionId;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstitutionName( ) {
		return this.institutionName;
	}

	public void setIssueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
		this.issueRuleInfoList = issueRuleInfoList;
	}
	public List<IssueRuleInfo> getIssueRuleInfoList( ) {
		return this.issueRuleInfoList;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}
	public String getSceneType( ) {
		return this.sceneType;
	}

	public void setStandardInfoList(StandardInfo standardInfoList) {
		this.standardInfoList = standardInfoList;
	}
	public StandardInfo getStandardInfoList( ) {
		return this.standardInfoList;
	}

}
