package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.tailpayment.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 14:07:45
 */
public class AlipayCommerceMerchantcardTailpaymentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3399465283462451113L;

	/** 
	 * 尾款单id
	 */
	@ApiField("tail_payment_order_id")
	private String tailPaymentOrderId;

	/** 
	 * 尾款支付链接
	 */
	@ApiField("tail_payment_order_pay_url")
	private String tailPaymentOrderPayUrl;

	public void setTailPaymentOrderId(String tailPaymentOrderId) {
		this.tailPaymentOrderId = tailPaymentOrderId;
	}
	public String getTailPaymentOrderId( ) {
		return this.tailPaymentOrderId;
	}

	public void setTailPaymentOrderPayUrl(String tailPaymentOrderPayUrl) {
		this.tailPaymentOrderPayUrl = tailPaymentOrderPayUrl;
	}
	public String getTailPaymentOrderPayUrl( ) {
		return this.tailPaymentOrderPayUrl;
	}

}
