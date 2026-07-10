package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消未支付的尾款
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class AlipayCommerceMerchantcardTailpaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5112413787246476989L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 尾款id
	 */
	@ApiField("tail_payment_id")
	private String tailPaymentId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getTailPaymentId() {
		return this.tailPaymentId;
	}
	public void setTailPaymentId(String tailPaymentId) {
		this.tailPaymentId = tailPaymentId;
	}

}
