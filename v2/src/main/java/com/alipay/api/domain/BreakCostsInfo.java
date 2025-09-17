package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金信息
 *
 * @author auto create
 * @since 1.0, 2025-04-28 22:35:21
 */
public class BreakCostsInfo extends AlipayObject {

	private static final long serialVersionUID = 4262146846786187616L;

	/**
	 * 卡到期后是否收取违约金，默认01
	 */
	@ApiField("break_costs_expired")
	private String breakCostsExpired;

	/**
	 * 7天内退卡是否收取违约金，默认02
	 */
	@ApiField("break_costs_seven_days")
	private String breakCostsSevenDays;

	/**
	 * 当违约金类型是REMAIN_RATE时必传，需要设置违约金的收取按照剩余金额的多少比例计算，如30代表30%
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	/**
	 * 用于设置是否支持免违约金规则
	 */
	@ApiField("no_break_costs_flag")
	private String noBreakCostsFlag;

	/**
	 * 免违约金单位，无需传参，后台根据卡类型自动设置值。
	 */
	@ApiField("no_break_costs_unit")
	private String noBreakCostsUnit;

	/**
	 * 免违约金额（单位元）/次数/期数
	 */
	@ApiField("no_break_costs_value")
	private String noBreakCostsValue;

	public String getBreakCostsExpired() {
		return this.breakCostsExpired;
	}
	public void setBreakCostsExpired(String breakCostsExpired) {
		this.breakCostsExpired = breakCostsExpired;
	}

	public String getBreakCostsSevenDays() {
		return this.breakCostsSevenDays;
	}
	public void setBreakCostsSevenDays(String breakCostsSevenDays) {
		this.breakCostsSevenDays = breakCostsSevenDays;
	}

	public String getDamagesRate() {
		return this.damagesRate;
	}
	public void setDamagesRate(String damagesRate) {
		this.damagesRate = damagesRate;
	}

	public String getDamagesType() {
		return this.damagesType;
	}
	public void setDamagesType(String damagesType) {
		this.damagesType = damagesType;
	}

	public String getNoBreakCostsFlag() {
		return this.noBreakCostsFlag;
	}
	public void setNoBreakCostsFlag(String noBreakCostsFlag) {
		this.noBreakCostsFlag = noBreakCostsFlag;
	}

	public String getNoBreakCostsUnit() {
		return this.noBreakCostsUnit;
	}
	public void setNoBreakCostsUnit(String noBreakCostsUnit) {
		this.noBreakCostsUnit = noBreakCostsUnit;
	}

	public String getNoBreakCostsValue() {
		return this.noBreakCostsValue;
	}
	public void setNoBreakCostsValue(String noBreakCostsValue) {
		this.noBreakCostsValue = noBreakCostsValue;
	}

}
