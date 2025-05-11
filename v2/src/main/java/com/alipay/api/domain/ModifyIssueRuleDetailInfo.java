package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改制度下发放规则信息
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:10:18
 */
public class ModifyIssueRuleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1734544152536953584L;

	/**
	 * 新增发放规则列表
	 */
	@ApiListField("add_issue_rule_list")
	@ApiField("issue_rule_info")
	private List<IssueRuleInfo> addIssueRuleList;

	/**
	 * 删除的发放规则id列表
	 */
	@ApiListField("delete_issue_rule_id_list")
	@ApiField("string")
	private List<String> deleteIssueRuleIdList;

	/**
	 * 修改发放规则列表
	 */
	@ApiField("modify_issue_rule_list")
	private ModifyIssueRuleInfo modifyIssueRuleList;

	public List<IssueRuleInfo> getAddIssueRuleList() {
		return this.addIssueRuleList;
	}
	public void setAddIssueRuleList(List<IssueRuleInfo> addIssueRuleList) {
		this.addIssueRuleList = addIssueRuleList;
	}

	public List<String> getDeleteIssueRuleIdList() {
		return this.deleteIssueRuleIdList;
	}
	public void setDeleteIssueRuleIdList(List<String> deleteIssueRuleIdList) {
		this.deleteIssueRuleIdList = deleteIssueRuleIdList;
	}

	public ModifyIssueRuleInfo getModifyIssueRuleList() {
		return this.modifyIssueRuleList;
	}
	public void setModifyIssueRuleList(ModifyIssueRuleInfo modifyIssueRuleList) {
		this.modifyIssueRuleList = modifyIssueRuleList;
	}

}
