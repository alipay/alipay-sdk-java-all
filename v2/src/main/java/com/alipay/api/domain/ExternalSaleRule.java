package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售规则
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:41
 */
public class ExternalSaleRule extends AlipayObject {

	private static final long serialVersionUID = 6827965354512373279L;

	/**
	 * 最大单次购买数量PER_ORDER_MAX_BUY_COUNT      购买人年龄限制BUYER_AGE_LIMIT      购买人性别限制BUYER_GENDER_LIMIT
	 */
	@ApiField("rule_key")
	private String ruleKey;

	/**
	 * 最大单次购买数量PER_ORDER_MAX_BUY_COUNT   value: 非负整数(0不限制)      

购买人年龄限制BUYER_AGE_LIMIT   
value:  NONE/UNDER_18/OVER_18      

购买人性别限制BUYER_GENDER_LIMIT   
value: NONE/MALE/FEMALE
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleKey() {
		return this.ruleKey;
	}
	public void setRuleKey(String ruleKey) {
		this.ruleKey = ruleKey;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
