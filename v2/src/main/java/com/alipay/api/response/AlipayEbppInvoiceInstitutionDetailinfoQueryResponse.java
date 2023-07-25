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
 * @since 1.0, 2023-06-02 14:11:50
 */
public class AlipayEbppInvoiceInstitutionDetailinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6267482468286654393L;

	/** 
	 * 费控咨询模式
	 */
	@ApiField("consult_mode")
	private String consultMode;

	/** 
	 * 制度启用停用状态
	 */
	@ApiField("effective")
	private String effective;

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
	 * 发放规则信息列表
	 */
	@ApiListField("issue_rule_info_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> issueRuleInfoList;

	/** 
	 * 因公场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	/** 
	 * 使用规则列表
	 */
	@ApiListField("standard_info_detail_list")
	@ApiField("standard_info")
	private List<StandardInfo> standardInfoDetailList;

	/** 
	 * 使用规则列表（已废弃）
	 */
	@ApiField("standard_info_list")
	private StandardInfo standardInfoList;

	public void setConsultMode(String consultMode) {
		this.consultMode = consultMode;
	}
	public String getConsultMode( ) {
		return this.consultMode;
	}

	public void setEffective(String effective) {
		this.effective = effective;
	}
	public String getEffective( ) {
		return this.effective;
	}

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

	public void setStandardInfoDetailList(List<StandardInfo> standardInfoDetailList) {
		this.standardInfoDetailList = standardInfoDetailList;
	}
	public List<StandardInfo> getStandardInfoDetailList( ) {
		return this.standardInfoDetailList;
	}

	public void setStandardInfoList(StandardInfo standardInfoList) {
		this.standardInfoList = standardInfoList;
	}
	public StandardInfo getStandardInfoList( ) {
		return this.standardInfoList;
	}

}
