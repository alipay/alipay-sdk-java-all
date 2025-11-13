package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.treasury.payment.accept response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 11:22:40
 */
public class AlipayDigitalmgmtTreasuryPaymentAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 1335553865172442721L;

	/** 
	 * 受理单ID
	 */
	@ApiField("payment_accept_id")
	private String paymentAcceptId;

	public void setPaymentAcceptId(String paymentAcceptId) {
		this.paymentAcceptId = paymentAcceptId;
	}
	public String getPaymentAcceptId( ) {
		return this.paymentAcceptId;
	}

}
