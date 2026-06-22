package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖订单退款
 *
 * @author auto create
 * @since 1.0, 2026-04-24 09:52:45
 */
public class AlipayCommerceResaleOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2214611426997934245L;

	/**
	 * 用户支付宝id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部退款流水号， 确保在订单粒度下全局唯一，重复输入会幂等返回
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 部分退款场景才需要传入
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 全额退款：FULL_REFUND，当前只支持全额退款
	 */
	@ApiField("refund_amount_type")
	private String refundAmountType;

	/**
	 * 备注
	 */
	@ApiField("refund_memo")
	private String refundMemo;

	/**
	 * 需要退款的发起支付的支付流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户支付宝id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundAmountType() {
		return this.refundAmountType;
	}
	public void setRefundAmountType(String refundAmountType) {
		this.refundAmountType = refundAmountType;
	}

	public String getRefundMemo() {
		return this.refundMemo;
	}
	public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
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
