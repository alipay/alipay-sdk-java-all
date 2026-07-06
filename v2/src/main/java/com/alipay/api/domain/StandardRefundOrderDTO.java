package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款订单
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:57
 */
public class StandardRefundOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 4887975473413391613L;

	/**
	 * 完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 退款单状态，无具体枚举，和响应类型保持一致
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private MultiCurrencyMoneyDTO refundAmount;

	/**
	 * 退款订单id
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/**
	 * 退款请求id
	 */
	@ApiField("refund_request_id")
	private String refundRequestId;

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public MultiCurrencyMoneyDTO getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(MultiCurrencyMoneyDTO refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundOrderId() {
		return this.refundOrderId;
	}
	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}

	public String getRefundRequestId() {
		return this.refundRequestId;
	}
	public void setRefundRequestId(String refundRequestId) {
		this.refundRequestId = refundRequestId;
	}

}
