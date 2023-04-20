package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度退款记录
 *
 * @author auto create
 * @since 1.0, 2022-12-14 16:05:54
 */
public class ExpenseControlQuotaRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 6458422329393244583L;

	/**
	 * 退款金额
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
