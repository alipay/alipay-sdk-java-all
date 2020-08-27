package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.rulegroup.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:40
 */
public class AlipayAccountCashpoolRulegroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6727519481538528817L;

	/** 
	 * 规则组ID
	 */
	@ApiField("rule_group_id")
	private String ruleGroupId;

	public void setRuleGroupId(String ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
	}
	public String getRuleGroupId( ) {
		return this.ruleGroupId;
	}

}
