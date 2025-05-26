package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益金额信息
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class BenefitAmountInfo extends AlipayObject {

	private static final long serialVersionUID = 5814893664694851491L;

	/**
	 * 可用面额
	 */
	@ApiField("benefit_available_amount")
	private Amount benefitAvailableAmount;

	/**
	 * 总面额
	 */
	@ApiField("benefit_total_amount")
	private Amount benefitTotalAmount;

	public Amount getBenefitAvailableAmount() {
		return this.benefitAvailableAmount;
	}
	public void setBenefitAvailableAmount(Amount benefitAvailableAmount) {
		this.benefitAvailableAmount = benefitAvailableAmount;
	}

	public Amount getBenefitTotalAmount() {
		return this.benefitTotalAmount;
	}
	public void setBenefitTotalAmount(Amount benefitTotalAmount) {
		this.benefitTotalAmount = benefitTotalAmount;
	}

}
