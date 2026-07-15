package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券结果信息列表
 *
 * @author auto create
 * @since 1.0, 2026-02-04 10:46:40
 */
public class VoucherResultInfo extends AlipayObject {

	private static final long serialVersionUID = 2611994744313379767L;

	/**
	 * 券关联发送订单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 券发送关联订单的信息，用于告知用户是否进行后续处理
	 */
	@ApiField("order_result")
	private String orderResult;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单发生时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 券金额，单位分
	 */
	@ApiField("voucher_amount")
	private Long voucherAmount;

	/**
	 * 券唯一标识
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderResult() {
		return this.orderResult;
	}
	public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Long getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(Long voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
