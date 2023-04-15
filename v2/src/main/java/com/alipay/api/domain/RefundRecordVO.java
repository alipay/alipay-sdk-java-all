package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款信息
 *
 * @author auto create
 * @since 1.0, 2023-04-04 20:03:12
 */
public class RefundRecordVO extends AlipayObject {

	private static final long serialVersionUID = 6679532384948653881L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部退款流水号
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 支付系统退款单号
	 */
	@ApiField("refund_id")
	private String refundId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

}
