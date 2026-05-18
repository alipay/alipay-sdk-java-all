package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源公共充电退款信息通知
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:42:45
 */
public class AlipayCommerceTransportChargerPubapirefundNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1646646232643976818L;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单退款金额，单位：元，两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款订单号,调用方传入,调用方生成,确保唯一
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/**
	 * 订单的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款结果说明pending-退款中；success-退款成功；failed-退款失败；
	 */
	@ApiField("refund_result")
	private String refundResult;

	/**
	 * 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("refund_time")
	private String refundTime;

	/**
	 * 外部订单号
	 */
	@ApiField("start_charge_seq")
	private String startChargeSeq;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundOrderId() {
		return this.refundOrderId;
	}
	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundResult() {
		return this.refundResult;
	}
	public void setRefundResult(String refundResult) {
		this.refundResult = refundResult;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getStartChargeSeq() {
		return this.startChargeSeq;
	}
	public void setStartChargeSeq(String startChargeSeq) {
		this.startChargeSeq = startChargeSeq;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
