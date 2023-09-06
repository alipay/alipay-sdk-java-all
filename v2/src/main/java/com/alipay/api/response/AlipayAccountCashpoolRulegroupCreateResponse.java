package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.rulegroup.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:12:19
 */
public class AlipayAccountCashpoolRulegroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4655246493972782732L;

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
