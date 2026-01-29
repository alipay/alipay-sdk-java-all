package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.treasury.payment.accept response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-13 16:55:33
 */
public class AlipayDigitalmgmtTreasuryPaymentAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 8234869626747964542L;

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
