package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群广告屏蔽详情查询
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:42:32
 */
public class AlipayMerchantGroupGroupcontrolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5881184726871939395L;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
