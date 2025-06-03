package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除签到规则
 *
 * @author auto create
 * @since 1.0, 2025-04-29 14:17:57
 */
public class AlipayCommerceEducateCheckinRuleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3196886291743636377L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
