package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费控规则
 *
 * @author auto create
 * @since 1.0, 2023-02-27 20:09:06
 */
public class ExpenseCtrRuleGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 8121725696211351342L;

	/**
	 * 费控条件列表
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 费用类型
特殊说明：仅支持费用类型DEFAULT
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 费控规则ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 费控规则名称
约束：
1）敏感词校验
2）不能重复
	 */
	@ApiField("group_name")
	private String groupName;

	public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
		return this.expenseCtrlRuleInfoList;
	}
	public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
		this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
