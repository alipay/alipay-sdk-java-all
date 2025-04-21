package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠类型信息
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:21
 */
public class DtBankPreferenceTypeInfo extends AlipayObject {

	private static final long serialVersionUID = 3758731854241211281L;

	/**
	 * 折扣立减规则，preference_type取值为discount时，此参数有值
	 */
	@ApiField("discount_rule")
	private DtBankPreferenceDiscountRule discountRule;

	/**
	 * 智能立减规则，preference_type取值为intelligentAlgorithm时，此参数有值。
	 */
	@ApiField("intelligent_rule")
	private DtBankPreferenceIntelligentRule intelligentRule;

	/**
	 * 多阶梯立减规则，preference_type取值为multiStagedDiscount时，此参数有值
	 */
	@ApiField("multi_staged_rule")
	private DtBankPreferenceMultiStagedRule multiStagedRule;

	/**
	 * 优惠类型
	 */
	@ApiField("preference_type")
	private String preferenceType;

	/**
	 * 随机金额立减(随机满减)规则，preference_type取值为random时，此参数有值。
	 */
	@ApiField("random_rule")
	private DtBankPreferenceRandomRule randomRule;

	/**
	 * 定额立减(定额满减)规则，preference_type取值为single时，此参数有值
	 */
	@ApiField("single_rule")
	private DtBankPreferenceSingleRule singleRule;

	/**
	 * 核销门槛，单位分
	 */
	@ApiField("use_threshold")
	private Long useThreshold;

	public DtBankPreferenceDiscountRule getDiscountRule() {
		return this.discountRule;
	}
	public void setDiscountRule(DtBankPreferenceDiscountRule discountRule) {
		this.discountRule = discountRule;
	}

	public DtBankPreferenceIntelligentRule getIntelligentRule() {
		return this.intelligentRule;
	}
	public void setIntelligentRule(DtBankPreferenceIntelligentRule intelligentRule) {
		this.intelligentRule = intelligentRule;
	}

	public DtBankPreferenceMultiStagedRule getMultiStagedRule() {
		return this.multiStagedRule;
	}
	public void setMultiStagedRule(DtBankPreferenceMultiStagedRule multiStagedRule) {
		this.multiStagedRule = multiStagedRule;
	}

	public String getPreferenceType() {
		return this.preferenceType;
	}
	public void setPreferenceType(String preferenceType) {
		this.preferenceType = preferenceType;
	}

	public DtBankPreferenceRandomRule getRandomRule() {
		return this.randomRule;
	}
	public void setRandomRule(DtBankPreferenceRandomRule randomRule) {
		this.randomRule = randomRule;
	}

	public DtBankPreferenceSingleRule getSingleRule() {
		return this.singleRule;
	}
	public void setSingleRule(DtBankPreferenceSingleRule singleRule) {
		this.singleRule = singleRule;
	}

	public Long getUseThreshold() {
		return this.useThreshold;
	}
	public void setUseThreshold(Long useThreshold) {
		this.useThreshold = useThreshold;
	}

}
