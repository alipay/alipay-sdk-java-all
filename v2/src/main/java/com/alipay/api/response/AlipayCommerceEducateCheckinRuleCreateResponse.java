package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 10:52:42
 */
public class AlipayCommerceEducateCheckinRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3396684664675466268L;

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
