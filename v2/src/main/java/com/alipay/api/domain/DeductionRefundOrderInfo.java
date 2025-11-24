package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销订单退款明细
 *
 * @author auto create
 * @since 1.0, 2025-11-20 15:05:33
 */
public class DeductionRefundOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3197813981899694231L;

	/**
	 * 业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 退款流水号标识一次退款请求。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款面额，单位：分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款现金价值，单位：分
	 */
	@ApiField("refund_cash")
	private Long refundCash;

	/**
	 * 退款单id
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(Long refundCash) {
		this.refundCash = refundCash;
	}

	public String getRefundOrderId() {
		return this.refundOrderId;
	}
	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

}
