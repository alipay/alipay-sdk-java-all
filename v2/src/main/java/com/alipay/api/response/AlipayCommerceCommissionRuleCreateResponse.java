package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.commission.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 10:37:59
 */
public class AlipayCommerceCommissionRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8115398364988862158L;

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
