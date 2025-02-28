package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能立减规则
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:21
 */
public class DtBankPreferenceIntelligentRule extends AlipayObject {

	private static final long serialVersionUID = 1321928951566414159L;

	/**
	 * 平均优惠金额，单位分
	 */
	@ApiField("avg_discount_amount")
	private Long avgDiscountAmount;

	/**
	 * 最大优惠金额，单位分
	 */
	@ApiField("max_amount")
	private Long maxAmount;

	/**
	 * 最小优惠金额，单位分
	 */
	@ApiField("min_amount")
	private Long minAmount;

	/**
	 * 智能立减优惠目标
moreUsers:覆盖更多用户
lowerAvgPrice:平均金额更低
MORE_GMV:交易规模更大
MORE_USER_RANGE:覆盖更多用户
	 */
	@ApiField("optimization_target")
	private String optimizationTarget;

	public Long getAvgDiscountAmount() {
		return this.avgDiscountAmount;
	}
	public void setAvgDiscountAmount(Long avgDiscountAmount) {
		this.avgDiscountAmount = avgDiscountAmount;
	}

	public Long getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}

	public String getOptimizationTarget() {
		return this.optimizationTarget;
	}
	public void setOptimizationTarget(String optimizationTarget) {
		this.optimizationTarget = optimizationTarget;
	}

}
