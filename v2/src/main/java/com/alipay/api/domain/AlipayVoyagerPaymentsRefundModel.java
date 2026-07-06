package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager支付退款接口
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:12:57
 */
public class AlipayVoyagerPaymentsRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5594393772439448354L;

	/**
	 * 支付单ID
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private MultiCurrencyMoneyDTO refundAmount;

	/**
	 * 退款通知地址
	 */
	@ApiField("refund_notify_url")
	private String refundNotifyUrl;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款请求ID
	 */
	@ApiField("refund_request_id")
	private String refundRequestId;

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public MultiCurrencyMoneyDTO getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(MultiCurrencyMoneyDTO refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundNotifyUrl() {
		return this.refundNotifyUrl;
	}
	public void setRefundNotifyUrl(String refundNotifyUrl) {
		this.refundNotifyUrl = refundNotifyUrl;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundRequestId() {
		return this.refundRequestId;
	}
	public void setRefundRequestId(String refundRequestId) {
		this.refundRequestId = refundRequestId;
	}

}
