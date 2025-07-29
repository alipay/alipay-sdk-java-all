package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 11:07:33
 */
public class AlipayCommerceEducateCheckinRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896697593297528476L;

	/** 
	 * 签到规则id
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
