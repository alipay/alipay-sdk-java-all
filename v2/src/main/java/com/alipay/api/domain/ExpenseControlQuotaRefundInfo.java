package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度退款记录
 *
 * @author auto create
 * @since 1.0, 2024-01-30 14:27:49
 */
public class ExpenseControlQuotaRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 4886569924966517668L;

	/**
	 * 退款金额（分）
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款单据号
	 */
	@ApiField("refund_no")
	private String refundNo;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundNo() {
		return this.refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
