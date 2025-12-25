package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单阶段租金计费规则,单阶段必填
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class DynamicRentBillingRuleSingleStageDTO extends AlipayObject {

	private static final long serialVersionUID = 7854479352457273756L;

	/**
	 * 计费上限(单位元),最多2位小数
	 */
	@ApiField("billing_cap")
	private String billingCap;

	/**
	 * 期数单位为晚时使用,超过整点算一期,如果14则表示每日超过14点算一个新计费周期
	 */
	@ApiField("cycle_hour")
	private Long cycleHour;

	/**
	 * 每期租金(单位元),最多2位小数
	 */
	@ApiField("period_rent_amount")
	private String periodRentAmount;

	/**
	 * 分钟: MINUTE;小时: HOUR;
晚（酒店住宿用）: NIGHT;
天: DAY;
周: WEEK;
月: MONTH;
	 */
	@ApiField("period_unit")
	private String periodUnit;

	/**
	 * 例：每期时间单位是分钟, 每期时间数值15, 那就是每15分钟是一个计费周期
	 */
	@ApiField("period_unit_num")
	private Long periodUnitNum;

	public String getBillingCap() {
		return this.billingCap;
	}
	public void setBillingCap(String billingCap) {
		this.billingCap = billingCap;
	}

	public Long getCycleHour() {
		return this.cycleHour;
	}
	public void setCycleHour(Long cycleHour) {
		this.cycleHour = cycleHour;
	}

	public String getPeriodRentAmount() {
		return this.periodRentAmount;
	}
	public void setPeriodRentAmount(String periodRentAmount) {
		this.periodRentAmount = periodRentAmount;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}
	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public Long getPeriodUnitNum() {
		return this.periodUnitNum;
	}
	public void setPeriodUnitNum(Long periodUnitNum) {
		this.periodUnitNum = periodUnitNum;
	}

}
