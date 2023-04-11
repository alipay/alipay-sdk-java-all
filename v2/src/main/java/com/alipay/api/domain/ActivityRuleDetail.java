package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费活动规则详情，按照rule_type区分。
consume_amount时为：周期(单位默认天)+金额(单位元)+折扣(百分)，e.g.{"period":"7", "amount":"1000", "discount":"88"}，表示7天消费满1000元享受8折优惠；consume_times时为：周期(单位默认天)+次数(单位次)+折扣(百分)，{"period":"30", "times":"10", "discount":"70"}，表示30天内消费满10次享受7折优惠。
 *
 * @author auto create
 * @since 1.0, 2019-05-09 10:34:22
 */
public class ActivityRuleDetail extends AlipayObject {

	private static final long serialVersionUID = 4398551991954929431L;

	/**
	 * 活动规则中用户承诺消费的金额，当consume_type为CONSUME_AMOUNT时启用，单位为元
	 */
	@ApiField("rule_amount")
	private Long ruleAmount;

	/**
	 * 活动规则中用户满足承诺可享受的优惠，单位百分，值为1-100之间，如88折传88，7折传70
	 */
	@ApiField("rule_discount")
	private Long ruleDiscount;

	/**
	 * 承诺消费活动规则周期，单位默认为天，如果传rule_period_unit则和unit组合。
	 */
	@ApiField("rule_period")
	private Long rulePeriod;

	/**
	 * YEAR - 年
MONTH - 月
WEEK - 星期
DAY - 天
	 */
	@ApiField("rule_period_unit")
	private String rulePeriodUnit;

	/**
	 * 活动规则中用户承诺消费次数，当rule_type为CONSUME_TIMES时启用，单位为次。
	 */
	@ApiField("rule_times")
	private Long ruleTimes;

	public Long getRuleAmount() {
		return this.ruleAmount;
	}
	public void setRuleAmount(Long ruleAmount) {
		this.ruleAmount = ruleAmount;
	}

	public Long getRuleDiscount() {
		return this.ruleDiscount;
	}
	public void setRuleDiscount(Long ruleDiscount) {
		this.ruleDiscount = ruleDiscount;
	}

	public Long getRulePeriod() {
		return this.rulePeriod;
	}
	public void setRulePeriod(Long rulePeriod) {
		this.rulePeriod = rulePeriod;
	}

	public String getRulePeriodUnit() {
		return this.rulePeriodUnit;
	}
	public void setRulePeriodUnit(String rulePeriodUnit) {
		this.rulePeriodUnit = rulePeriodUnit;
	}

	public Long getRuleTimes() {
		return this.ruleTimes;
	}
	public void setRuleTimes(Long ruleTimes) {
		this.ruleTimes = ruleTimes;
	}

}
