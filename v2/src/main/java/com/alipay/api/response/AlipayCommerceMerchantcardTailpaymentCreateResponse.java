package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.tailpayment.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-15 16:27:45
 */
public class AlipayCommerceMerchantcardTailpaymentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5838316159477787756L;

	/** 
	 * 尾款单id
	 */
	@ApiField("tail_payment_order_id")
	private String tailPaymentOrderId;

	public void setTailPaymentOrderId(String tailPaymentOrderId) {
		this.tailPaymentOrderId = tailPaymentOrderId;
	}
	public String getTailPaymentOrderId( ) {
		return this.tailPaymentOrderId;
	}

}
