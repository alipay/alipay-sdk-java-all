package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.rulegroup.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 16:46:06
 */
public class AlipayAccountCashpoolRulegroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4798238811753975851L;

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
