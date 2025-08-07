package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请单申请状态
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:52:54
 */
public class OrderStatusData extends AlipayObject {

	private static final long serialVersionUID = 3369141538386736135L;

	/**
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 申请状态 AGREE、REJECT、EDIT、AUDIT
	 */
	@ApiField("status")
	private String status;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
