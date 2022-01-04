package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池调拨规则新增
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:31
 */
public class AlipayAccountCashpoolAllocateruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6493253816424156396L;

	/**
	 * 转账规则
	 */
	@ApiField("allocation_rule")
	private InstCashPoolAllocationRuleVO allocationRule;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 对应的规则组ID
	 */
	@ApiField("rule_group_id")
	private String ruleGroupId;

	public InstCashPoolAllocationRuleVO getAllocationRule() {
		return this.allocationRule;
	}
	public void setAllocationRule(InstCashPoolAllocationRuleVO allocationRule) {
		this.allocationRule = allocationRule;
	}

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRuleGroupId() {
		return this.ruleGroupId;
	}
	public void setRuleGroupId(String ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
	}

}
