package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.treasury.payment.accept response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 13:52:43
 */
public class AlipayDigitalmgmtTreasuryPaymentAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 6276955629789151574L;

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
