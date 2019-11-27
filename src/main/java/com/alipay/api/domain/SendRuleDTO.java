package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @since 1.0, 2016-05-01 19:10:52
 */
public class SendRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 6311358197726598758L;

	/**
	 * 满多少金额才能送券
	 */
	@ApiField("min_cost")
	private String minCost;

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

}
