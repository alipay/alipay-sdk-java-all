package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消未支付的尾款单
 *
 * @author auto create
 * @since 1.0, 2026-05-15 16:27:45
 */
public class AlipayCommerceMerchantcardTailpaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5367771539418796168L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 尾款单id
	 */
	@ApiField("tail_payment_order_id")
	private String tailPaymentOrderId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getTailPaymentOrderId() {
		return this.tailPaymentOrderId;
	}
	public void setTailPaymentOrderId(String tailPaymentOrderId) {
		this.tailPaymentOrderId = tailPaymentOrderId;
	}

}
