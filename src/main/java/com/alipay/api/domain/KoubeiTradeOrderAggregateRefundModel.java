package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付退款接口
 *
 * @author auto create
 * @since 1.0, 2020-01-03 14:48:50
 */
public class KoubeiTradeOrderAggregateRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1458325815687836615L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 同一商户下必须唯一，用来控制幂等
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款金额  单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
