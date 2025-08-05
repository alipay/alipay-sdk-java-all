package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金规则
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:41:57
 */
public class BreakCosts extends AlipayObject {

	private static final long serialVersionUID = 8833182597799952389L;

	/**
	 * 收取剩余金额的15%作为违约金
	 */
	@ApiField("break_costs_rate")
	private String breakCostsRate;

	/**
	 * DamagesTypeEnum REMAIN_RATE：剩余比例;DEFAULT:默认不收违约金
	 */
	@ApiField("break_costs_type")
	private String breakCostsType;

	public String getBreakCostsRate() {
		return this.breakCostsRate;
	}
	public void setBreakCostsRate(String breakCostsRate) {
		this.breakCostsRate = breakCostsRate;
	}

	public String getBreakCostsType() {
		return this.breakCostsType;
	}
	public void setBreakCostsType(String breakCostsType) {
		this.breakCostsType = breakCostsType;
	}

}
