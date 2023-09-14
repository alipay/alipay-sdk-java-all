package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.applyrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-15 11:51:41
 */
public class AlipayCommerceMallApplyruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6795849496318765365L;

	/** 
	 * 创建的规则id
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
