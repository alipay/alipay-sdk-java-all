package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IssueRuleIdInfo;
import com.alipay.api.domain.StandardIdInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 20:12:24
 */
public class AlipayEbppInvoiceInstitutionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7216225582949511588L;

	/** 
	 * 新增发放规则时返回外部幂等id和发放规则id的映射关系
	 */
	@ApiListField("issue_rule_id_info_list")
	@ApiField("issue_rule_id_info")
	private List<IssueRuleIdInfo> issueRuleIdInfoList;

	/** 
	 * 修改是否成功
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 新增使用规则后会返回外部幂等id和使用规则id的映射关系
	 */
	@ApiListField("standard_id_info_list")
	@ApiField("standard_id_info")
	private List<StandardIdInfo> standardIdInfoList;

	public void setIssueRuleIdInfoList(List<IssueRuleIdInfo> issueRuleIdInfoList) {
		this.issueRuleIdInfoList = issueRuleIdInfoList;
	}
	public List<IssueRuleIdInfo> getIssueRuleIdInfoList( ) {
		return this.issueRuleIdInfoList;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public void setStandardIdInfoList(List<StandardIdInfo> standardIdInfoList) {
		this.standardIdInfoList = standardIdInfoList;
	}
	public List<StandardIdInfo> getStandardIdInfoList( ) {
		return this.standardIdInfoList;
	}

}
