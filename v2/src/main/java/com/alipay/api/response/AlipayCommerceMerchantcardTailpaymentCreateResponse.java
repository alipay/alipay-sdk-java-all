package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.tailpayment.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class AlipayCommerceMerchantcardTailpaymentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7269661486932659577L;

	/** 
	 * 尾款id
	 */
	@ApiField("tail_payment_id")
	private String tailPaymentId;

	/** 
	 * 尾款支付链接
	 */
	@ApiField("tail_payment_order_pay_url")
	private String tailPaymentOrderPayUrl;

	public void setTailPaymentId(String tailPaymentId) {
		this.tailPaymentId = tailPaymentId;
	}
	public String getTailPaymentId( ) {
		return this.tailPaymentId;
	}

	public void setTailPaymentOrderPayUrl(String tailPaymentOrderPayUrl) {
		this.tailPaymentOrderPayUrl = tailPaymentOrderPayUrl;
	}
	public String getTailPaymentOrderPayUrl( ) {
		return this.tailPaymentOrderPayUrl;
	}

}
