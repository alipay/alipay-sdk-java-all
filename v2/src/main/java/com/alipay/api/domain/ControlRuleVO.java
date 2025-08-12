package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-10 11:28:20
 */
public class ControlRuleVO extends AlipayObject {

	private static final long serialVersionUID = 5162651618833645199L;

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
