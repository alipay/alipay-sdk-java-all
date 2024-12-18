package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群入群规则
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:16:25
 */
public class GroupJoinRuleVO extends AlipayObject {

	private static final long serialVersionUID = 2764455785959959941L;

	/**
	 * 入群规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 入群规则类型
	 */
	@ApiField("rule_type")
	private String ruleType;

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
