package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期付租金计费规则
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class PeriodPayBillingRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5348284285263235571L;

	/**
	 * 每期动态类型必填
	 */
	@ApiField("dynamic")
	private PeriodPayBillingRuleDynamicDTO dynamic;

	/**
	 * 每期固定类型必填
	 */
	@ApiField("fixed")
	private PeriodPayBillingRuleFixedDTO fixed;

	/**
	 * FIXED	每期固定：FIXED
每期动态：DYNAMIC
	 */
	@ApiField("type")
	private String type;

	public PeriodPayBillingRuleDynamicDTO getDynamic() {
		return this.dynamic;
	}
	public void setDynamic(PeriodPayBillingRuleDynamicDTO dynamic) {
		this.dynamic = dynamic;
	}

	public PeriodPayBillingRuleFixedDTO getFixed() {
		return this.fixed;
	}
	public void setFixed(PeriodPayBillingRuleFixedDTO fixed) {
		this.fixed = fixed;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
