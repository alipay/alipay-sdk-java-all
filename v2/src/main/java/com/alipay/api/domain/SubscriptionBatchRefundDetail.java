package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅批量退款明细
 *
 * @author auto create
 * @since 1.0, 2026-07-15 10:07:35
 */
public class SubscriptionBatchRefundDetail extends AlipayObject {

	private static final long serialVersionUID = 6349982474899949262L;

	/**
	 * 当前退款单对应的对款金额，单位元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款单状态，如果是PENDING状态，则会继续重试退款
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 实际退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 退款的交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 针对当前的交易单号对应的退款单号，针对一笔交易单trade_no允许多次退款。多次退款时，每次退款的id不同即可
	 */
	@ApiField("trade_refund_id")
	private String tradeRefundId;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeRefundId() {
		return this.tradeRefundId;
	}
	public void setTradeRefundId(String tradeRefundId) {
		this.tradeRefundId = tradeRefundId;
	}

}
