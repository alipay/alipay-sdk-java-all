package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充类别信息
 *
 * @author auto create
 * @since 1.0, 2025-07-10 09:48:40
 */
public class SupplementCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 8833583553831841685L;

	/**
	 * 需要补充信息的类别
	 */
	@ApiField("supplement_category")
	private String supplementCategory;

	/**
	 * 需要补充的流水金额，单位分。
	 */
	@ApiField("supplement_payment_amt")
	private Long supplementPaymentAmt;

	public String getSupplementCategory() {
		return this.supplementCategory;
	}
	public void setSupplementCategory(String supplementCategory) {
		this.supplementCategory = supplementCategory;
	}

	public Long getSupplementPaymentAmt() {
		return this.supplementPaymentAmt;
	}
	public void setSupplementPaymentAmt(Long supplementPaymentAmt) {
		this.supplementPaymentAmt = supplementPaymentAmt;
	}

}
