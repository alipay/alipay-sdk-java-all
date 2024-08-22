package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分档或阶梯减时的优惠规则设置，比如起步金额及优惠金额
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:51:42
 */
public class MStepCashRule extends AlipayObject {

	private static final long serialVersionUID = 7484336255594531663L;

	/**
	 * 优惠金额(单位:分)
	 */
	@ApiField("reduction_amount")
	private Long reductionAmount;

	/**
	 * 起步金额(单位:分)
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	public Long getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(Long reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

}
