package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-03 14:27:32
 */
public class CommerceRefundDetail extends AlipayObject {

	private static final long serialVersionUID = 8487541812524362436L;

	/**
	 * 原支付流水号
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/**
	 * 该笔交易退款金额，单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 该笔交易对应的退款流水号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 该笔交易退款状态
	 */
	@ApiField("status")
	private String status;

	public String getPayTradeNo() {
		return this.payTradeNo;
	}
	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
