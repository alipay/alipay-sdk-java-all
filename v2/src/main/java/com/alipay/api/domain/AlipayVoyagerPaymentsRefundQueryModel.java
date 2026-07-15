package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager退款查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-14 10:50:53
 */
public class AlipayVoyagerPaymentsRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1816649754914926786L;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
