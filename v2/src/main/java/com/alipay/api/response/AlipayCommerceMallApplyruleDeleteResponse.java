package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.applyrule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 13:39:55
 */
public class AlipayCommerceMallApplyruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3844634334712841464L;

	/** 
	 * 业务规则id
	 */
	@ApiField("biz_rule_id")
	private String bizRuleId;

	public void setBizRuleId(String bizRuleId) {
		this.bizRuleId = bizRuleId;
	}
	public String getBizRuleId( ) {
		return this.bizRuleId;
	}

}
