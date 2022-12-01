package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-27 14:56:37
 */
public class AlipayCommerceOperationTimescardRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6112987526857131645L;

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
