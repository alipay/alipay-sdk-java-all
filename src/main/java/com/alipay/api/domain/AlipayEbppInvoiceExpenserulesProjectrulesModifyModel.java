package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改项目费控规则
 *
 * @author auto create
 * @since 1.0, 2021-07-12 15:47:02
 */
public class AlipayEbppInvoiceExpenserulesProjectrulesModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5361126626297511144L;

	/**
	 * 企业id-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 修改规则组中的规则明细-MODIFY_RULE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 规则组列表
	 */
	@ApiListField("expense_ctrl_rule_info_group_list")
	@ApiField("expense_ctr_rule_group_info")
	private List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

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

	public List<ExpenseCtrRuleGroupInfo> getExpenseCtrlRuleInfoGroupList() {
		return this.expenseCtrlRuleInfoGroupList;
	}
	public void setExpenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
		this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
