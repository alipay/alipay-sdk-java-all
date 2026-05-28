package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:47:45
 */
public class ChargerDiscountActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 2472496469113312556L;

	/**
	 * 满减金额，单位：元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 门槛金额，单位：元
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

}
