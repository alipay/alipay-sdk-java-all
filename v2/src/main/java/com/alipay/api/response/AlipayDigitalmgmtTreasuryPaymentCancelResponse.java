package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.treasury.payment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 11:12:44
 */
public class AlipayDigitalmgmtTreasuryPaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4521873788771166245L;

	/** 
	 * 付款撤销是否成功 true=成功 false=失败
	 */
	@ApiField("payment_cancel_success")
	private Boolean paymentCancelSuccess;

	public void setPaymentCancelSuccess(Boolean paymentCancelSuccess) {
		this.paymentCancelSuccess = paymentCancelSuccess;
	}
	public Boolean getPaymentCancelSuccess( ) {
		return this.paymentCancelSuccess;
	}

}
