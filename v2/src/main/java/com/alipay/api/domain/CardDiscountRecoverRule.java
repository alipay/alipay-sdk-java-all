package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠追回规则
 *
 * @author auto create
 * @since 1.0, 2024-04-29 14:15:17
 */
public class CardDiscountRecoverRule extends AlipayObject {

	private static final long serialVersionUID = 1387131315566829842L;

	/**
	 * 用户使用满多少期后才允许用户主动解约，不传默认不允许用户主动解约
	 */
	@ApiField("least_period")
	private Long leastPeriod;

	/**
	 * 配置了允许解约期数后，该字段控制用户发起解约后是否需要优惠追回
	 */
	@ApiField("recover_rule")
	private String recoverRule;

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
