package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻GO周期扣配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:00:06
 */
public class ZMGOCycleWithholdConfig extends AlipayObject {

	private static final long serialVersionUID = 2314336732615675754L;

	/**
	 * 扣款计划
	 */
	@ApiListField("deduct_plan")
	@ApiField("string")
	private List<String> deductPlan;

	/**
	 * 豁免期天数
	 */
	@ApiField("exemption_period")
	private String exemptionPeriod;

	/**
	 * 周期
	 */
	@ApiField("period")
	private String period;

	/**
	 * 扣款周期类型，支持DAY-天模式，MONTH-月模式
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 是否支持周期扣高级模式，高级模式下扣款计划中内一起的扣款金额可以进行定制
	 */
	@ApiField("support_cycle_withhold_high_mode")
	private Boolean supportCycleWithholdHighMode;

	/**
	 * 是否支持豁免期，如果支持豁免期，用户开通后再豁免期内退出无需扣款
	 */
	@ApiField("support_exemption_period")
	private Boolean supportExemptionPeriod;

	/**
	 * 设置扣款模式，目前支持每月固定日期或固定时间间隔
	 */
	@ApiField("withhold_mode")
	private String withholdMode;

	public List<String> getDeductPlan() {
		return this.deductPlan;
	}
	public void setDeductPlan(List<String> deductPlan) {
		this.deductPlan = deductPlan;
	}

	public String getExemptionPeriod() {
		return this.exemptionPeriod;
	}
	public void setExemptionPeriod(String exemptionPeriod) {
		this.exemptionPeriod = exemptionPeriod;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public Boolean getSupportCycleWithholdHighMode() {
		return this.supportCycleWithholdHighMode;
	}
	public void setSupportCycleWithholdHighMode(Boolean supportCycleWithholdHighMode) {
		this.supportCycleWithholdHighMode = supportCycleWithholdHighMode;
	}

	public Boolean getSupportExemptionPeriod() {
		return this.supportExemptionPeriod;
	}
	public void setSupportExemptionPeriod(Boolean supportExemptionPeriod) {
		this.supportExemptionPeriod = supportExemptionPeriod;
	}

	public String getWithholdMode() {
		return this.withholdMode;
	}
	public void setWithholdMode(String withholdMode) {
		this.withholdMode = withholdMode;
	}

}
