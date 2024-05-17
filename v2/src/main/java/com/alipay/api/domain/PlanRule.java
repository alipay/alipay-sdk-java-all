package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案规则
 *
 * @author auto create
 * @since 1.0, 2017-09-15 15:52:22
 */
public class PlanRule extends AlipayObject {

	private static final long serialVersionUID = 6355142532133539999L;

	/**
	 * 当rule_type=FIXED 时,固定值有效
	 */
	@ApiField("fixed_value")
	private String fixedValue;

	/**
	 * 当rule_type=RANGE 时，range_end_value表示区间结束值
	 */
	@ApiField("range_end_value")
	private String rangeEndValue;

	/**
	 * 当rule_type=RANGE 时，range_start_value表示区间起始值
	 */
	@ApiField("range_start_value")
	private String rangeStartValue;

	/**
	 * voucher_type表示券的类型，目前只支持MONEY或RATE类型
	 */
	@ApiField("rule_desc")
	private String ruleDesc;

	/**
	 * 规则名称,目前只支持activity_type|活动类型,券类型|voucher_type,券数量|voucher_count,券logo| logo,代金券面额| worth_value,代金券券最低消费金额| mini_consume, 折扣| rate,最高优惠金额| max_amount,券的备注| voucher_note,券有效期类型| validate_type,券相对有效期| relative_time,绝对有效期开始时间| fix_start_time,绝对有效期结束时间| fix_end_time,券使用时间段|use_time,活动预算数量| budget_total,用户领取频次| user_win_frequency
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * FIXED表示固定值，RANGE表示区间
	 */
	@ApiField("rule_type")
	private String ruleType;

	public String getFixedValue() {
		return this.fixedValue;
	}
	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public String getRangeEndValue() {
		return this.rangeEndValue;
	}
	public void setRangeEndValue(String rangeEndValue) {
		this.rangeEndValue = rangeEndValue;
	}

	public String getRangeStartValue() {
		return this.rangeStartValue;
	}
	public void setRangeStartValue(String rangeStartValue) {
		this.rangeStartValue = rangeStartValue;
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
