package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.applyrule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 13:40:09
 */
public class AlipayCommerceMallApplyruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3371639668745645979L;

	/** 
	 * 操作的规则id
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
