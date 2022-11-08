package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IssueRuleIdInfo;
import com.alipay.api.domain.StandardIdInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:21:33
 */
public class AlipayEbppInvoiceInstitutionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7593957447264839214L;

	/** 
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/** 
	 * 发放规则id列表
	 */
	@ApiListField("issue_rule_id_info_list")
	@ApiField("issue_rule_id_info")
	private List<IssueRuleIdInfo> issueRuleIdInfoList;

	/** 
	 * 使用规则id列表
	 */
	@ApiListField("standard_id_info_list")
	@ApiField("standard_id_info")
	private List<StandardIdInfo> standardIdInfoList;

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionId( ) {
		return this.institutionId;
	}

	public void setIssueRuleIdInfoList(List<IssueRuleIdInfo> issueRuleIdInfoList) {
		this.issueRuleIdInfoList = issueRuleIdInfoList;
	}
	public List<IssueRuleIdInfo> getIssueRuleIdInfoList( ) {
		return this.issueRuleIdInfoList;
	}

	public void setStandardIdInfoList(List<StandardIdInfo> standardIdInfoList) {
		this.standardIdInfoList = standardIdInfoList;
	}
	public List<StandardIdInfo> getStandardIdInfoList( ) {
		return this.standardIdInfoList;
	}

}
