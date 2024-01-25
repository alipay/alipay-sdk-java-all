package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规则
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:51:36
 */
public class RuleVO extends AlipayObject {

	private static final long serialVersionUID = 7236939835923739559L;

	/**
	 * 模块code
	 */
	@ApiField("module_code")
	private String moduleCode;

	/**
	 * 规则条件原始文本
	 */
	@ApiField("rule_conditions")
	private String ruleConditions;

	public String getModuleCode() {
		return this.moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getRuleConditions() {
		return this.ruleConditions;
	}
	public void setRuleConditions(String ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

}
