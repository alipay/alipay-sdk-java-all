package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金豁免规则(免违约金规则)
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:41:57
 */
public class BreakCostsExemptRule extends AlipayObject {

	private static final long serialVersionUID = 3423238762958877726L;

	/**
	 * 购卡7天内退卡不收违约金
	 */
	@ApiField("break_costs_7_days")
	private String breakCosts7Days;

	/**
	 * 过期后不收取违约金
	 */
	@ApiField("break_costs_expired")
	private String breakCostsExpired;

	/**
	 * 01-支持核销免违约金
	 */
	@ApiField("no_break_costs_flag")
	private String noBreakCostsFlag;

	/**
	 * 支持用户核销10期后退卡免违约金（当为金额卡的话为10分，当为周期卡为10期，当为次卡时为10次）
	 */
	@ApiField("no_break_costs_standard_value")
	private String noBreakCostsStandardValue;

	public String getBreakCosts7Days() {
		return this.breakCosts7Days;
	}
	public void setBreakCosts7Days(String breakCosts7Days) {
		this.breakCosts7Days = breakCosts7Days;
	}

	public String getBreakCostsExpired() {
		return this.breakCostsExpired;
	}
	public void setBreakCostsExpired(String breakCostsExpired) {
		this.breakCostsExpired = breakCostsExpired;
	}

	public String getNoBreakCostsFlag() {
		return this.noBreakCostsFlag;
	}
	public void setNoBreakCostsFlag(String noBreakCostsFlag) {
		this.noBreakCostsFlag = noBreakCostsFlag;
	}

	public String getNoBreakCostsStandardValue() {
		return this.noBreakCostsStandardValue;
	}
	public void setNoBreakCostsStandardValue(String noBreakCostsStandardValue) {
		this.noBreakCostsStandardValue = noBreakCostsStandardValue;
	}

}
