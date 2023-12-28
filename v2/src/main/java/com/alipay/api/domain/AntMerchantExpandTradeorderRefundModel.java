package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款
 *
 * @author auto create
 * @since 1.0, 2018-11-30 11:44:59
 */
public class AntMerchantExpandTradeorderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3632576452784541372L;

	/**
	 * 订单ID；订单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 退款理由
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
