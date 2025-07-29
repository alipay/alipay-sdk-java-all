package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群广告屏蔽修改状态
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:25
 */
public class AlipayMerchantGroupGroupcontrolStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7563931968982253776L;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
