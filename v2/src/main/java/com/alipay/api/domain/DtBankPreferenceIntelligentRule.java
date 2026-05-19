package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能立减规则
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:59:17
 */
public class DtBankPreferenceIntelligentRule extends AlipayObject {

	private static final long serialVersionUID = 5861626112226671182L;

	/**
	 * 平均优惠金额，单位分
	 */
	@ApiField("avg_discount_amount")
	private Long avgDiscountAmount;

	/**
	 * 优惠均价类型
	 */
	@ApiField("avg_discount_amount_type")
	private String avgDiscountAmountType;

	/**
	 * 指定周期均价配置列表，活动为指定周期均价配置时才会有返回值。
	 */
	@ApiListField("cycle_avg_discount_amount_config_list")
	@ApiField("cycle_avg_discount_amount_config")
	private List<CycleAvgDiscountAmountConfig> cycleAvgDiscountAmountConfigList;

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

	public String getAvgDiscountAmountType() {
		return this.avgDiscountAmountType;
	}
	public void setAvgDiscountAmountType(String avgDiscountAmountType) {
		this.avgDiscountAmountType = avgDiscountAmountType;
	}

	public List<CycleAvgDiscountAmountConfig> getCycleAvgDiscountAmountConfigList() {
		return this.cycleAvgDiscountAmountConfigList;
	}
	public void setCycleAvgDiscountAmountConfigList(List<CycleAvgDiscountAmountConfig> cycleAvgDiscountAmountConfigList) {
		this.cycleAvgDiscountAmountConfigList = cycleAvgDiscountAmountConfigList;
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
