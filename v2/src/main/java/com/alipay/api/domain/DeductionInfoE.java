package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款信息
 *
 * @author auto create
 * @since 1.0, 2026-10-15 13:12:59
 */
public class DeductionInfoE extends AlipayObject {

	private static final long serialVersionUID = 5448419554841775277L;

	/**
	 * 扣除金额，单位：元
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣除原因
	 */
	@ApiField("deduction_reason")
	private String deductionReason;

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionReason() {
		return this.deductionReason;
	}
	public void setDeductionReason(String deductionReason) {
		this.deductionReason = deductionReason;
	}

}
