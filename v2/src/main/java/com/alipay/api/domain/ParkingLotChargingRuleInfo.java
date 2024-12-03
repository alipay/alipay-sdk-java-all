package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场详细计费规则
 *
 * @author auto create
 * @since 1.0, 2024-08-12 14:48:17
 */
public class ParkingLotChargingRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4567438136427854663L;

	/**
	 * 停车收费时间段，输入24小时制的小时时间段格式: 
开始时间-结束时间,
结束时间必须大于开始时间
时间取值范围：0到24
	 */
	@ApiField("charging_period")
	private String chargingPeriod;

	/**
	 * 计费策略；
UP：向上取整
DOMN：向下取整
	 */
	@ApiField("charging_strategy")
	private String chargingStrategy;

	/**
	 * 跳费金额 单位元
	 */
	@ApiField("charging_unit_fee")
	private String chargingUnitFee;

	/**
	 * 跳费间隔分钟数
	 */
	@ApiField("charging_unit_minutes")
	private String chargingUnitMinutes;

	/**
	 * 超时是否顺延到下个计费区间
	 */
	@ApiField("enable_rollover_charge_period")
	private Boolean enableRolloverChargePeriod;

	/**
	 * 首段计费周期分钟数
	 */
	@ApiField("first_charging_span_minutes")
	private String firstChargingSpanMinutes;

	/**
	 * 首段计费周期跳费金额 单位: 元
	 */
	@ApiField("first_charging_unit_fee")
	private String firstChargingUnitFee;

	/**
	 * 首段计费周期跳费间隔 单位分钟
	 */
	@ApiField("first_charging_unit_minutes")
	private String firstChargingUnitMinutes;

	/**
	 * 入场免费时间 单位:分钟
	 */
	@ApiField("free_enter_minutes")
	private String freeEnterMinutes;

	/**
	 * 离场免费时间 单位:分钟
	 */
	@ApiField("free_exit_minutes")
	private String freeExitMinutes;

	/**
	 * 日封顶金额 单位: 元
	 */
	@ApiField("max_fee_per_day")
	private String maxFeePerDay;

	public String getChargingPeriod() {
		return this.chargingPeriod;
	}
	public void setChargingPeriod(String chargingPeriod) {
		this.chargingPeriod = chargingPeriod;
	}

	public String getChargingStrategy() {
		return this.chargingStrategy;
	}
	public void setChargingStrategy(String chargingStrategy) {
		this.chargingStrategy = chargingStrategy;
	}

	public String getChargingUnitFee() {
		return this.chargingUnitFee;
	}
	public void setChargingUnitFee(String chargingUnitFee) {
		this.chargingUnitFee = chargingUnitFee;
	}

	public String getChargingUnitMinutes() {
		return this.chargingUnitMinutes;
	}
	public void setChargingUnitMinutes(String chargingUnitMinutes) {
		this.chargingUnitMinutes = chargingUnitMinutes;
	}

	public Boolean getEnableRolloverChargePeriod() {
		return this.enableRolloverChargePeriod;
	}
	public void setEnableRolloverChargePeriod(Boolean enableRolloverChargePeriod) {
		this.enableRolloverChargePeriod = enableRolloverChargePeriod;
	}

	public String getFirstChargingSpanMinutes() {
		return this.firstChargingSpanMinutes;
	}
	public void setFirstChargingSpanMinutes(String firstChargingSpanMinutes) {
		this.firstChargingSpanMinutes = firstChargingSpanMinutes;
	}

	public String getFirstChargingUnitFee() {
		return this.firstChargingUnitFee;
	}
	public void setFirstChargingUnitFee(String firstChargingUnitFee) {
		this.firstChargingUnitFee = firstChargingUnitFee;
	}

	public String getFirstChargingUnitMinutes() {
		return this.firstChargingUnitMinutes;
	}
	public void setFirstChargingUnitMinutes(String firstChargingUnitMinutes) {
		this.firstChargingUnitMinutes = firstChargingUnitMinutes;
	}

	public String getFreeEnterMinutes() {
		return this.freeEnterMinutes;
	}
	public void setFreeEnterMinutes(String freeEnterMinutes) {
		this.freeEnterMinutes = freeEnterMinutes;
	}

	public String getFreeExitMinutes() {
		return this.freeExitMinutes;
	}
	public void setFreeExitMinutes(String freeExitMinutes) {
		this.freeExitMinutes = freeExitMinutes;
	}

	public String getMaxFeePerDay() {
		return this.maxFeePerDay;
	}
	public void setMaxFeePerDay(String maxFeePerDay) {
		this.maxFeePerDay = maxFeePerDay;
	}

}
