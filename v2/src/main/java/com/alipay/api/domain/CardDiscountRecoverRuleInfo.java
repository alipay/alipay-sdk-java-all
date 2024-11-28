package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠追回规则
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardDiscountRecoverRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1451635926854515734L;

	/**
	 * 周期付
	 */
	@ApiField("industry_solution_type")
	private String industrySolutionType;

	/**
	 * 满xxx期后允许取消
	 */
	@ApiField("least_period")
	private Long leastPeriod;

	/**
	 * 需要优惠追回
	 */
	@ApiField("recover_rule")
	private String recoverRule;

	public String getIndustrySolutionType() {
		return this.industrySolutionType;
	}
	public void setIndustrySolutionType(String industrySolutionType) {
		this.industrySolutionType = industrySolutionType;
	}

	public Long getLeastPeriod() {
		return this.leastPeriod;
	}
	public void setLeastPeriod(Long leastPeriod) {
		this.leastPeriod = leastPeriod;
	}

	public String getRecoverRule() {
		return this.recoverRule;
	}
	public void setRecoverRule(String recoverRule) {
		this.recoverRule = recoverRule;
	}

}
