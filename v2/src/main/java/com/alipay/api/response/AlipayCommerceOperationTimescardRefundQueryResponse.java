package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:22:00
 */
public class AlipayCommerceOperationTimescardRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2163888442349141579L;

	/** 
	 * 可退金额，精确到分
	 */
	@ApiField("refundable_amount")
	private String refundableAmount;

	public void setRefundableAmount(String refundableAmount) {
		this.refundableAmount = refundableAmount;
	}
	public String getRefundableAmount( ) {
		return this.refundableAmount;
	}

}
