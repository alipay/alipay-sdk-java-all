package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.treasury.payment.accept response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:52:55
 */
public class AlipayDigitalmgmtTreasuryPaymentAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153757984313139222L;

	/** 
	 * 受理单ID
	 */
	@ApiField("payment_accept_id")
	private String paymentAcceptId;

	/** 
	 * 付款受理是否成功，true-成功 false-失败
	 */
	@ApiField("payment_accept_success")
	private Boolean paymentAcceptSuccess;

	public void setPaymentAcceptId(String paymentAcceptId) {
		this.paymentAcceptId = paymentAcceptId;
	}
	public String getPaymentAcceptId( ) {
		return this.paymentAcceptId;
	}

	public void setPaymentAcceptSuccess(Boolean paymentAcceptSuccess) {
		this.paymentAcceptSuccess = paymentAcceptSuccess;
	}
	public Boolean getPaymentAcceptSuccess( ) {
		return this.paymentAcceptSuccess;
	}

}
