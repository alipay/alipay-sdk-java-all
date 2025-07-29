package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 每期动态类型规则
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class PeriodPayBillingRuleDynamicDTO extends AlipayObject {

	private static final long serialVersionUID = 2836295985399681828L;

	/**
	 * 期数单位为晚时使用,超过整点算一期,如果14则表示每日超过14点算一个新计费周期
	 */
	@ApiField("cycle_hour")
	private Long cycleHour;

	/**
	 * 扣款日期类型
（目前仅对 周/月 周期单位生效）
用户指定扣款日期：USER_APPOINT_DATE
商家指定扣款日期：
MERCHANT_APPOINT_DATE
周、月情况必填
	 */
	@ApiField("deduction_date_type")
	private String deductionDateType;

	/**
	 * 周：1-7
月：1-31
周、月且商家指定扣款日期的情况下必填
	 */
	@ApiField("deduction_day")
	private Long deductionDay;

	/**
	 * 指定首期扣款日期
	 */
	@ApiField("down_payment_date")
	private Date downPaymentDate;

	/**
	 * 总周期数
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 最多2位小数,
数组大小等于计费期数
	 */
	@ApiListField("period_rent_amount_list")
	@ApiField("price")
	private List<String> periodRentAmountList;

	/**
	 * 分钟: MINUTE;
小时: HOUR;
晚（酒店住宿用）: NIGHT;
天: DAY;
周: WEEK;
月: MONTH
	 */
	@ApiField("period_unit")
	private String periodUnit;

	public Long getCycleHour() {
		return this.cycleHour;
	}
	public void setCycleHour(Long cycleHour) {
		this.cycleHour = cycleHour;
	}

	public String getDeductionDateType() {
		return this.deductionDateType;
	}
	public void setDeductionDateType(String deductionDateType) {
		this.deductionDateType = deductionDateType;
	}

	public Long getDeductionDay() {
		return this.deductionDay;
	}
	public void setDeductionDay(Long deductionDay) {
		this.deductionDay = deductionDay;
	}

	public Date getDownPaymentDate() {
		return this.downPaymentDate;
	}
	public void setDownPaymentDate(Date downPaymentDate) {
		this.downPaymentDate = downPaymentDate;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public List<String> getPeriodRentAmountList() {
		return this.periodRentAmountList;
	}
	public void setPeriodRentAmountList(List<String> periodRentAmountList) {
		this.periodRentAmountList = periodRentAmountList;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}
	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

}
