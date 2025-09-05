package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 19:42:38
 */
public class AlipayCommerceEducateCheckinRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4384349836876424438L;

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
