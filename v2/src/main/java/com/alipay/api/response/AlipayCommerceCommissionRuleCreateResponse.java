package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.commission.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:42:55
 */
public class AlipayCommerceCommissionRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8684583532969145796L;

	/** 
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleId( ) {
		return this.ruleId;
	}

}
