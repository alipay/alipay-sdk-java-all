package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间淘宝订单
 *
 * @author auto create
 * @since 1.0, 2023-10-17 14:12:15
 */
public class LivestreamOrder extends AlipayObject {

	private static final long serialVersionUID = 2279288367422425112L;

	/**
	 * 订单实付额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 淘宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单付款时间
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 确认收货时间
	 */
	@ApiField("receipt_confirm_time")
	private Date receiptConfirmTime;

	/**
	 * 主播id
	 */
	@ApiField("streamer_id")
	private String streamerId;

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Date getReceiptConfirmTime() {
		return this.receiptConfirmTime;
	}
	public void setReceiptConfirmTime(Date receiptConfirmTime) {
		this.receiptConfirmTime = receiptConfirmTime;
	}

	public String getStreamerId() {
		return this.streamerId;
	}
	public void setStreamerId(String streamerId) {
		this.streamerId = streamerId;
	}

}
