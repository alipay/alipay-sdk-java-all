package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益领用使用规则
 *
 * @author auto create
 * @since 1.0, 2022-11-14 18:44:36
 */
public class BenefitUseRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 8263918682985182537L;

	/**
	 * 权益使用规则
	 */
	@ApiField("benefit_use_limit")
	private BenefitUseLimitDTO benefitUseLimit;

	/**
	 * 权益生效时间
	 */
	@ApiField("benefit_valid_period")
	private BenefitValidPeriodDTO benefitValidPeriod;

	/**
	 * 权益的使用范围
	 */
	@ApiField("usage_scope")
	private BenefitUsageScopeDTO usageScope;

	public BenefitUseLimitDTO getBenefitUseLimit() {
		return this.benefitUseLimit;
	}
	public void setBenefitUseLimit(BenefitUseLimitDTO benefitUseLimit) {
		this.benefitUseLimit = benefitUseLimit;
	}

	public BenefitValidPeriodDTO getBenefitValidPeriod() {
		return this.benefitValidPeriod;
	}
	public void setBenefitValidPeriod(BenefitValidPeriodDTO benefitValidPeriod) {
		this.benefitValidPeriod = benefitValidPeriod;
	}

	public BenefitUsageScopeDTO getUsageScope() {
		return this.usageScope;
	}
	public void setUsageScope(BenefitUsageScopeDTO usageScope) {
		this.usageScope = usageScope;
	}

}
