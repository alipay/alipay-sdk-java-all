package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-15 16:12:43
 */
public class ControlRuleVO extends AlipayObject {

	private static final long serialVersionUID = 3439397364535164431L;

	/**
	 * 管控规则的key
	 */
	@ApiField("rule_key")
	private String ruleKey;

	/**
	 * 管控规则内容
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleKey() {
		return this.ruleKey;
	}
	public void setRuleKey(String ruleKey) {
		this.ruleKey = ruleKey;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
