package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能立减规则
 *
 * @author auto create
 * @since 1.0, 2023-06-07 09:56:15
 */
public class DtBankPreferenceIntelligentRule extends AlipayObject {

	private static final long serialVersionUID = 1296615995951523891L;

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
	 */
	@ApiField("optimization_target")
	private String optimizationTarget;

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
