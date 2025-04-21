package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用规则条件列表
 *
 * @author auto create
 * @since 1.0, 2024-11-20 11:38:56
 */
public class StandardConditionInfo extends AlipayObject {

	private static final long serialVersionUID = 3852637785567527417L;

	/**
	 * 条件类型
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
	 * 费控条件操作符 枚举值： LT("<","小于") LE("<=","小于等于") EQ("=","等于") NE("!=","不等于") GE(">=","大于等于") GT(">","大于") 当前字段已废弃(该字段为保留字段，目前未被使用)
	 */
	@ApiField("rule_operator")
	@Deprecated
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
