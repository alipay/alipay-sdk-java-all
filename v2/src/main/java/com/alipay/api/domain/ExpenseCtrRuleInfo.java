package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费控规则条件
 *
 * @author auto create
 * @since 1.0, 2024-06-07 16:49:16
 */
public class ExpenseCtrRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1834565867587592434L;

	/**
	 * 费控维度
	 */
	@ApiField("rule_factor")
	private String ruleFactor;

	/**
	 * 费控条件ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 费控条件名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 费控条件操作符
枚举值：
LT("<","小于")
LE("<=","小于等于")
EQ("=","等于")
NE("!=","不等于")
GE(">=","大于等于")
GT(">","大于")
	 */
	@ApiField("rule_operator")
	private String ruleOperator;

	/**
	 * 费控条件值
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleFactor() {
		return this.ruleFactor;
	}
	public void setRuleFactor(String ruleFactor) {
		this.ruleFactor = ruleFactor;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleOperator() {
		return this.ruleOperator;
	}
	public void setRuleOperator(String ruleOperator) {
		this.ruleOperator = ruleOperator;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
