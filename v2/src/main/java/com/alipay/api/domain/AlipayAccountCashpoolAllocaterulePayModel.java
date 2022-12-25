package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池调拨规则强制执行
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:39
 */
public class AlipayAccountCashpoolAllocaterulePayModel extends AlipayObject {

	private static final long serialVersionUID = 1119246464682975878L;

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
	 * 资金池规则组唯一标识
	 */
	@ApiField("rule_group_id")
	private String ruleGroupId;

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
