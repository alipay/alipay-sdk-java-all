package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款信息
 *
 * @author auto create
 * @since 1.0, 2026-08-18 14:07:51
 */
public class DeductionInfoE extends AlipayObject {

	private static final long serialVersionUID = 3461377854216393871L;

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
