package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销时间规则
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class VoucherUseTimeRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1819246519862743613L;

	/**
	 * 日期规则。当ruleType = DATE时，不能为空
	 */
	@ApiField("date_rule_info")
	private DateRuleInfo dateRuleInfo;

	/**
	 * 节假日规则。当ruleType = HOLIDAY时，不能为空
	 */
	@ApiField("holiday_rule_info")
	private HolidayRuleInfo holidayRuleInfo;

	/**
	 * 规则类型
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 周期规则。当rule_type = WEEK时，不能为空
	 */
	@ApiField("week_rule_info")
	private WeekRuleInfo weekRuleInfo;

	public DateRuleInfo getDateRuleInfo() {
		return this.dateRuleInfo;
	}
	public void setDateRuleInfo(DateRuleInfo dateRuleInfo) {
		this.dateRuleInfo = dateRuleInfo;
	}

	public HolidayRuleInfo getHolidayRuleInfo() {
		return this.holidayRuleInfo;
	}
	public void setHolidayRuleInfo(HolidayRuleInfo holidayRuleInfo) {
		this.holidayRuleInfo = holidayRuleInfo;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public WeekRuleInfo getWeekRuleInfo() {
		return this.weekRuleInfo;
	}
	public void setWeekRuleInfo(WeekRuleInfo weekRuleInfo) {
		this.weekRuleInfo = weekRuleInfo;
	}

}
