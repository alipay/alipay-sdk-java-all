package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起退款
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:57
 */
public class AlipayEcoMycarOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8631588731627843381L;

	/**
	 * 退款交易编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款金额（单位：元）
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款请求编号，针对一笔退款需保证唯一
	 */
	@ApiField("req_no")
	private String reqNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getReqNo() {
		return this.reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

}
