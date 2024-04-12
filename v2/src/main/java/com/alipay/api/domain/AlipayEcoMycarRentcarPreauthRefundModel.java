package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车预授权退款
 *
 * @author auto create
 * @since 1.0, 2024-03-12 15:21:19
 */
public class AlipayEcoMycarRentcarPreauthRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4535731985759216637L;

	/**
	 * 扣款时的外部交易号。一笔预授权可能有多笔扣款，退款是基于扣款去退的，因此要传扣款时的交易号
	 */
	@ApiField("deduct_out_trade_no")
	private String deductOutTradeNo;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款外部请求号，通过此字段对退款请求进行幂等控制
	 */
	@ApiField("refund_out_request_no")
	private String refundOutRequestNo;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeductOutTradeNo() {
		return this.deductOutTradeNo;
	}
	public void setDeductOutTradeNo(String deductOutTradeNo) {
		this.deductOutTradeNo = deductOutTradeNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getRefundOutRequestNo() {
		return this.refundOutRequestNo;
	}
	public void setRefundOutRequestNo(String refundOutRequestNo) {
		this.refundOutRequestNo = refundOutRequestNo;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
