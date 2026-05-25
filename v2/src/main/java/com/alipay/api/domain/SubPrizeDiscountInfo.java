package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子奖品优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-03-02 14:27:24
 */
public class SubPrizeDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 5723763514927229678L;

	/**
	 * 有门槛
	 */
	@ApiField("exist_discount_threshold")
	private String existDiscountThreshold;

	/**
	 * 红包面额，单位分
	 */
	@ApiField("reduce_amount")
	private Long reduceAmount;

	/**
	 * 门槛，单位分
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	public String getExistDiscountThreshold() {
		return this.existDiscountThreshold;
	}
	public void setExistDiscountThreshold(String existDiscountThreshold) {
		this.existDiscountThreshold = existDiscountThreshold;
	}

	public Long getReduceAmount() {
		return this.reduceAmount;
	}
	public void setReduceAmount(Long reduceAmount) {
		this.reduceAmount = reduceAmount;
	}

	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

}
