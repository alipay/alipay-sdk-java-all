package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益价值信息描述
 *
 * @author auto create
 * @since 1.0, 2018-11-28 11:48:56
 */
public class MEquityWorthInfo extends AlipayObject {

	private static final long serialVersionUID = 4216148464527134853L;

	/**
	 * 权益价值信息计算方式，取值枚举：固定计算：FIXED、动态计算：DYNAMIC
	 */
	@ApiField("calculate_type")
	private String calculateType;

	/**
	 * 代金的面额(单位分),取值范围1~499999的整数，仅当type=CASH该字段必填
	 */
	@ApiField("cash_amount")
	private Long cashAmount;

	/**
	 * 权益面额动态规则类型，枚举值：阶梯满减：MULTI_STEP_CASH，仅当calculate_type=DYNAMIC时，该值必填
	 */
	@ApiField("dynamic_rule_type")
	private String dynamicRuleType;

	/**
	 * 最高优惠金额(单位:分)，最高优惠金额设置范围必须在1~499999的整数，只有type=RATE时生效，其他类型无需设置
	 */
	@ApiField("max_discount_amount")
	private String maxDiscountAmount;

	/**
	 * 最高优惠件数，最高优惠件数设置范围值必须在1~99的整数，只有使用限制存在item_info_list单品信息时生效，其他情况无需设置
	 */
	@ApiField("max_discount_count")
	private Long maxDiscountCount;

	/**
	 * 阶梯满减阶梯信息，仅当dynamic_rule_type=MULTI_STEP_CASH时，该值必填
	 */
	@ApiListField("multi_step_cash_rules")
	@ApiField("m_step_cash_rule")
	private List<MStepCashRule> multiStepCashRules;

	/**
	 * 折扣率，取值范围0.11~0.99，至多2位小数，且仅当type=RATE时该值必填
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 减至的金额(单位分)，仅当type=REDUCE_TO时，该值必填
	 */
	@ApiField("reduce_to_amount")
	private Long reduceToAmount;

	/**
	 * 抹零规则，枚举值：不自动抹零：NOT_AUTO_ROUNDING、自动抹零到元：AUTO_ROUNDING_YUAN、自动抹零到角：AUTO_ROUNDING_JIAO、四舍五入到元：ROUNDING_UP_YUAN、四舍五入到角：ROUNDING_UP_JIAO，且当type=RATE时该值必填
	 */
	@ApiField("rounding_type")
	private String roundingType;

	/**
	 * 权益价值类型；枚举值：代金：CASH、折扣：RATE、减至：REDUCE_TO，且仅当calculate_type=FIXED，该字段必填
	 */
	@ApiField("type")
	private String type;

	public String getCalculateType() {
		return this.calculateType;
	}
	public void setCalculateType(String calculateType) {
		this.calculateType = calculateType;
	}

	public Long getCashAmount() {
		return this.cashAmount;
	}
	public void setCashAmount(Long cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getDynamicRuleType() {
		return this.dynamicRuleType;
	}
	public void setDynamicRuleType(String dynamicRuleType) {
		this.dynamicRuleType = dynamicRuleType;
	}

	public String getMaxDiscountAmount() {
		return this.maxDiscountAmount;
	}
	public void setMaxDiscountAmount(String maxDiscountAmount) {
		this.maxDiscountAmount = maxDiscountAmount;
	}

	public Long getMaxDiscountCount() {
		return this.maxDiscountCount;
	}
	public void setMaxDiscountCount(Long maxDiscountCount) {
		this.maxDiscountCount = maxDiscountCount;
	}

	public List<MStepCashRule> getMultiStepCashRules() {
		return this.multiStepCashRules;
	}
	public void setMultiStepCashRules(List<MStepCashRule> multiStepCashRules) {
		this.multiStepCashRules = multiStepCashRules;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public Long getReduceToAmount() {
		return this.reduceToAmount;
	}
	public void setReduceToAmount(Long reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

	public String getRoundingType() {
		return this.roundingType;
	}
	public void setRoundingType(String roundingType) {
		this.roundingType = roundingType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
